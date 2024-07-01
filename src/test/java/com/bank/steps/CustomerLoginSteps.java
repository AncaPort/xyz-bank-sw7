package com.bank.steps;

import com.bank.pages.AccountPage;
import com.bank.pages.CustomerLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CustomerLoginSteps {
    @Given("I click on Customer Login Tab")
    public void iClickOnCustomerLoginTab() {
        new CustomerLoginPage().clickOnCustomerLogin();
    }

    @And("I Search customer that is created")
    public void iSearchCustomerThatIsCreated() {
        new CustomerLoginPage().searchCustomerField();
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("I should verify Logout Tab displayed.")
    public void iShouldVerifyLogoutTabDisplayed() {
        new CustomerLoginPage().verifyLogOut();
    }

    @And("I click on Logout")
    public void iClickOnLogout() {
        new CustomerLoginPage().clickOnLogOut();
    }

    @Then("I should verify Name text displayed.")
    public void iShouldVerifyNameTextDisplayed() {
        new CustomerLoginPage().verifyName();
    }

    @And("I click on Deposit Tab")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositeTab();
    }

    @Then("I Enter amount {string}")
    public void iEnterAmount(String amt) {
        new AccountPage().enter100InAmountField();
    }

    @And("I click on Deposit Button")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositeButton();
    }

    @Then("I should verify message Deposit Successful")
    public void iShouldVerifyMessageDepositSuccessful() {
        Assert.assertEquals(new AccountPage().verifyDepositTransactionSuccessful(), "Deposit Successful", "Deposit success msg not displayed");
    }

    @And("I click on Withdrawl Tab")
    public void iClickOnWithdrawlTab() {
        new AccountPage().ClickOnWithdrawTab();
    }

    @Then("I Enter Withdrawl amount {string}")
    public void iEnterWithdrawlAmount(String arg0) {
        new AccountPage().enterAmountInWithdrawField();
    }

    @And("I click on Withdraw Button")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickOnWithdrawButton();
    }

    @Then("I should verify message Transaction successful")
    public void iShouldVerifyMessageTransactionSuccessful() {
        Assert.assertEquals(new AccountPage().verifywithdrawlTransactionSuccessful(), "Transaction successful", "Withdraw success msg not displayed");
    }


}
