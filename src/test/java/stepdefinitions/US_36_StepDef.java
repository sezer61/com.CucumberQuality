package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_36_StepDef {

    QualitydemyPage qualitydemyPage_ =new QualitydemyPage();
    @Given("The name and email address sections should not be changed.")
    public void the_name_and_email_address_sections_should_not_be_changed() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage_.cookies.click();
        qualitydemyPage_.login.click();
        qualitydemyPage_.email.sendKeys(configReader.getProperty("36vaildEmail"));
        qualitydemyPage_.password.sendKeys(configReader.getProperty("qaStudentVaildPassword"));
        qualitydemyPage_.loginButton.click();
        qualitydemyPage_.Instructor.click();
        Assert.assertTrue(qualitydemyPage_.firstNameShouldNotChange.isEnabled());
        qualitydemyPage_.emailShouldNotChange.isDisplayed();
    }
    @Given("Address, phone number and any message sections should be accessible.")
    public void address_phone_number_and_any_message_sections_should_be_accessible() {
        qualitydemyPage_.addressDisplayed.sendKeys("Istanbul/Sisli");
        qualitydemyPage_.phoneNumbersDisplayed.sendKeys("55555555555");
        qualitydemyPage_.anyMessageDisplayed.sendKeys("Win Win");
        WebElement browse = Driver.getDriver().findElement(By.xpath("//*[@id='document']"));
    }
    @Given("documents should be selectable in the document section")
    public void documents_should_be_selectable_in_the_document_section() {
        WebElement browse = Driver.getDriver().findElement(By.xpath("//*[@id='document']"));
        //click on ‘Choose file’ to upload the desired file
        String dosyaYolu= System.getProperty("user.home");
        Reusable.bekle(2);
        String file=System.getProperty(dosyaYolu,"C:\\Users\\sezer\\IdeaProjects\\Com.QualityDemyTeam10\\team16.jpeg");
        browse.sendKeys(file);
    }
    @Given("the apply button is pressed, it should lead to the {string} section and the {string} button should be seen.")
    public void the_apply_button_is_pressed_it_should_lead_to_the_section_and_the_button_should_be_seen(String string, String string2) {
        Reusable.keysPageDown();
        Reusable.bekle(3);
        qualitydemyPage_.apply.click();
        qualitydemyPage_.clickToActiveDisplayed.isDisplayed();
    }
    @Given("the click to activate button is pressed, the message {string} should appear and when the   confirmation button is pressed, it is verified that the status part has changed to Approved.")
    public void the_click_to_activate_button_is_pressed_the_message_should_appear_and_when_the_confirmation_button_is_pressed_it_is_verified_that_the_status_part_has_changed_to_approved(String string) {
        qualitydemyPage_.clickToActiveDisplayed.click();
        Reusable.bekle(4);
        Driver.getDriver().switchTo().alert().accept();
        Reusable.bekle(3);
        qualitydemyPage_.approvedDisplayed.isDisplayed();
        Reusable.bekle(3);
    }
}
