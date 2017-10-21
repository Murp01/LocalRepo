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
  "duration": 16105519063,
  "status": "passed"
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
  "duration": 1428639636,
  "status": "passed"
});
formatter.match({
  "location": "SiteSearchSearchTerms.resultsAppearInSiteSearch()"
});
formatter.result({
  "duration": 353929,
  "status": "passed"
});
});