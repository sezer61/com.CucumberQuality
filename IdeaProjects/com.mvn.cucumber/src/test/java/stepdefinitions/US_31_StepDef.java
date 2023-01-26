package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_31_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("Data entry shoulxd be possible in the Outcomes textbox and a new Outcomes textbox should be added with the {string} button.")
    public void data_entry_shoulxd_be_possible_in_the_outcomes_textbox_and_a_new_outcomes_textbox_should_be_added_with_the_button(String string) {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        Reusable.bekle(1);
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("vaildEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("vaildPassword"));
        qualitydemyPage.loginButton.click();


    }
    @Given("Outcomes textboxx related to {string} button  should be deleted")
    public void outcomes_textboxx_related_to_button_should_be_deleted(String string) {
        qualitydemyPage.instructorBtn.click();
        qualitydemyPage.courseManager.click();
        qualitydemyPage.addNewCourse.click();
        qualitydemyPage.requirementS.click();
        qualitydemyPage.requirementSend.sendKeys("team");
        qualitydemyPage.requirementSendplus.click();
        qualitydemyPage.requirementSend2.sendKeys("team");
        qualitydemyPage.requirementSendMinus.click();

    }

}
