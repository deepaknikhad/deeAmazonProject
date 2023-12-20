Feature: Search iphone

  Scenario: Search iphone and validate the list
  Given User is at the Home page 
    When Search phone
    When apply filters
    Then validate the filtered list
    