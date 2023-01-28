Feature: The functions of the become_an_instructor page should work correctly
  @36
  @sez
  @1
  @team10
  Scenario: The functions of the become_an_instructor page should work correctly
    Given The name and email address sections should not be changed.
    Given Address, phone number and any message sections should be accessible.
    Given documents should be selectable in the document section
    Given the apply button is pressed, it should lead to the "YOUR APPLICATION" section and the "click to activate" button should be seen.
    Given the click to activate button is pressed, the message "your appication has been approved" should appear and when the   confirmation button is pressed, it is verified that the status part has changed to Approved.