package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.QualitydemyPage;
import utilities.*;
public class US_39_StepDef {

    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("The pay with stripe button should be visible after clicking the stripe logo")
    public void the_pay_with_stripe_button_should_be_visible_after_clicking_the_stripe_logo() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("39vaildEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("vaildPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.searchBx.sendKeys("course");
        qualitydemyPage.searchBxClick.click();
        Reusable.scrollDown500();
        Reusable.bekle(3);
        qualitydemyPage.searchBxListCourseOne.click();
        qualitydemyPage.courseBuyClick.click();
        qualitydemyPage.checkoutClick.click();
        qualitydemyPage.checkoutStripe.click();
        Reusable.bekle(2);
        qualitydemyPage.closeStripe.click();
        qualitydemyPage.shoppingDisplayed.isDisplayed();
        Reusable.scrollDown250();

    }
    @Given("the pay with stripe button is clicked, it should redirect to checkout.stripe.com")
    public void the_pay_with_stripe_button_is_clicked_it_should_redirect_to_checkout_stripe_com() {
        qualitydemyPage.checkoutClick.click();
        qualitydemyPage.checkoutStripe.click();
        qualitydemyPage.payWithStripee.click();
    }
    @Given("the close icon is clicked, it should redirect to the shopping cart page.")
    public void the_close_icon_is_clicked_it_should_redirect_to_the_shopping_cart_page() {
        qualitydemyPage.emailStripe.sendKeys(configReader.getProperty("vaildEmail"));
        qualitydemyPage.cardNumberStripe.sendKeys(configReader.getProperty("stripeCartInformationCnumber"));
        qualitydemyPage.cardInfoStripeAaYy.sendKeys(configReader.getProperty("stripeCartInformationAayy"));

    }
    @Given("E-mail, card information, country information should be filled in appropriately on checkout.stripe.com page")
    public void e_mail_card_information_country_information_should_be_filled_in_appropriately_on_checkout_stripe_com_page() {
        qualitydemyPage.cardInfoStripeCvc.sendKeys(configReader.getProperty("stripeCartInformationCvc"));
        qualitydemyPage.cardInfoStripeName.sendKeys(configReader.getProperty("stripeCartInformationName"));
        qualitydemyPage.stripePay.click();
    }
    @Given("the pay button is pressed, it should be checked that the necessary information has been filled.")
    public void the_pay_button_is_pressed_it_should_be_checked_that_the_necessary_information_has_been_filled() {
        qualitydemyPage.stripePay.click();
    }
    @Given("If the required information is filled when the pay button is clicked, a green tick should appear on the pay button and then it should redirect to my_courses page.")
    public void ıf_the_required_information_is_filled_when_the_pay_button_is_clicked_a_green_tick_should_appear_on_the_pay_button_and_then_it_should_redirect_to_my_courses_page() {
        qualitydemyPage.myCoursess.isDisplayed();
        qualitydemyPage.myCoursessTitle.isDisplayed();
    }
}
