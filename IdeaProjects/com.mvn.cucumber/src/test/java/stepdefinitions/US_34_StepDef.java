package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.configReader;

public class US_34_StepDef {
    QualitydemyPage qualitydemyPage =new QualitydemyPage();
    @Given("t should be possible to write descriptions in Meta keywords and Meta description textboxes")
    public void tShouldBePossibleToWriteDescriptionsInMetaKeywordsAndMetaDescriptionTextboxes() {

        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("vaildEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("vaildPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.courseManager.click();
        qualitydemyPage.addNewCourse.click();
        qualitydemyPage.seo.click();
        qualitydemyPage.metaKeywords.sendKeys("course"+ Keys.ENTER);
        qualitydemyPage.metaKeywords.sendKeys("team"+ Keys.ENTER);
        qualitydemyPage.metaKeywords.sendKeys("attempt"+ Keys.ENTER);
        qualitydemyPage.metaKeywords.sendKeys(Keys.TAB);
        qualitydemyPage.metaDescription.sendKeys("Today is test day");
    }
}
