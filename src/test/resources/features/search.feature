Feature:

  Scenario: User verifies the search feature in Autotrader
    Given User is in landing page
    Then Verify that "Browse by Make" is present
    Then Verify that "Browse by Style" is present
    Then Verify that "Advanced Search" is present
    And Verify that search Button is present
    Then Verify that "Any Make" and "Any Model"

  Scenario: User checks the Advance search link
    Given User click Advance Search link on the home page
    Then User enter "30004" in the zip code text box
    Then User select "Certified" check box under "Condition"
    Then User select "Convertible" check box under "Style"
    Then user update Year "2017" to "2020"
    Then user select "BMW" car from Make,Model and Trim section
    Then User clicks Search button
    Then User verifies that he is in result page
    Then User verifies that he sees only "BMW" cars in listing
    Then Display in console, the number of cars listed in result page