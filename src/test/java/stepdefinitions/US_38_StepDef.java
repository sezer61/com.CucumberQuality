package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_38_StepDef {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("Clicking the Compare this course with other button should redirect to the Course compare page")
    public void clicking_the_compare_this_course_with_other_button_should_redirect_to_the_course_compare_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("38vaildEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("vaildPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.searchBx.sendKeys("course");
        qualitydemyPage.searchBxClick.click();
    }
    @And("For paid courses, when the buy now button is pressed, it should redirect to the shopping_cart page.")
    public void for_paid_courses_when_the_buy_now_button_is_pressed_it_should_redirect_to_the_shopping_cart_page() {
        Reusable.scrollDown();
        Reusable.bekle(2);
        qualitydemyPage.searchBxListCourse.click();
        Reusable.scrollDown();
        Reusable.bekle(1);
        qualitydemyPage.courseBuyClick.click();
        qualitydemyPage.soppingCartDisplayed.isDisplayed();
        Driver.getDriver().navigate().back();
    }
    @Given("For paid courses, when the add to cart button is pressed, the button should change to {string} and the course should be added to the cart page.")
    public void for_paid_courses_when_the_add_to_cart_button_is_pressed_the_button_should_change_to_and_the_course_should_be_added_to_the_cart_page(String string) {
        Reusable.scrollDown();
        Reusable.bekle(3);
        qualitydemyPage.searchBxListCourse.click();
        Reusable.scrollDown250();
        Reusable.bekle(2);
        qualitydemyPage.addToWishlist.click();
        Reusable.bekle(2);
        qualitydemyPage.addedToWishlist.isDisplayed();
    }
    @Given("the add to wishlist button is pressed, the button should change to {string} and the course should be added to the wishlist page")
    public void the_add_to_wishlist_button_is_pressed_the_button_should_change_to_and_the_course_should_be_added_to_the_wishlist_page(String string) {
        Reusable.keysPageUp();
        Reusable.bekle(2);
        qualitydemyPage.searchBx.sendKeys("course");
        qualitydemyPage.searchBxClick.click();
        Reusable.scrollDown();
        Reusable.bekle(2);
        qualitydemyPage.aFree.click();
        Reusable.scrollDown();
        Reusable.bekle(2);
        qualitydemyPage.listCoursee.click();
        qualitydemyPage.getEnrolled.click();
        Reusable.bekle(2);
        qualitydemyPage.alreadyPurchased.isDisplayed();
    }
    @Given("For non-purchased free courses, when the get enrolled button is pressed, the button should change to already purchased and the course should be added to the mycourse page.")
    public void for_non_purchased_free_courses_when_the_get_enrolled_button_is_pressed_the_button_should_change_to_already_purchased_and_the_course_should_be_added_to_the_mycourse_page() {
        qualitydemyPage.searchBx.sendKeys("course");
        qualitydemyPage.searchBxClick.click();
        Reusable.scrollDown();
        Reusable.bekle(2);
        qualitydemyPage.aFree.click();
        Reusable.scrollDown();
        Reusable.bekle(2);
        qualitydemyPage.listCoursee2.click();
    }
    @Given("BUG clicking on the relevant courses in the {string} section of a purchased course, it should lead to the page where the video of the course is located.")
    public void clicking_on_the_relevant_courses_in_the_section_of_a_purchased_course_it_should_lead_to_the_page_where_the_video_of_the_course_is_located(String string) {
        /*
        Reusable.keysPageDown();
        Reusable.keysPageDown();
        Reusable.bekle(2);
        qualitydemyPage.curriculumFor.click();
        qualitydemyPage.playClickListNote.isEnabled(); //*Bug
        Reusable.keysPageDown();
        Reusable.bekle(2);
        qualitydemyPage.curriculumFor.click();
        qualitydemyPage.playClickListNote.isDisplayed();

         */
    }
}
