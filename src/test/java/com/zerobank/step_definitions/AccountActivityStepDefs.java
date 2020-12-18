package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
//import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.util.List;
public class AccountActivityStepDefs {


    @When("the page title should be {string}")
    public void the_page_title_should_be(String string) {
        System.out.println ("expecte url VS currant url" );
    }
    @Given("the user navigates to {string} Page")
    public void the_user_navigates_to_Page(String tabName) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        accountActivityPage.navigateToTab(tabName);
        BrowserUtils.waitFor(3);
    }
    @When("account dropdown default option should be {string}")
    public void account_dropdown_default_option_should_be(String expFirstOption) {
        WebElement element = new AccountActivityPage().dropdownMenu;
        Select accountList=new Select(element);
        String actualFirstOption= accountList.getFirstSelectedOption().getText();
        Assert.assertEquals(expFirstOption,actualFirstOption);
        System.out.println("Exp:" + expFirstOption);
        System.out.println("Act:" + actualFirstOption);
    }
    @Then("dropdown should have following option")
    public void dropdown_should_have_following_option(List<String> expDropdownOptions) {
        WebElement element = new AccountActivityPage().dropdownMenu;
        Select accountList=new Select(element);
        List<String> actDropdownOptions = BrowserUtils.getElementsText(accountList.getOptions());
        Assert.assertEquals(expDropdownOptions,actDropdownOptions);
        System.out.println("Exp:" +expDropdownOptions);
        System.out.println("Act:" +actDropdownOptions);
    }
    @When("Transaction table should have the following columns")
    public void transaction_table_should_have_the_following_columns(List<String> expTableColumns) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        List<String> actualTableColumns=BrowserUtils.getElementsText(accountActivityPage.TransactionTableColumns);
        System.out.println("Act:" + actualTableColumns);
        System.out.println("Exp:" + expTableColumns);
        Assert.assertEquals(expTableColumns,actualTableColumns);
    }
}