$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stepDefinitionFile/dailyRoutine.feature");
formatter.feature({
  "line": 1,
  "name": "Search for keywords via Global Sitesearch",
  "description": "\r\nIn order to find an article\r\nAs a customer\r\nI want to search in the sitesearch to find direct matches and related tagged articles",
  "id": "search-for-keywords-via-global-sitesearch",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Using a search term that is a direct match",
  "description": "",
  "id": "search-for-keywords-via-global-sitesearch;using-a-search-term-that-is-a-direct-match",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tester"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am accessing the site using ChromeDriver",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search for at the alb",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the article will appear in the search results",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ChromeDriver",
      "offset": 30
    }
  ],
  "location": "SiteSearchSearchTerms.invokeWebDriver(String)"
});
formatter.result({
  "duration": 2806432433,
  "error_message": "java.lang.IllegalAccessError: tried to access method com.google.common.util.concurrent.SimpleTimeLimiter.\u003cinit\u003e(Ljava/util/concurrent/ExecutorService;)V from class org.openqa.selenium.net.UrlChecker\r\n\tat org.openqa.selenium.net.UrlChecker.\u003cinit\u003e(UrlChecker.java:67)\r\n\tat org.openqa.selenium.remote.service.DriverService.waitUntilAvailable(DriverService.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverService.start(DriverService.java:181)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:78)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:250)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:236)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:137)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:184)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:171)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:124)\r\n\tat stepDefinitionFile.SiteSearchSearchTerms.invokeWebDriver(SiteSearchSearchTerms.java:24)\r\n\tat ✽.Given I am accessing the site using ChromeDriver(stepDefinitionFile/dailyRoutine.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "at the alb",
      "offset": 13
    }
  ],
  "location": "SiteSearchSearchTerms.searchInGlobalSiteSearch(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SiteSearchSearchTerms.resultsAppearInSiteSearch()"
});
formatter.result({
  "status": "skipped"
});
});