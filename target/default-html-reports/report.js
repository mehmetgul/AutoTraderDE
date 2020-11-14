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
  "location": "MyStepdefs.userIsInLandingPage()"
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
  "location": "AdvancedSearchStepDefs.theUserClicksOnButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters 30004 in the Zip Code text box",
  "keyword": "And "
});
formatter.match({
  "location": "AdvancedSearchStepDefs.entersInTheZipCodeTextBox(int)"
});
