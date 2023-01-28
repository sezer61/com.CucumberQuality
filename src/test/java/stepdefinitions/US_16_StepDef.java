package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_16_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("The account button should redirect to the user_credentials page")
    public void the_account_button_should_redirect_to_the_user_credentials_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.firstLoginButton.click();
        qualitydemyPage.cookieAcceptButton.click();
        Reusable.bekle(4);

        qualitydemyPage.userMailBox.sendKeys("pisetap755@tohup.com");
        qualitydemyPage.userPasswordBox.sendKeys("Fy12068036!");

        qualitydemyPage.secondLoginButton.click();
        Reusable.bekle(7);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.profileImg);
        actions.click(qualitydemyPage.userProfile).perform();
    }
    @Given("Value must be entered in Current password,New password,Confirm password textboxes")
    public void value_must_be_entered_in_current_password_new_password_confirm_password_textboxes() {
        qualitydemyPage.accountButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("user_credentials"));
    }
    @Given("If the New password and Confirm password values are the same when the save change button is clicked, the change should be saved.")
    public void if_the_new_password_and_confirm_password_values_are_the_same_when_the_save_change_button_is_clicked_the_change_should_be_saved() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.firstLoginButton.click();
        qualitydemyPage.cookieAcceptButton.click();
        Reusable.bekle(4);

        qualitydemyPage.userMailBox.sendKeys("pisetap755@tohup.com");
        qualitydemyPage.userPasswordBox.sendKeys("Fy12068036!");

        qualitydemyPage.secondLoginButton.click();
        Reusable.bekle(7);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.profileImg);
        actions.click(qualitydemyPage.userProfile).perform();
    }
    @Given("If the New password and Confirm password values are different when the save change button is clicked, the Mismatch password warning message should appear in the upper corner.")
    public void if_the_new_password_and_confirm_password_values_are_different_when_the_save_change_button_is_clicked_the_mismatch_password_warning_message_should_appear_in_the_upper_corner() {
        Reusable.bekle(3);
        qualitydemyPage.accountButton.click();
        Reusable.bekle(3);
        Assert.assertTrue(qualitydemyPage.currentPassword.isEnabled());
        Assert.assertTrue(qualitydemyPage.newPassword.isEnabled());
        Assert.assertTrue(qualitydemyPage.confirmPassword.isEnabled());
    }

}
