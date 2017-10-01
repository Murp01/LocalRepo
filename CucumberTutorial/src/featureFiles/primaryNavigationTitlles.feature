Feature: Primary Navigation Titles

In order to navigate through each main title landing page
As a customer
I want to select each main title from the primary navigation bar

@tester
Scenario: Selecting all primary nav titles and returning to homepage via logo

Given I am accessing the site using ChromeDriver 
When I click on each main title from the primary navigation
Then the appropriate webpage will open