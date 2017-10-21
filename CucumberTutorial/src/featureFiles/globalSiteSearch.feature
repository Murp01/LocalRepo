Feature: Search for keywords via Global Sitesearch

In order to find an article
As a customer
I want to search in the sitesearch to find direct matches and related tagged articles

@tester
Scenario: Using a search term that is a direct match

Given  I am accessing the site using ChromeDriver
When I search for at the alb
Then all results with at the alb in the title will appear in the search results
