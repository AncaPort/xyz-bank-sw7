package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccount;

    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement selectCustomerCreated;

    @CacheLookup
    @FindBy(id = "currency")
    WebElement selectCurrency;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcessBtn;

    public void clickOnOpenAccountTab() {
        clickOnElement(openAccount);
        log.info("click on open account" + openAccount.toString());
    }

    public void selectCustomerCreatedFromDropDownList() {
        selectByVisibleTextFromDropDown(selectCustomerCreated, "Hermoine Granger");
        log.info("Select customer" + selectCustomerCreated.toString());
    }

    public void selectCurrencyFromDropDownList() {
        selectByVisibleTextFromDropDown(selectCurrency, "Pound");
        log.info("Select currency" + selectCurrency.toString());
    }

    public void clickOnProcessButton() {
        clickOnElement(clickOnProcessBtn);
        log.info("click on button " + clickOnProcessBtn.toString());
    }
}
