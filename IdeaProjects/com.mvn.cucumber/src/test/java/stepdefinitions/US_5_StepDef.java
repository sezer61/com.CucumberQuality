package stepdefinitions;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_5_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("When the forgot password link is clicked, it should redirect to the forgot_password page")
    public void when_the_forgot_password_link_is_clicked_it_should_redirect_to_the_forgot_password_page() {

        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);

        qualitydemyPage.ilkLoginLinki.click();


        qualitydemyPage.forgotPassword.click();
        String forgotUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(forgotUrl.contains("password"));



    }
    @Given("When the sign up link is clicked, it should redirect to the sign_up page")
    public void when_the_sign_up_link_is_clicked_it_should_redirect_to_the_sign_up_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);

        qualitydemyPage.signUpButonu.click();
        String signUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(signUrl.contains("sign_up"));
    }
    @Given("when logged in correctly, it should redirect to the HomePage page and a welcome message should appear in the corner.")
    public void when_logged_in_correctly_it_should_redirect_to_the_home_page_page_and_a_welcome_message_should_appear_in_the_corner() {
        /*
       When logged in correctly,
        it should redirect to the HomePage page and a welcome message should appear in the corner.
        */

        ///html/body/script[12]

        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);


        qualitydemyPage.ilkLoginLinki.click();




        qualitydemyPage.kullaniciEmailKutusu.sendKeys("anevzatcelik@gmail.com" );


        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");




        qualitydemyPage.loginButonu.click();


        Assert.assertTrue(qualitydemyPage.basariliGirisCourseLinki.isDisplayed());
    }
    @Given("when he logs in wrong, the message Provide your valid login credentials should appear")
    public void when_he_logs_in_wrong_the_message_provide_your_valid_login_credentials_should_appear() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);

        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("user_1106147@login.com");
        qualitydemyPage.passwordKutusu.sendKeys("1234");
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.invalidLogin.isDisplayed());
    }
    @Given("email adress should be an email format.")
    public void email_adress_should_be_an_email_format() {
        //Email adress should be an email format.

        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);

        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("usewe");
        qualitydemyPage.passwordKutusu.sendKeys("Q122.1234");
        qualitydemyPage.loginButonu.click();
        Reusable.bekle(3);

        Assert.assertTrue(qualitydemyPage.invalidLogin.isDisplayed());
    }

}
