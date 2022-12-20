package com.ninjatutorials.pages;


import com.ninjatutorials.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy
            (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
    WebElement desktop;
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
            (xpath = "//a[contains(text(),'Show All Desktops')]")
    WebElement showAllDesktop;
@CacheLookup
    @FindBy
            (linkText = "Desktops")//h2[contains(text(),'Desktops')]
            WebElement desktopsText;

    @CacheLookup
   @FindBy
           (xpath = "//h4/a")
        //WebElement productsList;
   List<WebElement> productsList;

   @FindBy
           (id = "input-sort")
   WebElement sortBy;

public void setShowAllDesktop(){
    mouseHoverToElementAndClick(showAllDesktop);
}

    public String getDesktopsText() {
        return getTextFromElement(desktopsText);
    }
    public String getDesktopsText1() {
        return getTextFromElement(laptopsAndNotebooksLink);
    }
    public String getDesktopsText2() {
        return getTextFromElement(componentsLinks);
    }
    public ArrayList<String> getProductsNameList() {
        List<WebElement> products =productsList;// getListOfElements((By) productsList);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }
    public void selectProductByName(String product) {
        List<WebElement> products = productsList;//getListOfElements((By) productsList);
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }

    public void selectSortByOption(String option) {
        selectByVisibleTextFromDropDown(sortBy, option);
    }








}
