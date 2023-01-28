Feature:as a user I should be able to use the "course_form/course_edit" partition functions
  @1
  Scenario: as a user I should be able to use the "course_form/course_edit" partition functions
    Given the Add new instructor section is clicked, it should be possible to choose from among the instructors added here.
    Given It should be possible to make changes on the Course title, Short description and description
    Given The desired category should be able to get selected from the Category section.
    Given The desired level should be able to get selected from the Level section.
    Given Enable drip content button can be changed
    Given Check if this course is top course checkbox should be selectable
