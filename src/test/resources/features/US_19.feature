Feature:As a user, I should be able to use the functions of the Course manager page.
  @1
  Scenario: As a user, I should be able to use the functions of the Course manager page.
    Given  the appropriate values are selected from the filter and the filter button is pressed, the relevant course should appear in the list.
    Given  Coursme should be able to get selected from the search box
    Given  Clicking on the three dots under the action section and clicking the View course on frontend link should redirect to the page of the relevant course.
    Given  Clicking on the three dots under the action section and clicking the Go to course playing page link should lead to the page of the relevant course content.
    Given  you click on the three dots under the action section and click on the Edit this course link, it should redirect to the edit page of the relevant course.
    Given   Clicking on the three dots under the action section and clicking the Section and lesson link should lead to the edit page of the relevant course.
    Given  you click on the three dots under the action section and click on the Mark as drafted link, a confirmation message should come and after approval, the status section of the course should change to draft.
    Given  you click on the three dots under the action section and click on the Publish this course link, a confirmation message should come and after approval, the status section of the course should change to active.
    Given   you click on the three dots under the action section and click on the delete link from here, a confirmation message should come and the course should be deleted from the list after approval.
    Given  Clicking the add new course button should redirect to the add_course page
    Given  the course name in the list is clicked, it should redirect to the edit page of the relevant course.
