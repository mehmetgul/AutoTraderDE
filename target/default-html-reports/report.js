$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/advancedSearch.feature");
formatter.feature({
  "name": "Advanced Search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.autotrader.searchSteps.MyStepdefs.userIsInLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Happy path",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Advanced Search\" button",
  "keyword": "When "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvancedSearchStepDefs.theUserClicksOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters 30004 in the Zip Code text box",
  "keyword": "And "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvancedSearchStepDefs.entersInTheZipCodeTextBox(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects the \"Convertible\" check box under \"Style\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvancedSearchStepDefs.selectsTheCheckBoxUnder(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects year \"From\" 2017 \"To\" 2020",
  "keyword": "And "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvancedSearchStepDefs.selectsYear(java.lang.String,int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects \"BMW\" under \"Any Make\" from \"Make, Model \u0026 Trim\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvancedSearchStepDefs.selectsUnderFrom(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks \"Search\" button",
  "keyword": "And "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvancedSearchStepDefs.clicksButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gets search results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvancedSearchStepDefs.getsSearchResults()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});