package org.example.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.example.BaseTest.driver;

public class LoginScreen {
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type=submit]");
    private String url = "https://the-internet.herokuapp.com/login";
    private By loginErrorMessage = By.xpath("//div[@class='flash error']");



    public LoginScreen() {
    }

    public void verifyScreen() {
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    public void fillUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void fillPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public void validateErrorMessage() {
        Assert.assertTrue(driver.findElement(loginErrorMessage).isDisplayed());
    }
}
