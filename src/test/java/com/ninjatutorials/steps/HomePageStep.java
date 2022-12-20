package com.ninjatutorials.steps;

import com.ninjatutorials.pages.DesktopPage;
import com.ninjatutorials.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
  new HomePage().displayLogo();
    }

    @When("^I click on topmenu link$")
    public void iClickOnTopmenuLink() {
        new HomePage().selectMenu("Desktops");
        new HomePage().selectMenu("Laptops & Notebooks");
        new HomePage().selectMenu("Components");
        new HomePage().selectMenu("Tablets");
        new HomePage().selectMenu("Phones & PDAs");
        new HomePage().selectMenu("Cameras");
        new HomePage().selectMenu("MP3 Players");

    }

    @Then("^I should navigate to each topmenu link successfully$")
    public void iShouldNavigateToEachTopmenuLinkSuccessfully() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
        String expectedText1 = "Desktops";
        String actualText1 = new DesktopPage().getDesktopsText();
        org.junit.Assert.assertEquals("Text not Matched", expectedText1, actualText1);

        String expectedText3 = "Laptops & Notebooks";
        String actualText3 = new DesktopPage().getDesktopsText1();
        Assert.assertEquals("Text not Matched", expectedText3, actualText3);

        String expectedText2 = "Components";
        String actualText2 = new DesktopPage().getDesktopsText2();
        Assert.assertEquals("Text not Matched", expectedText2, actualText2);
    }

}
