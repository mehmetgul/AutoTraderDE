$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/search.feature");
formatter.feature({
  "name": "Main page elements verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "User verifies the search feature in Autotrader",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
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
formatter.step({
  "name": "Verify that \"Browse by Make\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.verifyThatIsPresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that \"Browse by Style\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.verifyThatIsPresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that \"Advanced Search\" button is present",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.verifyThatButtonIsPresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that search Button is present",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.verifyThatSearchButtonIsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that \"Any Make\" and \"Any Model\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.verifyThatAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});