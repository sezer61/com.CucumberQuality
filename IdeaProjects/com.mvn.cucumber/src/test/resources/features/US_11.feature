Feature:As a user I should be able to use the functions of the my_wishlist page
  @1
  Scenario: As a user I should be able to use the functions of the my_wishlist page
    Given the compare link is clicked, it should redirect to the Course compare page
    Given Course should be  searchable from the search box
    Given the course name is clicked, it should redirect to the page of the relevant course.
    Given the instructor icon is clicked, it should redirect to the relevant instructor page.
    Given The course should be able to verify the number and duration of the course on the relevant page when the course name is clicked.
