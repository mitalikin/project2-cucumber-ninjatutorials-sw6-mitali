package com.ninjatutorials.pages;

import com.ninjatutorials.utility.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage extends Utility {
    public AccountLoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy

            (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h2[1]")
    WebElement returningCustomerText;


    @FindBy
            (xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy
            (id = "input-email")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy
            (id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy
            (xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;


    public String getReturningCustomerText() {
        return getTextFromElement(returningCustomerText);

    }

    public String getNewCustomerText() {
        return getTextFromElement(newCustomerText);
    }

    public void enterEmailAddress(String email) {
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }


}
