Feature: Test the links within the About Linklaters Widget

Background: 
	Given The user is on the Linklaters.com homepage

Scenario: Click on all links within the banner

	When Clicking on the first link within the banner
	Then Assert that the url contains the first link name
	Then I close the web page
