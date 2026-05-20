package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class InvalidRouteTests extends BaseTest {

    @Test
    public void verifyInvalidRouteHandling() {

        driver.get("https://trade.mb.io/invalid-test-route-404");

        String pageSource = driver.getPageSource().toLowerCase();
        String currentUrl = driver.getCurrentUrl();

        boolean isHandled =
                pageSource.contains("404") ||
                pageSource.contains("not found") ||
                pageSource.contains("page not found") ||
                currentUrl.contains("404") ||
                currentUrl.contains("not-found");

        Assert.assertTrue(isHandled, "Invalid route is not handled properly.");
    }
}