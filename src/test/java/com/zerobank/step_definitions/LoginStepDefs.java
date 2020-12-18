package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get ( ).get (ConfigurationReader.get ("url"));
    }

    @When("the user enter the valid credential and login")
    public void the_user_enter_the_valid_credential_and_login() {
        LoginPage loginPage = new LoginPage ( );
        loginPage.login (ConfigurationReader.get ("username"), ConfigurationReader.get ("password"));
    }

    @Then("the dashboard open and the title should be contain{string}")
    public void the_dashboard_open_and_the_title_should_be_contain(String string) {
        BrowserUtils.waitFor (3);
        Assert.assertEquals ("Zero - Account Summary", Driver.get ( ).getTitle ( ));
    }


    @When("the user logs in using {string} and {string}")
    public void user_logs_in_using_and(String user, String code) {
        LoginPage loginPage = new LoginPage ( );
        loginPage.userName.sendKeys (user);
        loginPage.password.sendKeys (code);
        loginPage.login (user, code);
    }

    @Then("the title should be contain{string}")
    public void the_title_should_contains(String expectedTitle) {
        BrowserUtils.waitFor (3);
        System.out.println ("expectedTitle = " + expectedTitle);
        Assert.assertTrue ("Actual title:" + Driver.get ( ).getTitle ( ), Driver.get ( ).getTitle ( ).contains (expectedTitle));

    }
    @When("Users enter blank username or password to login")
    public void users_enter_blank_username_or_password_to_login() {
        System.out.println ("Users with blank username or password tirs to login");
    }

    @Then("the user should not be able to login")
    public void the_user_should_not_be_able_to_login() {
        System.out.println ("the user should not be able to login");
    }



    @When("the user logs in using {string} and {string} and login")
    public void the_user_logs_in_using_and_and_login(String user, String code) {
        LoginPage loginPage = new LoginPage ( );
        loginPage.userName.sendKeys (user);
        loginPage.password.sendKeys (code);
        loginPage.login.click();

    }


    @When("user enter invalid information to login")
    public void user_enter_invalid_information_to_login() {
        System.out.println ("user tries to login with invalid information");
    }

    @Then("error message  Login id or password are wrong should be displayed")
    public void error_message_Login_id_or_password_are_wrong_should_be_displayed() {
        System.out.println ("error message Login id or password are wrong. should be displayed");
    }

    @When("the users enter wrong username or wrong password to login")
    public void the_users_enter_wrong_username_or_wrong_password_to_login() {
        System.out.println ("the users itner wrong username or wrong password");
    }

    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
        System.out.println ("user should not be able to login");
    }
}




