package org.example.screens;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BaseTest.driver;

public class HomeScreen {
    private String homePageUrl = "https://the-internet.herokuapp.com/secure";
    private By loginMessage = By.xpath("//div[@class='flash success']");
    private String logginText = "You logged into a secure area";

    public HomeScreen () {
    }

    public void verifyHomePage() {
        Assert.assertEquals(driver.getCurrentUrl(), homePageUrl);
        Assert.assertTrue(driver.findElement(loginMessage).getText().contains(logginText));
    }
}
