package com.ninjatutorials.steps;

import com.ninjatutorials.pages.ComponentsPage;
import com.ninjatutorials.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComponentStep {
    @When("^I click on Component Tab$")
    public void iClickOnComponentTab() {
        new HomePage().mouseHoverOnComponentLinkAndClick();
    }
    @And("^I mouseover and click on \"([^\"]*)\"$")
    public void iMouseoverAndClickOn(String text)  {
        new HomePage().selectMenu("Show All Components");
    }
    @Then("^I should navigate to Component Page$")
    public void iShouldNavigateToComponentPage() {
    }


}
