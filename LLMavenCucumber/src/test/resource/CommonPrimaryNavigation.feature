Feature: Testing the primary navigation bar

  Background: 
    Given The user is on the Linklaters.com homepage

  #Scenario: Click on the About Us link
  #This test is ran using parameters
  #When Clicking on the "About Us" link in the primary navigation
  #Then Assert that the url contains "About Us"
  #Scenario: Click on the Client Services link
  #This test is ran using parameters
  #When Clicking on the "Client Services" link in the primary navigation
  #Then Assert that the url contains "Client Services"
  
  @Chrome
  Scenario Outline: Open the search box
	When I click on the search icon
	Then the search box will open
  
  @Chrome
  Scenario Outline: Click all links
    #This test uses a datatable to run through all of the titles
    When Clicking on the <Link> link in the primary navigation DT
    Then Assert that the url contains <Title> DT

    Examples: 
      | Link            | Title           |
      | About Us        | About Us        |
      | Client Services | Client Services |
      | Sectors         | Sectors         |
      | Find a Lawyer   | Find a Lawyer   |
      | Locations       | Locations       |
      | Insights        | Insights        |
      | Careers         | Careers         |

  @Firefox
  Scenario Outline: Click all links
    #This test uses a datatable to run through all of the titles
    When Clicking on the <Link> link in the primary navigation DT
    Then Assert that the url contains <Title> DT

    Examples: 
      | Link            | Title           |
      | About Us        | About Us        |
      | Client Services | Client Services |
      | Sectors         | Sectors         |
      | Find a Lawyer   | Find a Lawyer   |
      | Locations       | Locations       |
      | Insights        | Insights        |
      | Careers         | Careers         |
