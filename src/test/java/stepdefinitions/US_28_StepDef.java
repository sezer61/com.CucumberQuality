package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_28_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("the submit button is pressed, it should redirected to the course_edit Curriculum section and Congratulations! message should appear in the corner")
    public void theSubmitButtonIsPressedItShouldRedirectedToTheCourse_editCurriculumSectionAndCongratulationsMessageShouldAppearInTheCorner() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("a@a.com");
        qualitydemyPage.password.sendKeys("Az.123123123");
        qualitydemyPage.loginButton.click();


        qualitydemyPage.instructorLink.click();
        qualitydemyPage.courseManagerLink.click();


        Reusable.bekle(3);
    }
}
