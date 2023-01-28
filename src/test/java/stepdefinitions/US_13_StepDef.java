package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_13_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("The admin and the Instructor of the purchased courses should be able to choose from the dropdown box")
    public void the_admin_and_the_ınstructor_of_the_purchased_courses_should_be_able_to_choose_from_the_dropdown_box() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.firstLogin.click();
        Reusable.bekle(1);
        qualitydemyPage.emailTextBox.sendKeys(configReader.getProperty("qaStudentVaildEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaStudentVaildPassword"));
        qualitydemyPage.cookieAccept.click();
        Reusable.bekle(1);
        qualitydemyPage.loginButton.click();
        Reusable.bekle(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.myProfileIcon)
                .moveToElement(qualitydemyPage.myMessages)
                .click().perform();

        Select select = new Select(qualitydemyPage.selectList);
        select.selectByValue("1");
        int expData = 0;
        int actData = 2;
        if (qualitydemyPage.selectList.getText().contains("Admin User")){
            expData++;
        }
        select.selectByValue("42");
        if (qualitydemyPage.selectList.getText().contains("Insructor")){
            expData++;
        }

        Assert.assertEquals(actData,expData);

    }
    @Given("message textbox must be accessible")
    public void message_textbox_must_be_accessible() {
        Assert.assertTrue(qualitydemyPage.messageTextBox.isEnabled());
    }
    @Given("A message should be sent to the relevant party by clicking the send button.")
    public void a_message_should_be_sent_to_the_relevant_party_by_clicking_the_send_button() {
        Reusable.bekle(2);
        String expMessageText = "who are you yaw";
        qualitydemyPage.messageTextBox.sendKeys(expMessageText);
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.sendMessageButton);
        Reusable.bekle(2);
        qualitydemyPage.sendMessageButton.click();
        Reusable.bekle(2);

        String actMessageText = qualitydemyPage.messageContent.get(qualitydemyPage.messageContent.size()-1).getText();
        Assert.assertTrue(actMessageText.contains(expMessageText));
    }
    @Given("the cancel button is pressed, the new message section should be cancelled.")
    public void the_cancel_button_is_pressed_the_new_message_section_should_be_cancelled() {
        Driver.getDriver().navigate().back();
        Reusable.bekle(2);
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.cancelMessageButton);
        Reusable.bekle(2);
        qualitydemyPage.cancelMessageButton.click();
        Reusable.bekle(1);
        Assert.assertFalse(qualitydemyPage.messageDetailBox.getText().contains("New message"));
    }
    @Given("compose button is pressed, new message section should be seen.")
    public void compose_button_is_pressed_new_message_section_should_be_seen() {
        Reusable.bekle(1);
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.composeButton);
        Reusable.bekle(2);
        qualitydemyPage.composeButton.click();
        Reusable.bekle(1);
        Assert.assertTrue(qualitydemyPage.messageTextBox.isEnabled());
    }
    @Given("you click on the parties with which you have corresponded before, the correspondence history should appear.")
    public void you_click_on_the_parties_with_which_you_have_corresponded_before_the_correspondence_history_should_appear() {
        Reusable.bekle(1);
        qualitydemyPage.messageSenderAreas.get(0).click();
        Reusable.bekle(1);
        int control=0;
        if (qualitydemyPage.messageContent.size()>0){
            control++;
        }

        qualitydemyPage.messageSenderAreas.get(1).click();
        Reusable.bekle(1);
        if (qualitydemyPage.messageContent.size()>0){
            control++;
        }
        Assert.assertEquals(qualitydemyPage.messageSenderAreas.size(),control);
    }

}
