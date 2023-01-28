package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.configReader;

public class US_1_StepDef {

    @Given("When the user accesses the site with the {string} link, it should be verified that the main page is opened.")
    public void when_the_user_accesses_the_site_with_the_link_it_should_be_verified_that_the_main_page_is_opened(String string) {
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

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
        qualitydemyPage.inputText.sendKeys("to be");
        qualitydemyPage.addSectionSubmit.click();
        String actualStr=qualitydemyPage.sections.getText();
        Assert.assertTrue(actualStr.contains("to be"));
    }
}
