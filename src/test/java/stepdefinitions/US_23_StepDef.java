package stepdefinitions;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_23_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("Data entry should be poscsible in the requirements textbox and a new requirements textbox should be added with the {string} button.")
    public void data_entry_should_be_poscsible_in_the_requirements_textbox_and_a_new_requirements_textbox_should_be_added_with_the_button(String string) {
        qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginBtn.click();
        qualitydemyPage.emailTextBox.sendKeys("pisetap755@tohup.com");
        qualitydemyPage.password.sendKeys("Fy12068036!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorBtn.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.courseLink.click();
        qualitydemyPage.getRequirementBtn.click();
        qualitydemyPage.requirementPlusBtn.click();
        qualitydemyPage.requirementPlusTextBox.sendKeys("basic algorythm knowledge needed");
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        qualitydemyPage.getRequirementBtn.click();
        Assert.assertTrue(qualitydemyPage.requirementPlusBtn.isDisplayed());
    }
    @Given("Requirements textbox relcated to {string} button should be deleted")
    public void requirements_textbox_relcated_to_button_should_be_deleted(String string) {
        Reusable.bekle(3);
        qualitydemyPage.requirementMinusBtn.click();
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        qualitydemyPage.getRequirementBtn.click();
        Assert.assertFalse(qualitydemyPage.requirementMinusBtn.isDisplayed());
    }

}
