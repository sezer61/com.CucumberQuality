package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_26_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("The desirexd option should be searchable from the Course overview provider dropdown")
    public void the_desirexd_option_should_be_searchable_from_the_course_overview_provider_dropdown() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("a@a.com");
        qualitydemyPage.password.sendKeys("Az.123123123");
        qualitydemyPage.loginButton.click();
        qualitydemyPage.instructorBtn.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.addNewCourse.click();

        Reusable.bekle(3);
    }
    @Given("Relevant url should be entered in Course overview url textbox")
    public void relevant_url_should_be_entered_in_course_overview_url_textbox() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("a@a.com");
        qualitydemyPage.password.sendKeys("Az.123123123");
        qualitydemyPage.loginButton.click();
        qualitydemyPage.instructorBtn.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.addNewCourse.click();
        qualitydemyPage.media.click();

        // youtube kismina basma kismi tam olarak yapamadim
        qualitydemyPage.youtubebuttonu.click();
        qualitydemyPage.courseOverviewUrl.sendKeys("https://www.youtube.com/");
    }
    @Given("Image can be uploaded to Course thumbnail")
    public void image_can_be_uploaded_to_course_thumbnail() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("a@a.com");
        qualitydemyPage.password.sendKeys("Az.123123123");
        qualitydemyPage.loginButton.click();
        qualitydemyPage.instructorBtn.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.addNewCourse.click();
        qualitydemyPage.media.click();
    }

}
