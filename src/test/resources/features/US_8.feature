Feature: Email should be able to get entered on the forgot_password page and the functions of the page must work correctly
  @8
  @1
  Scenario: Email should be able to get entered on the forgot_password page and the functions of the page must work correctly
    Given Email must contain the @ sign and the .com extension.
    Given user not found warning message should be displayed in the upper corner when an email that is not registered to the system is entered.
    Given Clicking on the login link should redirect to the login page
    Given When the correct email is entered and the send request button is clicked, it should redirect to the login page and the message "Check your inbox for the request" should be seen in the upper corner.
