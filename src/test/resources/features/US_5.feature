Feature: As a user, I must login with an email address and password.
  @1
  Scenario: As a user, I must login with an email address and password.
    Given When the forgot password link is clicked, it should redirect to the forgot_password page
    Given When the sign up link is clicked, it should redirect to the sign_up page
    Given when logged in correctly, it should redirect to the HomePage page and a welcome message should appear in the corner.
    Given when he logs in wrong, the message Provide your valid login credentials should appear
    Given email adress should be an email format.