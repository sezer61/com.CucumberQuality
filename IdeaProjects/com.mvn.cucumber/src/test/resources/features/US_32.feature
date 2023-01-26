Feature:The functions of the course_form/add_course pricing section should work correctly
  @32
  @sez
  @1
  Scenario: The functions of the course_form/add_course pricing section should work correctly
    Given Check ifg this is a free course checkbox should be selectable
    Given the desired price should be enterable as a number to Course price textbox
    Given Check if this course has discount checkbox should be selectable
    Given the desired discount should be enterable as number to Discounted price textbox
