package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_6_StepDef {
    QualitydemyPage qualitydemyPage= new QualitydemyPage();
    @Given("the correct data is entered and the sign up button is pressed, it should redirect to the verification_code page and a green verification message should appear in the corner.")
    public void the_correct_data_is_entered_and_the_sign_up_button_is_pressed_it_should_redirect_to_the_verification_code_page_and_a_green_verification_message_should_appear_in_the_corner() {
        //Sign_up sayfasından kayıt mümkün olmalı ve sayfanın fonksiyonları düzgün çalışmalıdır.
        /*
        Doğru veriler girilip üye ol butonuna basıldığında doğrulama kodu sayfasına yönlendirilmeli ve yeşil bir
        doğrulama mesajı köşede görünmelidir.
         */
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);

        qualitydemyPage.signUpButonu.click();

        qualitydemyPage.firstname.sendKeys("bunyamin");
        qualitydemyPage.lastname.sendKeys("sari");
        qualitydemyPage.emailforSignUp.sendKeys("user_1106147@login.com");
        qualitydemyPage.passwordForSingup.sendKeys("Bsarim654321");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Reusable.bekle(3);


        qualitydemyPage.signUpBox.click();



        Assert.assertTrue(qualitydemyPage.succesword.isDisplayed());

        
    }
    @Given("Clickingg on the login link should redirect to the login page")
    public void clickingg_on_the_login_link_should_redirect_to_the_login_page() {
        ///Clicking on the login link should redirect to the login page

        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);

        qualitydemyPage.ilkLoginLinki.click();

        Assert.assertTrue(qualitydemyPage.ilkLoginLinki.isDisplayed());
    }
    @Given("first name and last name must be at least {int} letters")
    public void first_name_and_last_name_must_be_at_least_letters(Integer int1) {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);

        //First name and last name must be at least 2 letters

        qualitydemyPage.signUpButonu.click();

        qualitydemyPage.firstname.sendKeys("b");
        qualitydemyPage.lastname.sendKeys("s");
        qualitydemyPage.emailforSignUp.sendKeys("user_1106147@login.com");
        qualitydemyPage.passwordForSingup.sendKeys("Bsarim654321");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Reusable.bekle(3);


        qualitydemyPage.signUpBox.click();



        Assert.assertTrue(qualitydemyPage.nameLastnameWarning.isDisplayed());
    }
    @Given("Password must contain uppercase, lowercase, numbers and special characters")
    public void password_must_contain_uppercase_lowercase_numbers_and_special_characters() {
        //Password must contain uppercase, lowercase, numbers and special characters

        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);


        qualitydemyPage.signUpButonu.click();

        qualitydemyPage.firstname.sendKeys("bunyamin");
        qualitydemyPage.lastname.sendKeys("sari");
        qualitydemyPage.emailforSignUp.sendKeys("user_1106147@login.com");
        qualitydemyPage.passwordForSingup.sendKeys("12345");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Reusable.bekle(3);


        qualitydemyPage.signUpBox.click();

        Assert.assertTrue(qualitydemyPage.passwordWarning.isDisplayed());
    }
    @Given("Email muust contain the @ sign and the .com extension.")
    public void email_muust_contain_the_sign_and_the_com_extension() {
        //Email must contain the @ sign and the .com extension.

        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);


        qualitydemyPage.signUpButonu.click();

        qualitydemyPage.firstname.sendKeys("bunyamin");
        qualitydemyPage.lastname.sendKeys("sari");
        qualitydemyPage.emailforSignUp.sendKeys("userert");
        qualitydemyPage.passwordForSingup.sendKeys("Qwee.1223456");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Reusable.bekle(3);


        qualitydemyPage.signUpBox.click();

        Assert.assertTrue(qualitydemyPage.missingEmail.isDisplayed());
    }
    @Given("It should give a warning message when a previously registered email is entered into the system.")
    public void it_should_give_a_warning_message_when_a_previously_registered_email_is_entered_into_the_system() {
        //It should give a warning message when a previously registered email is entered into the system.

        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage.cookies.click();
        Reusable.bekle(3);


        qualitydemyPage.signUpButonu.click();

        qualitydemyPage.firstname.sendKeys("bunyamin");
        qualitydemyPage.lastname.sendKeys("sari");
        qualitydemyPage.emailforSignUp.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordForSingup.sendKeys("Qw.e212345");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Reusable.bekle(3);


        qualitydemyPage.signUpBox.click();
        Reusable.bekle(2);

        Assert.assertTrue(qualitydemyPage.registeredEmail.isDisplayed());
    }

}
