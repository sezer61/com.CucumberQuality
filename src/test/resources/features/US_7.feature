Feature: In The verification_code page, It should be possible to enter the code and the page's functions should work correctly

  Scenario: In The verification_code page, It should be possible to enter the code and the page's functions should work correctly
    Given verification_code should go to registered email
    Given the verification_code sent to the email is entered and the countinue button is pressed, it should redirect to the login page.
    Given thee wrong verification_code is entered and the countinue button is pressed. The verification code is wrong message should appear in the corner
    Given Clickiing on the login link should redirect to the login page
