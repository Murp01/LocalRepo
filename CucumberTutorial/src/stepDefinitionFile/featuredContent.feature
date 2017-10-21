Feature: View articles within the Featured Content Widget

In order to have easy access to featured articles
As a customer
I want to be able to access and view all articles from the Home Page

@tester
Scenario: Click the Load More button to view more articles

Given I am accessing the site using ChromeDriver
When I click on Load More from the featured content widget
Then more articles will be displayed below 