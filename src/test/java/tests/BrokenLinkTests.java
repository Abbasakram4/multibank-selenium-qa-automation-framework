package tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class BrokenLinkTests extends BaseTest {

    @Test
    public void verifyNavigationLinksAreNotBroken() {

        List<WebElement> links = driver.findElements(By.tagName("a"));

        int brokenLinksCount = 0;

        for (WebElement link : links) {

            String href = link.getAttribute("href");

            if (href == null || href.isEmpty()) {
                continue;
            }

            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(href).openConnection();
                connection.setRequestMethod("HEAD");
                connection.setConnectTimeout((int) Duration.ofSeconds(10).toMillis());
                connection.setReadTimeout((int) Duration.ofSeconds(10).toMillis());
                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("Broken Link: " + href + " | Status Code: " + responseCode);
                    brokenLinksCount++;
                }

            } catch (Exception e) {
                System.out.println("Exception for URL: " + href + " | Error: " + e.getMessage());
                brokenLinksCount++;
            }
        }

        Assert.assertEquals(brokenLinksCount, 0, "Broken links found on the page.");
    }
}