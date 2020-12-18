package com.zerobank.pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import com.zerobank.utilities.Driver;

import java.security.PublicKey;

public class AccountSummaryPage extends BasePage {

/*
Account summary page should have the title Zero – Account summary. Account summary page should have to
        following account types: Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts.
        Credit Accounts table must have columns Account, Credit Card and Balance.

*/

    @FindBy(xpath = "//h2[text()='Cash Accounts']")
    public WebElement Cash_Accounts;

    @FindBy(xpath = "//h2[text()='Investment Accounts']")
    public WebElement Investment_Accounts;

    @FindBy(xpath = "//h2[text()='Credit Accounts']")
    public WebElement Credit_Accounts;

    @FindBy(xpath = "//h2[text()='Loan Accounts']")
    public WebElement Loan_Accounts;

    @FindBy(xpath = "(//*[text()='Account'])[3]")
    public WebElement Columns_Account;

    @FindBy(css = "(//*[text()='Credit Card'])[1]")
    public WebElement Credit_Card;

    @FindBy(css = "(//*[text()='Balance'])[3]")
    public WebElement Balanc;


    String curranturl = Driver.get ( ).getCurrentUrl ( );
    String expUrl = "http://zero.webappsecurity.com/bank/account-summary.html";

    public String getExpUrl() {
        return expUrl;
    }

}
