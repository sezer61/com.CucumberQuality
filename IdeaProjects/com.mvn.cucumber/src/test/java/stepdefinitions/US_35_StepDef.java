package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.configReader;

public class US_35_StepDef {

    @Given("Congratulations! message should appear")
    public void congratulationsMessageShouldAppear() {
            //The desired option should be searchable from the Course overview provider dropdown
            //Relevant url should be enterable in Course overview url textbox
            //Image can be uploaded to Course thumbnail
            QualitydemyPage qualitydemyPage_ =new QualitydemyPage();
            Driver.getDriver().get(configReader.getProperty("qadUrl"));
            qualitydemyPage_.cookies.click();
            qualitydemyPage_.login.click();
            qualitydemyPage_.email.sendKeys(configReader.getProperty("vaildEmail"));
            qualitydemyPage_.password.sendKeys(configReader.getProperty("vaildPassword"));
            qualitydemyPage_.loginButton.click();
            qualitydemyPage_.Instructor.click();
            qualitydemyPage_.courseManager.click();
            qualitydemyPage_.addNewCourse.click();

            qualitydemyPage_.seo.click();
            qualitydemyPage_.metaKeywords.sendKeys("course"+ Keys.ENTER);
            qualitydemyPage_.metaKeywords.sendKeys("team"+ Keys.ENTER);
            qualitydemyPage_.metaKeywords.sendKeys("attempt"+ Keys.ENTER);
            qualitydemyPage_.metaKeywords.sendKeys(Keys.TAB);
            qualitydemyPage_.metaDescription.sendKeys("Today is test day");

            qualitydemyPage_.buttonrightclick.click();
            qualitydemyPage_.titleDisplayed.isDisplayed();



    }
}
