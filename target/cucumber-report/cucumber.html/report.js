$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desktop.feature");
formatter.feature({
  "line": 2,
  "name": "Desktop page test",
  "description": "As user I want to navigate to Desktop page on  Ninja Tutorials website",
  "id": "desktop-page-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Desktop"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 18120395300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can verify Product Arrange In Alphabetical Order",
  "description": "",
  "id": "desktop-page-test;user-can-verify-product-arrange-in-alphabetical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select Currency in Pound",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I mouseHoverOnDesktopsLinkAndClick",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select \"Show All Desktops\" from topmenu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Get all the products name and stored into array list",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 951929100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStep.iSelectCurrencyInPound()"
});
formatter.result({
  "duration": 1596079100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStep.iMouseHoverOnDesktopsLinkAndClick()"
});
formatter.result({
  "duration": 5330933600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 10
    }
  ],
  "location": "DesktopStep.iSelectFromTopmenu(String)"
});
formatter.result({
  "duration": 6418953700,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStep.getAllTheProductsNameAndStoredIntoArrayList()"
});
formatter.result({
  "duration": 461712800,
  "status": "passed"
});
formatter.after({
  "duration": 1060125700,
  "status": "passed"
});
formatter.before({
  "duration": 6624629300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "verify Product Added To ShoppingCart SuccessFully",
  "description": "",
  "id": "desktop-page-test;verify-product-added-to-shoppingcart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I mouseHoverOnDesktopsLinkAndClick",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I select \"Show All Desktops\" from topmenu",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select sort by \"Name (A - Z)\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "selectProductByName \"HP LP3065\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify text \"HP LP3065\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Select Delivery Date \"2022-11-30\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Enter Qty \"1” using Select class.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on “Add to Cart” button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify the Message Product has been added",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Click on link “shopping cart” display into success message",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Verify the text \"Shopping Cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the Product name \"HP LP3065\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Verify the Delivery Date \"2022-11-30\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify the Model \"Product21\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify the Total \"£74.73\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 435626500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStep.iMouseHoverOnDesktopsLinkAndClick()"
});
formatter.result({
  "duration": 863746000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 10
    }
  ],
  "location": "DesktopStep.iSelectFromTopmenu(String)"
});
formatter.result({
  "duration": 2788925800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (A - Z)",
      "offset": 16
    }
  ],
  "location": "DesktopStep.selectSortBy(String)"
});
formatter.result({
  "duration": 1203051200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 21
    }
  ],
  "location": "DesktopStep.selectproductbyname(String)"
});
formatter.result({
  "duration": 2876865000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 13
    }
  ],
  "location": "DesktopStep.verifyText(String)"
});
formatter.result({
  "duration": 1097604200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022-11-30",
      "offset": 22
    }
  ],
  "location": "DesktopStep.selectDeliveryDate(String)"
});
formatter.result({
  "duration": 22704814500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 11
    }
  ],
  "location": "DesktopStep.enterQtyUsingSelectClass(int)"
});
formatter.result({
  "duration": 381051900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStep.clickOnAddToCartButton()"
});
formatter.result({
  "duration": 225504300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStep.verifyTheMessageProductHasBeenAdded()"
});
formatter.result({
  "duration": 395838500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStep.clickOnLinkShoppingCartDisplayIntoSuccessMessage()"
});
formatter.result({
  "duration": 555416700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping Cart",
      "offset": 17
    }
  ],
  "location": "DesktopStep.verifyTheText(String)"
});
formatter.result({
  "duration": 174621700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 25
    }
  ],
  "location": "DesktopStep.verifyTheProductName(String)"
});
formatter.result({
  "duration": 100083700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022-11-30",
      "offset": 26
    }
  ],
  "location": "DesktopStep.verifyTheDeliveryDate(String)"
});
formatter.result({
  "duration": 119560800,
  "error_message": "org.junit.ComparisonFailure: Text not disply expected:\u003c[2022]-11-30\u003e but was:\u003c[Delivery Date: 2023]-11-30\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.ninjatutorials.steps.DesktopStep.verifyTheDeliveryDate(DesktopStep.java:109)\r\n\tat ✽.And Verify the Delivery Date \"2022-11-30\"(desktop.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Product21",
      "offset": 18
    }
  ],
  "location": "DesktopStep.verifyTheModel(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "£74.73",
      "offset": 18
    }
  ],
  "location": "DesktopStep.verifyTheTotal(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4404290900,
  "status": "passed"
});
});