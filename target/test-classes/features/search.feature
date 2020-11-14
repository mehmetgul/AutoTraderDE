@wip
Feature: Main page elements verification

  Scenario: User verifies the search feature in Autotrader
    Given User is in landing page
    Then Verify that "Browse by Make" is present
    Then Verify that "Browse by Style" is present
    Then Verify that "Advanced Search" button is present
    And Verify that search Button is present
    Then Verify that "Any Make" and "Any Model"
