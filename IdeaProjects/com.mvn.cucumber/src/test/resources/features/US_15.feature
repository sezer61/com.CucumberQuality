Feature:as a user I should be able to use the functions of the user_profile page
  @1
  Scenario: as a user I should be able to use the functions of the user_profile page
   Given First name,Last name,Title,Your skills,Biography,Add your twitter link,Add your facebook linkAdd your linkedin link texts should be able to get entered
   Given the save button is pressed after the changes made, the changes should be saved.
   Given profile button should redirect to user profile page
