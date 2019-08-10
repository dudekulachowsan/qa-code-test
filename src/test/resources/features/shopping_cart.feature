Feature: Validate Shopping cart
  Search for items and add items to the cart.
  Validate item is added to the cart.
  Remove existing items from the cart.
  Validate the cart is empty.

  Background:
    Given user is on the ebay homepage
    And   search for an item "Tough Times Never Last"
    When  user adds first item to the cart from the results list
    And   go to cart

  Scenario: Validate book is added to the cart
    Then  verify item is added to the cart "Tough Times Never Last"

  Scenario: Validate cart is empty by removing the book
    When user removes the item from the cart
    Then verify the cart is empty
