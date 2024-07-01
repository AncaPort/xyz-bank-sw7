package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;

    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);
        log.info("click on add customer" + addCustomer.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement addName;

    public void addFirstName(String name) {
        sendTextToElement(addName, name);
        log.info("click on add name" + addName.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement addLastName;

    public void setAddLastName(String lastName) {
        sendTextToElement(addLastName, lastName);
        log.info("click on add name" + addLastName.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement addPost;

    public void enterPostCode(String postCode) {
        sendTextToElement(addPost, postCode);
        log.info("click on add postcode" + addPost.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton;

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerButton);
        log.info("click on add button " + addCustomerButton.toString());
    }

    // verify the message in popup Alert
    public String verifyMessageInPopupWindow() {
        return getTextFromAlert();
    }

    //	popup display
    public void popupDisplay() {
        switchToAlert();
    }

    public void clickOnOkButtInPopup() {
        switchToAcceptAlert();
    }

    public String getAlertSuccessText() {
        return getTextFromAlert();
    }
}
