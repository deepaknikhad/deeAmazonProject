Feature: Search iphone

  Scenario: Search iphone and add to cart
    Given User is at the Home page 
    When Search iphone
    When select from the list
    When go to product details page
    When select and store price in a variable
    Then add to cart