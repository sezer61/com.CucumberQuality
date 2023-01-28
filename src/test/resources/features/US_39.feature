
Feature: the functions of the payment page should work correctly
  @39
  @sez
  @1
  @team10
  Scenario: the functions of the payment page should work correctly
    Given The pay with stripe button should be visible after clicking the stripe logo
    Given the pay with stripe button is clicked, it should redirect to checkout.stripe.com
    Given the close icon is clicked, it should redirect to the shopping cart page.
    Given E-mail, card information, country information should be filled in appropriately on checkout.stripe.com page
    Given the pay button is pressed, it should be checked that the necessary information has been filled.
    Given If the required information is filled when the pay button is clicked, a green tick should appear on the pay button and then it should redirect to my_courses page.
