Feature:Clicking
  @38
  @sez
  @1
  Scenario:Clicking
    Given Clicking the Compare this course with other button should redirect to the Course compare page
    And For paid courses, when the buy now button is pressed, it should redirect to the shopping_cart page.
    Given For paid courses, when the add to cart button is pressed, the button should change to "Added to cart" and the course should be added to the cart page.
    Given the add to wishlist button is pressed, the button should change to "Added to wishlist" and the course should be added to the wishlist page
    Given For non-purchased free courses, when the get enrolled button is pressed, the button should change to already purchased and the course should be added to the mycourse page.
    Given BUG clicking on the relevant courses in the "Curriculum for this course" section of a purchased course, it should lead to the page where the video of the course is located.
