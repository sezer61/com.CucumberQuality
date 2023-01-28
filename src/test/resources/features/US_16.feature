Feature: as a user I should be able to use the functions of the user_credentials page
  @1
  Scenario: as a user I should be able to use the functions of the user_credentials page
    Given The account button should redirect to the user_credentials page
    Given Value must be entered in Current password,New password,Confirm password textboxes
    Given If the New password and Confirm password values are the same when the save change button is clicked, the change should be saved.
    Given If the New password and Confirm password values are different when the save change button is clicked, the Mismatch password warning message should appear in the upper corner.
