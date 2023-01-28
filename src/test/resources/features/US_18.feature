Feature:as a user I should be able to use the functions of the user/dashboard page
  @1
  Scenario: as a user I should be able to use the functions of the user/dashboard page
    Given the Number of courses section is clicked, it should redirect to the courses page
    Given pending balance section is clicked, it should redirect to payout_report page
    Given the Requested withdrawal amount section is clicked, it should redirect to the payout_report page.
