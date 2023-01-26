package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

import java.util.List;
import java.util.stream.Collectors;

public class US_24_StepDef {

    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("Data entry should be possible in the Outcomes textbox and a new Outcomes textbox should be added with the {string} button.")
    public void data_entry_should_be_possible_in_the_outcomes_textbox_and_a_new_outcomes_textbox_should_be_added_with_the_button(String string) {
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
        qualitydemyPage.outcomesLink.click();
        qualitydemyPage.outcomesTextBox1.sendKeys("LinQ");
        qualitydemyPage.plusBtn.click();
        qualitydemyPage.outcomesTextBox2.sendKeys("Form Applications");
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        qualitydemyPage.viewOnFrontend.click();
        Reusable.switchToWindow1("C# programming from zero to hero");
        List<String> outComeList=qualitydemyPage.outcomeList.stream().map(WebElement::getText).collect(Collectors.toList());
        Assert.assertTrue(outComeList.contains("Form Applications"));
    }
    @Given("Outcomes textbox related to {string} button  should be deleted")
    public void outcomes_textbox_related_to_button_should_be_deleted(String string) {
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
        qualitydemyPage.outcomesLink.click();
        qualitydemyPage.minusBtn.click();
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        qualitydemyPage.viewOnFrontend.click();
        Reusable.switchToWindow1("C# programming from zero to hero");
        List<String> outComeList=qualitydemyPage.outcomeList.stream().map(WebElement::getText).collect(Collectors.toList());
        Assert.assertFalse(outComeList.contains("Form Applications"));
    }
}
