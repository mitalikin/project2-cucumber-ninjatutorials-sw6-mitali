package com.ninjatutorials.pages;

import com.ninjatutorials.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
@CacheLookup
@FindBy
        (xpath = "//a[contains(text(),'Your Store')]")
WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/nav[1]/div[2]")
    List<WebElement> topMenu;

    @CacheLookup
    @FindBy
            (linkText = "Desktops")//h2[contains(text(),'Desktops')]
            WebElement desktopLink;


    @CacheLookup
    @FindBy
            (linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksLink;


    @CacheLookup
    @FindBy
            (linkText = "Components")
    WebElement componentsLinks;


    @CacheLookup
    @FindBy
            (xpath = "//span[contains(text(),'Currency')]")
    List<WebElement> currencyTab;

    @CacheLookup
    @FindBy
            (xpath = "//ul[@class = 'dropdown-menu']/li[2]")
    List<WebElement>  currencyList;


    @CacheLookup
    @FindBy
            (xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountTab;



    @CacheLookup
    @FindBy
            (xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    WebElement myAccountOptions;

public void displayLogo(){
    logo.isDisplayed();
}


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = topMenu;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenu;
        }
    }

    public void mouseHoverOnDesktopsLinkAndClick() {

        mouseHoverToElementAndClick(desktopLink);
    }

    public void mouseHoverOnLaptopsAndNotebooksLinkAndClick() {
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
    }

    public void mouseHoverOnComponentLinkAndClick() {
        mouseHoverToElementAndClick(componentsLinks);
    }

    @FindBy
            (xpath = "//span[contains(text(),'Currency')]")
    WebElement getCurrencyList;

    public void selectCurrency(String currency) {
        clickOnElement(getCurrencyList);
        List<WebElement> listOfElements = currencyList; //getListOfElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : listOfElements) {
            if (e.getText().equalsIgnoreCase(currency)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnMyQAccountTab() {
        myAccountTab.click();
        //clickOnElement(myAccountTab);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }
}



















