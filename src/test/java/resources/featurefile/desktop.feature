@Desktop@regression
Feature: Desktop page test
  As user I want to navigate to Desktop page on  Ninja Tutorials website
@sanity
  Scenario: User can verify Product Arrange In Alphabetical Order
    Given  I am on homepage
    When I select Currency in Pound
    And I mouseHoverOnDesktopsLinkAndClick
    And I select "Show All Desktops" from topmenu
    And  Get all the products name and stored into array list
@smoke
Scenario: verify Product Added To ShoppingCart SuccessFully
  Given  I am on homepage
  When I mouseHoverOnDesktopsLinkAndClick
  And I select "Show All Desktops" from topmenu
  And Select sort by "Name (A - Z)"
  And selectProductByName "HP LP3065"
  And verify text "HP LP3065"
  And Select Delivery Date "2022-11-30"
  And Enter Qty "1” using Select class.
  And Click on “Add to Cart” button
  And Verify the Message Product has been added
  And Click on link “shopping cart” display into success message
  And Verify the text "Shopping Cart"
  And Verify the Product name "HP LP3065"
  And Verify the Delivery Date "2022-11-30"
  And Verify the Model "Product21"
  Then Verify the Total "£74.73"