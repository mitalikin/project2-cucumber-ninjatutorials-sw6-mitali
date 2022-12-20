@component@regression
Feature: Component Test
  Scenario: verify User Should Navigate To Component page Successfully
    Given I am on homepage
    When I click on Component Tab
    And I mouseover and click on "Show All Components"
    Then I should navigate to Component Page