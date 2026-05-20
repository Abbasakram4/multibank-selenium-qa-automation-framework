package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class NavigationTests extends BaseTest {

	@Test
	public void verifyHomePageLoadsSuccessfully() {

		String currentUrl = driver.getCurrentUrl();

		Assert.assertTrue(currentUrl.contains("trade.mb.io"));
	}
}