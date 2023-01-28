package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_2_StepDef {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("Logo,Categories,Log in, Sign Up,shopping cart icon,Search icon,Search button, {int} Online courses text, Expert instruction text, Lifetime access text, Top categories text,Top courses text, Top {int} Latest courses text,Featured instructor text ,Get started button,Join now button, facebook icon, twitter icon, should be visible")
    public void logo_categories_log_in_sign_up_shopping_cart_icon_search_icon_search_button_online_courses_text_expert_instruction_text_lifetime_access_text_top_categories_text_top_courses_text_top_latest_courses_text_featured_instructor_text_get_started_button_join_now_button_facebook_icon_twitter_icon_should_be_visible(Integer int1, Integer int2) {


        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();


        qualitydemyPage.email.sendKeys("doyitap469@tingn.com");
        qualitydemyPage.password.sendKeys("Hy270154!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorElement.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.courseLinkH.click();
        qualitydemyPage.addSection.click();
        Reusable.bekle(2);
        qualitydemyPage.addSectionclose.click();
        Reusable.bekle(3);
        Assert.assertFalse(qualitydemyPage.addSectionclose.isDisplayed());
    }
    @Given("Services, Features, Pricing, Contact Us, About Us, ? icon, Login, Registration headings should be clickable")
    public void services_features_pricing_contact_us_about_us_icon_login_registration_headings_should_be_clickable() {
        qualitydemyPage.courseLinkH.click();
        qualitydemyPage.addSection.click();
        Reusable.bekle(2);
        qualitydemyPage.addSectionclose.click();
        Reusable.bekle(3);
        Assert.assertFalse(qualitydemyPage.addSectionclose.isDisplayed());
    }

}
