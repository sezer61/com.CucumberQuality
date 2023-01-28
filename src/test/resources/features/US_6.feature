Feature: Registration should be possible on the sign_up page and the functions of the page should work correctly
  @1
  Scenario: Registration should be possible on the sign_up page and the functions of the page should work correctly
    Given the correct data is entered and the sign up button is pressed, it should redirect to the verification_code page and a green verification message should appear in the corner.
    Given Clickingg on the login link should redirect to the login page
    Given first name and last name must be at least 2 letters
    Given Password must contain uppercase, lowercase, numbers and special characters
    Given Email muust contain the @ sign and the .com extension.
    Given It should give a warning message when a previously registered email is entered into the system.
