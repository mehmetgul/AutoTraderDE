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
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects the \"Convertible\" check box under \"Style\"",
  "keyword": "And "
});
formatter.match({
  "location": "AdvancedSearchStepDefs.selectsTheCheckBoxUnder(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects year \"From\" 2017 \"To\" 2020",
  "keyword": "And "
});
formatter.match({
  "location": "AdvancedSearchStepDefs.selectsYear(String,int,String,int)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: 2017\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CHE-PC\u0027, ip: \u0027192.168.0.171\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u002712.0.2\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.findOptionsByValue(Select.java:283)\r\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:186)\r\n\tat com.autotrader.searchSteps.AdvancedSearchStepDefs.selectsYear(AdvancedSearchStepDefs.java:32)\r\n\tat ✽.selects year \"From\" 2017 \"To\" 2020(file:src/test/resources/features/advancedSearch.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "selects \"BMW\" under \"Any Make\" from \"Make, Model \u0026 Trim\"",
  "keyword": "And "
});
formatter.match({
  "location": "AdvancedSearchStepDefs.selectsUnderFrom(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks \"Search\" button",
  "keyword": "And "
});
formatter.match({
  "location": "AdvancedSearchStepDefs.clicksButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "gets search results",
  "keyword": "Then "
});
formatter.match({
  "location": "AdvancedSearchStepDefs.getsSearchResults()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});