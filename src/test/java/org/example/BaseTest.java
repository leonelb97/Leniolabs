package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    @BeforeTest
    @Parameters({"url"})
    public void setUp(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get(url);
        System.out.println("Browser setup completed. Navigated to: " + url);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
