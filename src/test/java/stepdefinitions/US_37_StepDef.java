package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_37_StepDef {

    QualitydemyPage qualitydemyPage_ =new QualitydemyPage();
    @Given("When my courses button is clicked, it should redirect to my_courses page")
    public void when_my_courses_button_is_clicked_it_should_redirect_to_my_courses_page() {
        //When my courses button is clicked, it should redirect to my_courses page
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage_.cookies.click();
        qualitydemyPage_.login.click();
        qualitydemyPage_.email.sendKeys(configReader.getProperty("qaStudentVaildEmail"));
        qualitydemyPage_.password.sendKeys(configReader.getProperty("qaStudentVaildPassword"));
        qualitydemyPage_.loginButton.click();
        qualitydemyPage_.myCoursesClick.click();
    }
    @Given("When the course details button is clicked,it should redirect to the relevant the course page with explanations.")
    public void when_the_course_details_button_is_clicked_it_should_redirect_to_the_relevant_the_course_page_with_explanations() {
        Reusable.scrollDown250();
        Reusable.bekle(3);
        //When my courses button is clicked, it should redirect to my_courses page
        //When the course details button is clicked,it should redirect to the relevant the course page with explanations.
        qualitydemyPage_.myCoursesListClick.click();
        qualitydemyPage_.myCoursesListDisplayed.isDisplayed();
    }
    @Given("Context menu should open and close when clicking on section headers")
    public void context_menu_should_open_and_close_when_clicking_on_section_headers() {
        Reusable.scrollDown1100();
        Reusable.bekle(8);
        //Context menu should open and close when clicking on section headers
        //The topics in the sections should be selectable as checked or unchecked.
        qualitydemyPage_.contextMenu.click();
        qualitydemyPage_.contextMenu.click();
    }
    @Given("The topics in the sections should be selectable as checked or unchecked.")
    public void the_topics_in_the_sections_should_be_selectable_as_checked_or_unchecked() {

    }
}
