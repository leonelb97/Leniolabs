package org.example.tests;

import org.example.BaseTest;
import org.example.screens.HomeScreen;
import org.example.screens.LoginScreen;
import org.testng.annotations.Test;

public class InterviewTest extends BaseTest {

    @Test
    public void verifyLoginSuccess() {
        String username = "tomsmith";
        String password = "SuperSecretPassword!";

        LoginScreen login = new LoginScreen();
        login.verifyScreen();
        login.fillUsername(username);
        login.fillPassword(password);
        login.clickLoginButton();
        HomeScreen home = new HomeScreen();
        home.verifyHomePage();
    }

    @Test
    public void verifyLoginFailure() {
        String username = "tomsmith";
        String password = "sadasd!";

        LoginScreen login = new LoginScreen();
        login.verifyScreen();
        login.fillUsername(username);
        login.fillPassword(password);
        login.clickLoginButton();
        login.validateErrorMessage();
    }

}
