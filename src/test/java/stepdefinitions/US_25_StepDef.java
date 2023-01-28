package stepdefinitions;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_25_StepDef {
    @AfterMethod
    public void tearDown(){Driver.getDriver().quit();}

    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("Check if this is a free course checkbox should be selectable")
    public void check_if_this_is_a_free_course_checkbox_should_be_selectable() {
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
        qualitydemyPage.pricingSection.click();
        Reusable.bekle(3);
        if (!qualitydemyPage.freeCheckbox.isSelected()) {
            qualitydemyPage.freeCheckboxLabel.click();
        }

        Reusable.bekle(3);
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        Reusable.bekle(3);
        qualitydemyPage.viewOnFrontend.click();
        Reusable.switchToWindow1("C# programming from zero to hero");
        Reusable.bekle(2);
        Assert.assertTrue(qualitydemyPage.courseFrontendDescription.getText().contains("Free"));
    }
    @Given("The desired price should be able to get entered as a number to course price textbox")
    public void the_desired_price_should_be_able_to_get_entered_as_a_number_to_course_price_textbox() {
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
        qualitydemyPage.pricingSection.click();
        Reusable.bekle(3);
        if (qualitydemyPage.freeCheckbox.isSelected()) {
            qualitydemyPage.freeCheckboxLabel.click();

        }
        qualitydemyPage.desiredPriceTextbox.clear();
        String input="120";
        try {
            double inputNumber=Double.parseDouble(input);
            qualitydemyPage.desiredPriceTextbox.sendKeys(input);
            qualitydemyPage.finishBtn.click();
            qualitydemyPage.courseSubmitBtn.click();
            qualitydemyPage.viewOnFrontend.click();
            Reusable.switchToWindow1("C# programming from zero to hero");
            Reusable.bekle(2);
            Assert.assertTrue(qualitydemyPage.courseFrontendDescription.getText().contains(input));
        }catch (Exception e) {
            qualitydemyPage.desiredPriceTextbox.sendKeys(input);
            qualitydemyPage.finishBtn.click();
            qualitydemyPage.courseSubmitBtn.click();
            qualitydemyPage.viewOnFrontend.click();
            Reusable.switchToWindow1("C# programming from zero to hero");
            Reusable.bekle(2);
            Assert.assertFalse(qualitydemyPage.courseFrontendDescription.getText().contains(input));
        }


    }
    @Given("Check if this course has discount checkbox can be selected")
    public void check_if_this_course_has_discount_checkbox_can_be_selected() {
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
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.pricingSection.click();
        Reusable.bekle(2);
        if (!qualitydemyPage.discountCheckbox.isSelected()){
            qualitydemyPage.discountLabel.click();
            Reusable.bekle(2);
            Assert.assertTrue(qualitydemyPage.discountCheckbox.isSelected());
        }else {
            qualitydemyPage.discountLabel.click();
            Assert.assertFalse(qualitydemyPage.discountCheckbox.isSelected());
        }

    }
    @Given("The desired discount should be able to get entered as number to Discounted price textbox")
    public void the_desired_discount_should_be_able_to_get_entered_as_number_to_discounted_price_textbox() {
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
        qualitydemyPage.pricingSection.click();
        qualitydemyPage.discountedPriceTextbox.clear();

        String input="234";


        try {
            double discountedPrice=Double.parseDouble(input);
            qualitydemyPage.discountedPriceTextbox.sendKeys(input);
            Reusable.bekle(2);
            qualitydemyPage.finishBtn.click();
            qualitydemyPage.courseSubmitBtn.click();
            qualitydemyPage.viewOnFrontend.click();
            Reusable.switchToWindow1("C# programming from zero to hero");
            Reusable.bekle(2);
            Assert.assertTrue(qualitydemyPage.courseFrontendDescription.getText().contains(input));


        }catch (NumberFormatException e) {

            qualitydemyPage.discountedPriceTextbox.sendKeys(input);
            Reusable.bekle(2);
            qualitydemyPage.finishBtn.click();
            qualitydemyPage.courseSubmitBtn.click();
            qualitydemyPage.viewOnFrontend.click();
            Reusable.switchToWindow1("C# programming from zero to hero");
            Reusable.bekle(2);
            System.out.println(qualitydemyPage.courseFrontendDescription.getText());
            Assert.assertFalse(qualitydemyPage.courseFrontendDescription.getText().contains(input));
        }
    }
}
