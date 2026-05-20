package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class BannerTests extends BaseTest {

	@Test
	public void verifyMarketingBannersAreDisplayed() {

		List<WebElement> banners = driver.findElements(By.tagName("img"));

		Assert.assertTrue(banners.size() > 0, "Marketing banners are not displayed.");
	}

	@Test
	public void verifyAppDownloadSectionExists() {

		String pageSource = driver.getPageSource().toLowerCase();

		Assert.assertTrue(
				pageSource.contains("app store") || pageSource.contains("google play")
						|| pageSource.contains("download") || pageSource.contains("mobile"),
				"App download section is missing.");
	}

	@Test
	public void verifyWhyMultiBankPageLoads() {

		driver.get("https://multibankfx.com/why-multibank-group/");

		String pageSource = driver.getPageSource();

		Assert.assertTrue(pageSource.contains("Why MultiBank") || pageSource.contains("MultiBank"),
				"Why MultiBank page content is missing.");
	}
}