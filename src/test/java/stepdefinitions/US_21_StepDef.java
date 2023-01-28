package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

import java.util.List;

public class US_21_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("Verify that the new section is added when the add section button is clicked and the data is entered in the title textbox on the screen that opens and the submit button is pressed.")
    public void verify_that_the_new_section_is_added_when_the_add_section_button_is_clicked_and_the_data_is_entered_in_the_title_textbox_on_the_screen_that_opens_and_the_submit_button_is_pressed() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();


        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.courseLinkH.click();
        qualitydemyPage.addSection.click();
        qualitydemyPage.inputText.sendKeys("am-is-are");
        qualitydemyPage.addSectionSubmit.click();

        qualitydemyPage.sortSections.click();

        Reusable.bekle(2);
        System.out.println(qualitydemyPage.sectionlist.getText());


        Assert.assertTrue(qualitydemyPage.sectionlist.getText().contains("am-is-are"));
    }
    @Given("The screen that opens when the add section button is clicked should be closed with the close button.")
    public void the_screen_that_opens_when_the_add_section_button_is_clicked_should_be_closed_with_the_close_button() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();


        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.courseLinkH.click();
        qualitydemyPage.addSection.click();
        Reusable.bekle(2);
        qualitydemyPage.addSectionclose.click();
        Reusable.bekle(3);
        Assert.assertFalse(qualitydemyPage.addSectionclose.isDisplayed());
    }
    @Given("the add lesson button is clicked, selections should be made for video types.")
    public void the_add_lesson_button_is_clicked_selections_should_be_made_for_video_types() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.courseLinkH.click();
        qualitydemyPage.addLesson.click();

        Assert.assertTrue(qualitydemyPage.selectLessontype.isDisplayed());
    }
    @Given("The screen that opens when the add lesson button is clicked should be closed with the close button.")
    public void the_screen_that_opens_when_the_add_lesson_button_is_clicked_should_be_closed_with_the_close_button() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();


        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.courseLinkH.click();
        qualitydemyPage.addSection.click();
        Reusable.bekle(2);
        qualitydemyPage.addSectionclose.click();
        Reusable.bekle(3);
        Assert.assertFalse(qualitydemyPage.addSectionclose.isDisplayed());
    }
    @Given("After selecting the video type in the add lesson section, when the next button is clicked, the explanation screen related to the video should appear.")
    public void after_selecting_the_video_type_in_the_add_lesson_section_when_the_next_button_is_clicked_the_explanation_screen_related_to_the_video_should_appear() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.gooogleDriveVideo.click();
        qualitydemyPage.next.click();

        Assert.assertTrue(qualitydemyPage.lessontype.isDisplayed());
    }
    @Given("The name should be able to get entered in the title textbox on the description screen.")
    public void the_name_should_be_able_to_get_entered_in_the_title_textbox_on_the_description_screen() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.gooogleDriveVideo.click();
        qualitydemyPage.next.click();

        qualitydemyPage.lessontypeTitle.sendKeys("harun");

        Assert.assertTrue(qualitydemyPage.lessontypeTitle.isEnabled());
    }
    @Given("The desired section should be selected from the section dropbox on the description screen.")
    public void the_desired_section_should_be_selected_from_the_section_dropbox_on_the_description_screen() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.youtubevideo.click();
        qualitydemyPage.next.click();

        Reusable.bekle(3);

        qualitydemyPage.section.click();
        Reusable.bekle(3);

        Assert.assertTrue(qualitydemyPage.section.isEnabled());
    }
    @Given("A valid url should be able to get entered in the video url section on the description screen.")
    public void a_valid_url_should_be_able_to_get_entered_in_the_video_url_section_on_the_description_screen() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.youtubevideo.click();
        qualitydemyPage.next.click();

        Reusable.bekle(3);

        qualitydemyPage.section.click();
        Reusable.bekle(3);

        qualitydemyPage.lessontypeTitle.sendKeys("am-is-are");

        qualitydemyPage.videoUrl.sendKeys("https://www.youtube.com/watch?v=8QQKGr2Id_E");

        qualitydemyPage.duration.click();


        Assert.assertTrue(qualitydemyPage.videoUrl.isEnabled());
    }
    @Given("After a valid url is entered in the video url section on the description screen, the duration section should automatically capture the duration in the system.")
    public void after_a_valid_url_is_entered_in_the_video_url_section_on_the_description_screen_the_duration_section_should_automatically_capture_the_duration_in_the_system() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));


        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.youtubevideo.click();
        qualitydemyPage.next.click();

        Reusable.bekle(3);

        qualitydemyPage.lessontypeTitle.sendKeys("am-is-are");

        qualitydemyPage.section.click();

        Reusable.bekle(3);

        qualitydemyPage.videoUrl.sendKeys("https://www.youtube.com/watch?v=vFZXMhx-LkE");

        qualitydemyPage.duration.click();
        Reusable.bekle(3);
        Assert.assertFalse(qualitydemyPage.invalidUrlText.isDisplayed());
        Assert.assertTrue(qualitydemyPage.duration.isEnabled());
    }
    @Given("an invalid url is entered in the video url section on the description screen, a warning should appear under the textbox.")
    public void an_invalid_url_is_entered_in_the_video_url_section_on_the_description_screen_a_warning_should_appear_under_the_textbox() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));


        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.youtubevideo.click();
        qualitydemyPage.next.click();

        Reusable.bekle(3);

        qualitydemyPage.lessontypeTitle.sendKeys("am-is-are");

        qualitydemyPage.section.click();
        Reusable.bekle(3);

        qualitydemyPage.videoUrl.sendKeys("https://www.youtube.com/watch?v=vFZXMhx-");

        Reusable.bekle(3);
        qualitydemyPage.duration.click();

        Assert.assertTrue(qualitydemyPage.invalidUrlText.isDisplayed());
    }
    @Given("It should be possible to enter a description in the summary textbox on the description screen")
    public void ıt_should_be_possible_to_enter_a_description_in_the_summary_textbox_on_the_description_screen() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));


        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.youtubevideo.click();
        qualitydemyPage.next.click();
        Reusable.bekle(3);

        qualitydemyPage.lessontypeTitle.sendKeys("am-is-are");

        qualitydemyPage.section.click();

        Reusable.bekle(3);

        qualitydemyPage.videoUrl.sendKeys("https://www.youtube.com/watch?v=vFZXMhx-LkE");

        qualitydemyPage.duration.click();
        Reusable.bekle(6);

        qualitydemyPage.Summary.sendKeys("video");
        Reusable.bekle(2);
        Assert.assertTrue(qualitydemyPage.Summary.isEnabled());
    }
    @Given("Mark as free lesson checkbox should be clickable on the description screen")
    public void mark_as_free_lesson_checkbox_should_be_clickable_on_the_description_screen() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));


        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.youtubevideo.click();
        qualitydemyPage.next.click();
        Reusable.bekle(3);

        qualitydemyPage.lessontypeTitle.sendKeys("am-is-are");

        qualitydemyPage.section.click();
        Reusable.bekle(3);

        // qualitydemyPage.selectedSection.click();

        Reusable.bekle(3);

        qualitydemyPage.videoUrl.sendKeys("https://www.youtube.com/watch?v=vFZXMhx-LkE");

        qualitydemyPage.duration.click();
        Reusable.bekle(6);

        qualitydemyPage.Summary.sendKeys("video");
        Reusable.bekle(2);
        Assert.assertTrue(qualitydemyPage.Summary.isEnabled());

        qualitydemyPage.freelessoncheckbox.click();

        Assert.assertTrue(qualitydemyPage.freelessoncheckbox.isSelected());
    }
    @Given("After filling the relevant sections on the explanation screen, the course should be added to the lesson section when the add lesson button is clicked.")
    public void after_filling_the_relevant_sections_on_the_explanation_screen_the_course_should_be_added_to_the_lesson_section_when_the_add_lesson_button_is_clicked() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.youtubevideo.click();
        qualitydemyPage.next.click();
        Reusable.bekle(3);

        qualitydemyPage.lessontypeTitle.sendKeys("endtoend");

        qualitydemyPage.section.click();
        Reusable.bekle(3);

        // qualitydemyPage.selectedSection.click();

        Reusable.bekle(3);

        qualitydemyPage.videoUrl.sendKeys("https://www.youtube.com/watch?v=vFZXMhx-LkE");

        qualitydemyPage.duration.click();
        Reusable.bekle(6);

        qualitydemyPage.Summary.sendKeys("video");

        qualitydemyPage.freelessoncheckbox.click();

        qualitydemyPage.addLesson2.click();

        Reusable.bekle(3);

        Assert.assertTrue(qualitydemyPage.addlessonTable.getText().contains("endtoend"));
    }
    @Given("Clicking the close button on the description screen should close the window")
    public void clicking_the_close_button_on_the_description_screen_should_close_the_window() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();

        qualitydemyPage.addLesson.click();
        qualitydemyPage.youtubevideo.click();
        qualitydemyPage.next.click();
        Reusable.bekle(3);

        qualitydemyPage.lessontypeTitle.sendKeys("end to");

        qualitydemyPage.section.click();
        Reusable.bekle(3);

        //qualitydemyPage.selectedSection.click();

        Reusable.bekle(3);

        qualitydemyPage.videoUrl.sendKeys("https://www.youtube.com/watch?v=vFZXMhx-LkE");

        qualitydemyPage.duration.click();
        Reusable.bekle(6);

        qualitydemyPage.Summary.sendKeys("video");

        qualitydemyPage.closebutton.click();
        Reusable.bekle(2);

        Assert.assertFalse(qualitydemyPage.closebutton.isDisplayed());
    }
    @Given("the Sort sections button is pressed, it should be possible to change the order between the sections with drag drop.")
    public void the_sort_sections_button_is_pressed_it_should_be_possible_to_change_the_order_between_the_sections_with_drag_drop() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();
        qualitydemyPage.sortSections.click();


        Actions actions = new Actions(Driver.getDriver());
        List<WebElement> dragAndDropList=qualitydemyPage.dragDropList;
        String firstElementAtb=dragAndDropList.get(0).getAttribute("id");
        actions.dragAndDrop(qualitydemyPage.lessonbutton1,qualitydemyPage.lessonbutton3).perform();
        Reusable.bekle(3);
        qualitydemyPage.updatesorting.click();
        Reusable.bekle(3);
        qualitydemyPage.sortSections.click();
        Reusable.bekle(3);
        List<WebElement> dragAndDropListUpdate=qualitydemyPage.dragDropList;
        String secondElementAtb=dragAndDropListUpdate.get(1).getAttribute("id");
        Reusable.bekle(3);
        Assert.assertEquals(firstElementAtb,secondElementAtb);

        Reusable.bekle(3);
        actions.dragAndDrop(qualitydemyPage.lessonbutton3,qualitydemyPage.lessonbutton1).perform();
        Reusable.bekle(3);
        qualitydemyPage.updatesorting.click();
    }
    @Given("the sort sections button is pressed and changes are made, the change made with the update sorting button should be saved.")
    public void the_sort_sections_button_is_pressed_and_changes_are_made_the_change_made_with_the_update_sorting_button_should_be_saved() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();
        qualitydemyPage.sortSections.click();


        Actions actions = new Actions(Driver.getDriver());
        List<WebElement> dragAndDropList=qualitydemyPage.dragDropList;
        String firstElementAtb=dragAndDropList.get(0).getAttribute("id");
        actions.dragAndDrop(qualitydemyPage.lessonbutton1,qualitydemyPage.lessonbutton3).perform();
        Reusable.bekle(3);
        qualitydemyPage.updatesorting.click();
        Reusable.bekle(3);
        qualitydemyPage.sortSections.click();
        Reusable.bekle(3);
        List<WebElement> dragAndDropListUpdate=qualitydemyPage.dragDropList;
        String secondElementAtb=dragAndDropListUpdate.get(1).getAttribute("id");
        Reusable.bekle(3);
        Assert.assertEquals(firstElementAtb,secondElementAtb);

        Reusable.bekle(3);
        actions.dragAndDrop(qualitydemyPage.lessonbutton3,qualitydemyPage.lessonbutton1).perform();
        Reusable.bekle(3);
        qualitydemyPage.updatesorting.click();
    }
    @Given("hovering over the sections with the mouse, the sort lesson, edit section and delete section buttons should appear.")
    public void hovering_over_the_sections_with_the_mouse_the_sort_lesson_edit_section_and_delete_section_buttons_should_appear() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.courseLinkH.click();


        Actions actions  = new Actions(Driver.getDriver());

        // addsection
        actions.moveToElement(qualitydemyPage.addSection).perform();
        Reusable.bekle(2);

        Assert.assertTrue(qualitydemyPage.addSection.isDisplayed());

        //addLesson

        actions.moveToElement(qualitydemyPage.addLesson).perform();
        Reusable.bekle(2);

        Assert.assertTrue(qualitydemyPage.addLesson.isDisplayed());

        // sortSections

        actions.moveToElement(qualitydemyPage.sortSections).perform();
        Reusable.bekle(2);

        Assert.assertTrue(qualitydemyPage.sortSections.isDisplayed());
    }
    @Given("It should be possible to change the order between the lessons with the drag drop where the sort lesson button is pressed.")
    public void ıt_should_be_possible_to_change_the_order_between_the_lessons_with_the_drag_drop_where_the_sort_lesson_button_is_pressed() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();

        Actions actions = new Actions(Driver.getDriver());

        Reusable.bekle(3);
        actions.moveToElement(qualitydemyPage.section3Table).perform();
        Reusable.bekle(3);
        qualitydemyPage.sortLesson.click();

        Reusable.bekle(3);

        String lesson1=  qualitydemyPage.sortLessonbutton1.getText();
        String lesson2=  qualitydemyPage.sortLessonbutton2.getText();

        actions.dragAndDrop(qualitydemyPage.sortLessonbutton2,qualitydemyPage.sortLessonbutton1).perform();
        Reusable.bekle(5);

        qualitydemyPage.updatesorting2.click();
        Reusable.bekle(6);

        qualitydemyPage.finishBtn.click();

        qualitydemyPage.courseSubmitBtn.click();
        Reusable.bekle(3);
        actions.moveToElement(qualitydemyPage.section3Table).perform();
        qualitydemyPage.sortLesson.click();

        String updatelesson1 = qualitydemyPage.sortLessonbutton1.getText();

        String updatelesson2 = qualitydemyPage.sortLessonbutton2.getText();

        Assert.assertEquals(lesson1,updatelesson2);
        Reusable.bekle(3);
        actions.dragAndDrop(qualitydemyPage.sortLessonbutton2,qualitydemyPage.sortLessonbutton1).perform();
    }
    @Given("the sort lesson button is pressed and a change is made, the change made by pressing the update sorting button should be saved.")
    public void the_sort_lesson_button_is_pressed_and_a_change_is_made_the_change_made_by_pressing_the_update_sorting_button_should_be_saved() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();

        Actions actions = new Actions(Driver.getDriver());

        actions.keyDown(Keys.END).perform();
        actions.keyUp(Keys.END).perform();

        Reusable.bekle(3);
        actions.moveToElement(qualitydemyPage.section3Table).perform();
        Reusable.bekle(3);
        qualitydemyPage.sortLesson.click();

        Reusable.bekle(3);

        String lesson1=  qualitydemyPage.sortLessonbutton1.getText();
        String lesson2=  qualitydemyPage.sortLessonbutton2.getText();

        actions.dragAndDrop(qualitydemyPage.sortLessonbutton2,qualitydemyPage.sortLessonbutton1).perform();
        Reusable.bekle(5);

        qualitydemyPage.updatesorting2.click();
        Reusable.bekle(6);

        qualitydemyPage.finishBtn.click();

        qualitydemyPage.courseSubmitBtn.click();
        actions.keyDown(Keys.END).perform();
        actions.keyUp(Keys.END).perform();
        Reusable.bekle(3);
        actions.moveToElement(qualitydemyPage.section3Table).perform();
        qualitydemyPage.sortLesson.click();

        String updatelesson1 = qualitydemyPage.sortLessonbutton1.getText();

        String updatelesson2 = qualitydemyPage.sortLessonbutton2.getText();

        Assert.assertEquals(lesson1,updatelesson2);
    }
    @Given("the Update section button is pressed, the title section should be able to be changed in the window that opens.")
    public void the_update_section_button_is_pressed_the_title_section_should_be_able_to_be_changed_in_the_window_that_opens() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();
        Actions actions = new Actions(Driver.getDriver());


        Reusable.bekle(3);

        String title1 = qualitydemyPage.editeSectionTitle.getText();

        Reusable.bekle(3);
        actions.moveToElement(qualitydemyPage.section3Table).perform();
        Reusable.bekle(4);

        qualitydemyPage.editeSection.click();
        Reusable.bekle(3);

        qualitydemyPage.updateSectionTitle.clear();
        Reusable.bekle(2);

        qualitydemyPage.updateSectionTitle.sendKeys("passive voices");

        Reusable.bekle(3);

        qualitydemyPage.submitedit.click();

        Reusable.bekle(7);

        System.out.println(qualitydemyPage.editeSectionTitle.getText());


        String newtitle = qualitydemyPage.editeSectionTitle.getText();

        Assert.assertFalse(title1.equals(newtitle));
    }
    @Given("the update section button is pressed, the window that opens should be closed with the close button.")
    public void the_update_section_button_is_pressed_the_window_that_opens_should_be_closed_with_the_close_button() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();
        Actions actions = new Actions(Driver.getDriver());


        Reusable.bekle(3);

        String title1 = qualitydemyPage.editeSectionTitle.getText();

        Reusable.bekle(3);
        actions.moveToElement(qualitydemyPage.section3Table).perform();
        Reusable.bekle(4);

        qualitydemyPage.editeSection.click();
        Reusable.bekle(3);

        Assert.assertTrue(qualitydemyPage.closeedit.isDisplayed());

        qualitydemyPage.closeedit.click();

        Reusable.bekle(3);

        Assert.assertFalse(qualitydemyPage.closeedit.isDisplayed());
    }
    @Given("The desired section should be get deleted with the delete section button.")
    public void the_desired_section_should_be_get_deleted_with_the_delete_section_button() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();
        Actions actions = new Actions(Driver.getDriver());
    }
    @Given("you hover over the course with your mouse, the edit and delete icons should appear.")
    public void you_hover_over_the_course_with_your_mouse_the_edit_and_delete_icons_should_appear() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();
        Actions actions = new Actions(Driver.getDriver());

        Reusable.bekle(3);



        actions.moveToElement(qualitydemyPage.lesson1text).perform();
        Reusable.bekle(4);

        Assert.assertTrue(qualitydemyPage.lesson1edit.isDisplayed());
        Assert.assertTrue(qualitydemyPage.lesson1close.isDisplayed());
    }
    @Given("the edit icon is clicked, the update lesson window should open.")
    public void the_edit_icon_is_clicked_the_update_lesson_window_should_open() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();
        Actions actions = new Actions(Driver.getDriver());

        Reusable.bekle(3);

        actions.moveToElement(qualitydemyPage.lesson1text).perform();
        Reusable.bekle(4);

        qualitydemyPage.lesson1edit.click();

        Reusable.bekle(3);

        Assert.assertTrue(qualitydemyPage.updateLessontitle.isDisplayed());
    }
    @Given("Changes can be made in the sections of the update lesson window")
    public void changes_can_be_made_in_the_sections_of_the_update_lesson_window() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();
        Actions actions = new Actions(Driver.getDriver());


        actions.moveToElement(qualitydemyPage.lesson1box).perform();
        Reusable.bekle(4);

        qualitydemyPage.lesson1edit.click();
        Reusable.bekle(5);
        Assert.assertTrue(qualitydemyPage.lessontypeTitle.isEnabled());
    }
    @Given("The update lesson window should be closed with the close button.")
    public void the_update_lesson_window_should_be_closed_with_the_close_button() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();
        Actions actions = new Actions(Driver.getDriver());


        actions.moveToElement(qualitydemyPage.lesson1box).perform();
        Reusable.bekle(4);

        qualitydemyPage.lesson1edit.click();
        Reusable.bekle(5);

        Assert.assertTrue(qualitydemyPage.closeedit.isDisplayed());

        qualitydemyPage.closeedit.click();

        Reusable.bekle(4);

        Assert.assertFalse(qualitydemyPage.closeedit.isDisplayed());
    }
    @Given("the delete lesson icon is clicked, the desired lesson should be deleted")
    public void the_delete_lesson_icon_is_clicked_the_desired_lesson_should_be_deleted() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();


        qualitydemyPage.courseLinkH.click();
    }

}
