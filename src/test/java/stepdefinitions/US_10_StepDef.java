package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_10_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("the reset button is pressed, the page should be refreshed.")
    public void the_reset_button_is_pressed_the_page_should_be_refreshed() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginBtn.click();
        qualitydemyPage.emailTextBox.sendKeys("kidohe7294@vingood.com");
        qualitydemyPage.password.sendKeys("1234.Ayse");
        qualitydemyPage.submit.click();
        qualitydemyPage.myCoursesClick.click();
        //***reset butonunun calisip calısmadıgını***//
        qualitydemyPage.reset.click();
        //***kurs arama kutusunda secilebilmelidir***
        qualitydemyPage.myCoursesSearchBox.sendKeys("Piano");
        Reusable.bekle(3);
        qualitydemyPage.myCoursesSearchBoxClick.click();
    }
    @Given("Coursce should be able to get selected from the search box")
    public void coursce_should_be_able_to_get_selected_from_the_search_box() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginBtn.click();
        qualitydemyPage.emailTextBox.sendKeys("kidohe7294@vingood.com");
        qualitydemyPage.password.sendKeys("1234.Ayse");
        qualitydemyPage.submit.click();
        qualitydemyPage.myCoursesClick.click();
        qualitydemyPage.reset.click();
        Driver.getDriver().navigate().refresh();
    }
    @Given("Verify that categories can be viewed and selected from the categories dropdown")
    public void verify_that_categories_can_be_viewed_and_selected_from_the_categories_dropdown() {
        qualitydemyPage.myCoursesSearchBox.sendKeys("Piano");
        qualitydemyPage.myCoursesSearchBoxClick.click();
        Reusable.bekle(3);
        qualitydemyPage.courseIsdisplayed.isDisplayed();
        Reusable.bekle(3);
        qualitydemyPage.myCoursesClick.click();
        //***Derecelendirmeyi düzenle bağlantısına tıklandığında puanlama ekranı gelmelidir.***//
        Reusable.keysPageDown();
        Reusable.bekle(6);
        qualitydemyPage.editRating.click();
        qualitydemyPage.degree.isDisplayed();
        //***İptal butonuna basıldığında puanlama ekranı kapanmalıdır.***//
        qualitydemyPage.cancel.click();
        Reusable.bekle(3);
        qualitydemyPage.editRating.isDisplayed();
    }
    @Given("the edit rating link is clicked, the scoring screen should appear.")
    public void the_edit_rating_link_is_clicked_the_scoring_screen_should_appear() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginBtn.click();
        qualitydemyPage.emailTextBox.sendKeys("kidohe7294@vingood.com");
        qualitydemyPage.password.sendKeys("1234.Ayse");
        qualitydemyPage.submit.click();
        qualitydemyPage.myCoursesClick.click();
        Reusable.bekle(2);
        Reusable.keysPageDown();
        qualitydemyPage.editRating.click();

        //qualitydemyPage.puanlama.click();
        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(qualitydemyPage.puanlamaText).click();
        Reusable.bekle(7);

        qualitydemyPage.textGonder.click();
        qualitydemyPage.textGonder.sendKeys("cok iyi");
        //**********Derecelendirmeyi yayınla düğmesine basıldığında seçilen değer atanmalıdır.***//
        qualitydemyPage.publishRating.click();
        qualitydemyPage.startLesson.click();
    }
    @Given("the cancel button is pressed, the scoring screen should close.")
    public void the_cancel_button_is_pressed_the_scoring_screen_should_close() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("score range can be selected")
    public void score_range_can_be_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("It should be possible to write notes in the msg textbox")
    public void it_should_be_possible_to_write_notes_in_the_msg_textbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("The selected value should be assigned when the publish rating button is pressed.")
    public void the_selected_value_should_be_assigned_when_the_publish_rating_button_is_pressed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the start lesson button is clicked, it should go to the relevant course page.")
    public void the_start_lesson_button_is_clicked_it_should_go_to_the_relevant_course_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
