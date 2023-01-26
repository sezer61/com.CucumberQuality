Feature: as a user I should be able to use the functions of my_courses page
  @1
  Scenario:as a user I should be able to use the functions of my_courses page
    Given the reset button is pressed, the page should be refreshed.
    Given Coursce should be able to get selected from the search box
    Given Verify that categories can be viewed and selected from the categories dropdown
    Given the edit rating link is clicked, the scoring screen should appear.
    Given the cancel button is pressed, the scoring screen should close.
    Given score range can be selected
    Given It should be possible to write notes in the msg textbox
    Given The selected value should be assigned when the publish rating button is pressed.
    Given the start lesson button is clicked, it should go to the relevant course page.

