Feature: as a user I should be able to use the functions of the shopping_cart page
  @1
  Scenario: as a user I should be able to use the functions of the shopping_cart page
    Given The course in the cart should be able to get deleted from the remove link
    Given When a valid coupon code is entered and applied, the discount should be shown in the price.
    Given an invalid coupon code is entered and applied, the price should not change.
    Given the checkout button is pressed, it should redirect to the payment page