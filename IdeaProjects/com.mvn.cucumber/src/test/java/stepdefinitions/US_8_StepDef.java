package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_8_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("Email must contain the @ sign and the .com extension.")
    public void email_must_contain_the_sign_and_the_com_extension() {
            Driver.getDriver().get(configReader.getProperty("qadUrl"));
            qualitydemyPage.cookies.click();
            qualitydemyPage.login.click();
            qualitydemyPage.sifremiUnuttum.click();
            qualitydemyPage.mButon.sendKeys("goleraema-sofia.eu");
            qualitydemyPage.send.click();
            qualitydemyPage.LoginGirisOnay.isDisplayed();
            Reusable.bekle(2);



    }
    @Given("user not found warning message should be displayed in the upper corner when an email that is not registered to the system is entered.")
    public void user_not_found_warning_message_should_be_displayed_in_the_upper_corner_when_an_email_that_is_not_registered_to_the_system_is_entered() {
        qualitydemyPage.login.click();
        qualitydemyPage.sifremiUnuttum.click();
        qualitydemyPage.mButon.sendKeys("golera@ema-sofia.eu");
        qualitydemyPage.send.click();
        qualitydemyPage.LoginGirisOnay.isDisplayed();
        Reusable.bekle(6);

    }
    @Given("Clicking on the login link should redirect to the login page")
    public void clicking_on_the_login_link_should_redirect_to_the_login_page() {
        qualitydemyPage.login.click();
        qualitydemyPage.sifremiUnuttum.click();
        qualitydemyPage.sifremiUnuttumSayfasi.isDisplayed();
        qualitydemyPage.mButon.sendKeys("golera@ema-gmail.eu");
        qualitydemyPage.send.click();
        qualitydemyPage.error.isDisplayed();
        qualitydemyPage.login.click();
        qualitydemyPage.LoginGiris.isDisplayed();
    }
    @Given("When the correct email is entered and the send request button is clicked, it should redirect to the login page and the message {string} should be seen in the upper corner.")
    public void when_the_correct_email_is_entered_and_the_send_request_button_is_clicked_it_should_redirect_to_the_login_page_and_the_message_should_be_seen_in_the_upper_corner(String string) {
        qualitydemyPage.login.click();
        qualitydemyPage.sifremiUnuttum.click();
        qualitydemyPage.sifremiUnuttumSayfasi.isDisplayed();
        qualitydemyPage.mButon.sendKeys("golera@ema-sofia.eu");
        qualitydemyPage.send.click();
        qualitydemyPage.onay.isDisplayed();
        Reusable.bekle(3);
    }
}
