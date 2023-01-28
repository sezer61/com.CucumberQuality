Feature: as a user I should be able to use the functions of the Curriculum section on the course_form/course_edit page
  @1
  Scenario:  as a user I should be able to use the functions of the Curriculum section on the course_form/course_edit page
    Given Verify that the new section is added when the add section button is clicked and the data is entered in the title textbox on the screen that opens and the submit button is pressed.
    Given The screen that opens when the add section button is clicked should be closed with the close button.
    Given the add lesson button is clicked, selections should be made for video types.
    Given The screen that opens when the add lesson button is clicked should be closed with the close button.
    Given After selecting the video type in the add lesson section, when the next button is clicked, the explanation screen related to the video should appear.
    Given The name should be able to get entered in the title textbox on the description screen.
    Given The desired section should be selected from the section dropbox on the description screen.
    Given A valid url should be able to get entered in the video url section on the description screen.
    Given After a valid url is entered in the video url section on the description screen, the duration section should automatically capture the duration in the system.
    Given an invalid url is entered in the video url section on the description screen, a warning should appear under the textbox.
    Given It should be possible to enter a description in the summary textbox on the description screen
    Given Mark as free lesson checkbox should be clickable on the description screen
    Given After filling the relevant sections on the explanation screen, the course should be added to the lesson section when the add lesson button is clicked.
    Given Clicking the close button on the description screen should close the window
    Given the Sort sections button is pressed, it should be possible to change the order between the sections with drag drop.
    Given the sort sections button is pressed and changes are made, the change made with the update sorting button should be saved.
    Given hovering over the sections with the mouse, the sort lesson, edit section and delete section buttons should appear.
    Given It should be possible to change the order between the lessons with the drag drop where the sort lesson button is pressed.
    Given the sort lesson button is pressed and a change is made, the change made by pressing the update sorting button should be saved.
    Given the Update section button is pressed, the title section should be able to be changed in the window that opens.
    Given the update section button is pressed, the window that opens should be closed with the close button.
    Given The desired section should be get deleted with the delete section button.
    Given you hover over the course with your mouse, the edit and delete icons should appear.
    Given the edit icon is clicked, the update lesson window should open.
    Given Changes can be made in the sections of the update lesson window
    Given The update lesson window should be closed with the close button.
    Given the delete lesson icon is clicked, the desired lesson should be deleted
