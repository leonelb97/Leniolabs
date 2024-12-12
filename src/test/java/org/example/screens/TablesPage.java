package org.example.screens;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BaseTest.driver;

public class TablesPage     {
    private By lastNameSortField = By.className("header");
    private By tableFields = By.tagName("td");

    public void clickLastNameSort () {
        driver.findElement(lastNameSortField).click();
    }

    public void verifySortChange() {
        String firstLastName = driver.findElement(tableFields).getText();
        clickLastNameSort();
        Assert.assertNotEquals(firstLastName, driver.findElement(tableFields).getText());
    }
}
