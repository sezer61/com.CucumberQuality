Feature: the functions of the lesson"xLessonName" page should work correctly
  @37
  @sez
  @1
  Scenario: the functions of the lesson"xLessonName" page should work correctly
    Given When my courses button is clicked, it should redirect to my_courses page
    Given When the course details button is clicked,it should redirect to the relevant the course page with explanations.
    Given Context menu should open and close when clicking on section headers
    Given The topics in the sections should be selectable as checked or unchecked.
