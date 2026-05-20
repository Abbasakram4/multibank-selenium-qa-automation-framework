package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class TradingTests extends BaseTest {

    @Test
    public void verifySpotTradingSectionDisplaysTradingPairs() {

        List<WebElement> tradingPairs = driver.findElements(
                By.xpath("//*[contains(text(),'BTC') or contains(text(),'ETH')]"));

        Assert.assertTrue(tradingPairs.size() > 0,
                "Trading pairs are not displayed.");
    }

    @Test
    public void verifyTradingCategoriesAreVisible() {

        List<WebElement> categories = driver.findElements(
                By.xpath("//*[contains(text(),'USDT') or contains(text(),'Spot')]"));

        Assert.assertTrue(categories.size() > 0,
                "Trading categories are not visible.");
    }

    @Test
    public void verifyTradingDataFieldsExist() {

        List<WebElement> priceFields = driver.findElements(
                By.xpath("//*[contains(text(),'Price') or contains(text(),'24h')]"));

        Assert.assertTrue(priceFields.size() > 0,
                "Expected trading data fields are missing.");
    }
}