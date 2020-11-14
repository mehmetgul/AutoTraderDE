
  Feature: Advanced Search

    Background:
      Given User is in landing page

      Scenario: Happy path
        When the user clicks on "Advanced Search" button
        And enters 30004 in the Zip Code text box
        And selects the "Convertible" check box under "Style"
        And selects year "From" 2017 "To" 2020
        And selects "BMW" under "Any Make" from "Make, Model & Trim"
        And clicks "Search" button
        Then gets search results
