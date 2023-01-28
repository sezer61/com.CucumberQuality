Feature:as a user I should be able to use the functions of the Course compare page
  @1
  Scenario: as a user I should be able to use the functions of the Course compare page
    Given Courses should be searchable from dropboxes
    Given the get enrolled button is clicked, it should redirect to the page of the relevant course.
    Given the learn more link is clicked, it should redirect to the page of the relevant course.
    Given the buy now button is clicked, it should redirect to the shopping_cart page
