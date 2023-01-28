Feature:as a user I should be able to use the functions of the user_photo page
  @1
  Scenario: as a user I should be able to use the functions of the user_photo page
    Given selecting a file, the computer folder should be opened.
    Given the upload button is pressed after the selected picture file, the profile picture should be uploaded.
    Given It should give a warning when something other than image format is selected.
