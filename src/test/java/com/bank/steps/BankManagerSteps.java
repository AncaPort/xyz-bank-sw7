package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.OpenAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BankManagerSteps {
    @Given("I click on Bank Manager Login Tab")
    public void iClickOnBankManagerLoginTab() {
        new BankManagerLoginPage().clickManagerLogin();
    }

    @When("I click on Add Customer Tab")
    public void iClickOnAddCustomerTab() {
        new AddCustomerPage().clickOnAddCustomer();
    }

    @And("I enter FirstName {string}")
    public void iEnterFirstName(String fName) {
        new AddCustomerPage().addFirstName("Prime");
    }

    @And("I enter LastName {string}")
    public void iEnterLastName(String lName) {
        new AddCustomerPage().setAddLastName("Testing");
    }

    @And("I enter PostCode {string}")
    public void iEnterPostCode(String pCode) {
        new AddCustomerPage().enterPostCode("NW8 7SN");
    }

    @And("I click on Add Customer Button")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("I Should verify Message customer added Successfully")
    public void iShouldVerifyMessageCustomerAddedSuccessfully() {
        Assert.assertEquals(new AddCustomerPage().verifyMessageInPopupWindow().substring(0,27),"Customer added successfully");
    }

    @Then("I click on ok button on popup")
    public void iClickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnOkButtInPopup();
    }

    @When("I click on Open Account Tab")
    public void iClickOnOpenAccountTab() {
        new OpenAccountPage().clickOnOpenAccountTab();
    }

    @And("I Search Customer that is created first")
    public void iSearchCustomerThatIsCreatedFirst() {
        new OpenAccountPage().selectCustomerCreatedFromDropDownList();
    }

    @And("I select currency pound")
    public void iSelectCurrencyPound() {
        new OpenAccountPage().selectCurrencyFromDropDownList();
    }

    @And("I click on process button")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @And("I should verify Account created successfully")
    public void iShouldVerifyAccountCreatedSuccessfully() {
        Assert.assertEquals(new AddCustomerPage().getAlertSuccessText().substring(0,28),"Account created successfully");
    }
}
