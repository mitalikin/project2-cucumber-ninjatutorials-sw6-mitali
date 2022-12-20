package com.ninjatutorials.pages;

import com.aventstack.extentreports.Status;
import com.ninjatutorials.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy
            (xpath = "//div[@id = 'content']//h1")
    WebElement productText;
    @CacheLookup
    @FindBy
            (xpath = "//div[@class = 'input-group date']//button")
    WebElement calendarButton;
    @CacheLookup
    @FindBy
            (xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthAndYearText;
    @CacheLookup
    @FindBy
            (xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement nextButton;
    @CacheLookup
    @FindBy
            (xpath = "//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
    List<WebElement> dateList;
    // WebElement dateList;
    @CacheLookup
    @FindBy
            (id = "input-quantity")
    WebElement qtyField;
    @CacheLookup
    @FindBy
            (xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy
          //  (xpath = "//body/div[@id='product-product']/div[1]")
           (css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    @CacheLookup
    @FindBy
            (xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy
            (xpath = "//div[@class = 'input-group date']//button")
    WebElement datePicker;


    public String getProductText() {

        return getTextFromElement(productText);
    }

    public void selectDeliveryDate(String day, String month, String year) {
        clickOnElement(datePicker);
        while (true) {
            String monthAndYear = getTextFromElement(monthAndYearText);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextButton);
            }
        }
        List<WebElement> allDates = dateList;//getListOfElements((By) dateList);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(day)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnAddToCartButton() {

        clickOnElement(addToCartButton);
    }

    public String getProductAddedSuccessMessage() {

        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartLinkIntoMessage() {

        clickOnElement(shoppingCartLink);
    }

    public void enterQuantity(String qty) {
      qtyField.clear();
     //   clearTextOnElement(qtyField);
        sendTextToElement(qtyField, qty);
    }


}
