package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css = "#login_form >div")
    public WebElement loginErrorMessage;

    @FindBy(id="user_login")
    public WebElement userName;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement login;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        login.click();
        // verification that we logged
    }


}
