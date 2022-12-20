package com.ninjatutorials.steps;

import com.ninjatutorials.pages.DesktopPage;
import com.ninjatutorials.pages.HomePage;
import com.ninjatutorials.pages.ProductPage;
import com.ninjatutorials.pages.ShoppingCartPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DesktopStep {
    @When("^I select Currency in Pound$")
    public void iSelectCurrencyInPound() {
        new HomePage().selectCurrency("£ Pound Sterling");
    }

    @And("^I mouseHoverOnDesktopsLinkAndClick$")
    public void iMouseHoverOnDesktopsLinkAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("^I select \"([^\"]*)\" from topmenu$")
    public void iSelectFromTopmenu(String text) {
        new DesktopPage().setShowAllDesktop();

    }

    @And("^Get all the products name and stored into array list$")
    public void getAllTheProductsNameAndStoredIntoArrayList() {
        new DesktopPage().getProductsNameList();
    }

    @And("^Select sort by \"([^\"]*)\"$")
    public void selectSortBy(String arg0) {
        new DesktopPage().selectSortByOption("Name (A - Z)");
    }


    @And("^selectProductByName \"([^\"]*)\"$")
    public void selectproductbyname(String text) {
        new DesktopPage().selectProductByName(text);
    }

    @And("^verify text \"([^\"]*)\"$")
    public void verifyText(String text) {
       // String expectedMessage1 = "HP LP3065";
        String actualMessage1 = new ProductPage().getProductText();
        Assert.assertEquals("HP LP3065 Product not display", text, actualMessage1);

    }


    @And("^Select Delivery Date \"([^\"]*)\"$")
    public void selectDeliveryDate(String arg0)  {
        new ProductPage().selectDeliveryDate("30", "November", "2023");
    }

    @And("^Enter Qty \"(\\d+)” using Select class\\.$")
    public void enterQtyUsingSelectClass(int text)  {
        new ProductPage().enterQuantity("1");
    }

    @And("^Click on “Add to Cart” button$")
    public void clickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();

    }
    @And("^Verify the Message Product has been added$")
    public void verifyTheMessageProductHasBeenAdded() {
        String expectedMessage2 = "Success: You have added HP LP3065 to your shopping cart!\n" +
              "×";
       String actualMessage1 = new ProductPage().getProductAddedSuccessMessage();
        Assert.assertEquals("HP LP3065 Product not added to cart",expectedMessage2 , actualMessage1);

    }

    @And("^Click on link “shopping cart” display into success message$")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }
    @And("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String text) {
        String expectedMessage6 = "Shopping Cart  (1.00kg)";
        String actualMessage6 = new ShoppingCartPage().getShoppingCartText();
      Assert.assertEquals("Text not disply",expectedMessage6 , actualMessage6);
    }

//    @And("^Verify the text \"([^\"]*)\"$")//String text
//    public void verifyTheText()  {
//      String expectedMessage4 = "Shopping Cart  (1.00kg)";
//      String actualMessage = new ShoppingCartPage().getShoppingCartText();
//        Assert.assertEquals("Text not disply",expectedMessage4 , actualMessage);
//    }


    @And("^Verify the Product name \"([^\"]*)\"$")
    public void verifyTheProductName(String text) {
      //  String expectedMessage4 = "HP LP3065";
        String actualMessage5 = new ShoppingCartPage().getProductName();
        Assert.assertEquals("Text not disply",text , actualMessage5);
    }

    @And("^Verify the Delivery Date \"([^\"]*)\"$")
    public void verifyTheDeliveryDate(String text) throws Throwable {
     //   String expectedMessage = "2023-11-30";
        String actualMessage6 = new ShoppingCartPage().getDeliveryDate();
        Assert.assertEquals("Text not disply",text , actualMessage6);
    }

    @And("^Verify the Model \"([^\"]*)\"$")
    public void verifyTheModel(String text) {
      //  String expectedMessage = "Product 21";
        String actualMessage7 = new ShoppingCartPage().getModel();
        Assert.assertEquals("Text not disply",text , actualMessage7);
    }

    @Then("^Verify the Total \"([^\"]*)\"$")
    public void verifyTheTotal(String text) {
       // String expectedMessage = "£74.73";
        String actualMessage8 = new ShoppingCartPage().getTotal();
        Assert.assertEquals("Text not disply",text , actualMessage8);
    }


}
