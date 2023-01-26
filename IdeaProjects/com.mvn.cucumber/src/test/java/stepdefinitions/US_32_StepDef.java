package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_32_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("Check ifg this is a free course checkbox should be selectable")
    public void check_ifg_this_is_a_free_course_checkbox_should_be_selectable() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        Reusable.bekle(1);
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("vaildEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("vaildPassword"));
        qualitydemyPage.loginButton.click();


    }
    @Given("the desired price should be enterable as a number to Course price textbox")
    public void the_desired_price_should_be_enterable_as_a_number_to_course_price_textbox() {
        qualitydemyPage.instructorBtn.click();
        qualitydemyPage.courseManager.click();
        qualitydemyPage.addNewCourse.click();
        qualitydemyPage.pricingSection.click();
        qualitydemyPage.freeCheckboxClic.click();
        qualitydemyPage.freeCheckboxLabel.isEnabled();

    }
    @Given("Check if this course has discount checkbox should be selectable")
    public void check_if_this_course_has_discount_checkbox_should_be_selectable() {
        qualitydemyPage.freeCheckboxClic.click();

    }
    @Given("the desired discount should be enterable as number to Discounted price textbox")
    public void the_desired_discount_should_be_enterable_as_number_to_discounted_price_textbox() {
        Reusable.bekle(2);
        qualitydemyPage.priceCClick.sendKeys("105");
        qualitydemyPage.discountedPriceTextbox.sendKeys("100");
        qualitydemyPage.rightBold.click();

    }

}
