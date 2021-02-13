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
formatter.uri("file:src/test/resources/features/search.feature");
formatter.feature({
  "name": "",
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
  "location": "com.autotrader.searchSteps.MyStepdefs.userIsInLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that \"Browse by Make\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.MyStepdefs.verifyThatIsPresent(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[contains(text(),\u0027Browse by Make\u0027)]\"}\n  (Session info: chrome\u003d88.0.4324.150)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CHE-PC\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\Che\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:61695}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 524c5f304817636ce08b4c525f583296\n*** Element info: {Using\u003dxpath, value\u003d//button[contains(text(),\u0027Browse by Make\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.getText(Unknown Source)\r\n\tat com.autotrader.seachPages.AdvancePage.verification(AdvancePage.java:67)\r\n\tat com.autotrader.searchSteps.MyStepdefs.verifyThatIsPresent(MyStepdefs.java:63)\r\n\tat ✽.Verify that \"Browse by Make\" is present(file:///E:/AutoTraderDE/src/test/resources/features/search.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify that \"Browse by Style\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.MyStepdefs.verifyThatIsPresent(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that \"Advanced Search\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.MyStepdefs.verifyThatIsPresent(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that search Button is present",
  "keyword": "And "
});
formatter.match({
  "location": "com.autotrader.searchSteps.MyStepdefs.verifyThatSearchButtonIsPresent()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that \"Any Make\" and \"Any Model\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.MyStepdefs.verifyThatAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User checks the Advance search link",
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
  "name": "User click Advance Search link on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.userClickAdvanceSearchlinkOnTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"30004\" in the zip code text box",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.user_enter_in_the_zip_code_text_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select \"Certified\" check box under \"Condition\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.user_select_check_box_under(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select \"Convertible\" check box under \"Style\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.user_select_check_box_under(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user update Year \"2017\" to \"2020\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.user_update_Year_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select \"BMW\" car from Make,Model and Trim section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.user_select_car_from_Make_Model_and_Trim_section(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.user_clicks_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that he is in result page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.user_verifies_that_he_is_in_result_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that he sees only \"BMW\" cars in listing",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.user_verifies_that_he_sees_only_cars_in_listing(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Display in console, the number of cars listed in result page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.searchSteps.AdvanceSearchSteps.display_in_console_the_number_of_cars_listed_in_result_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});