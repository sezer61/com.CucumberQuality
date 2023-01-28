package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_29_StepDef {
    @AfterMethod
    public void tearDown(){Driver.getDriver().quit();}
    QualitydemyPage qualitydemyPage=new QualitydemyPage();


    @Given("Course title, Short description and description sections should be accessible.")
    public void course_title_short_description_and_description_sections_should_be_accessible() {
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
        qualitydemyPage.basicLinkBtn.click();
        //Reuseable.bekle(3);
        Assert.assertTrue(qualitydemyPage.courseTitle.isEnabled());
        Assert.assertTrue(qualitydemyPage.shortDescription.isEnabled());
        Assert.assertTrue(qualitydemyPage.description.isEnabled());
        qualitydemyPage.basicLinkBtn.click();
        Reusable.bekle(30);
        Assert.assertTrue(qualitydemyPage.courseTitle.isEnabled());
        Assert.assertTrue(qualitydemyPage.shortDescription.isEnabled());
        Assert.assertTrue(qualitydemyPage.description.isEnabled());
    }
    @Given("The desired category should be selectable from the Category section.")
    public void the_desired_category_should_be_selectable_from_the_category_section() {
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
        qualitydemyPage.basicLinkBtn.click();
        qualitydemyPage.categoryDropMenu.click();
        qualitydemyPage.webDesignSubmenu.click();
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        qualitydemyPage.basicLinkBtn.click();
        Assert.assertEquals(qualitydemyPage.categoryDropMenu.getText(), "Web Design for Web Developers");

    }
    @Given("The desired level sshould be selectable from the Level section.")
    public void the_desired_level_sshould_be_selectable_from_the_level_section() {
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
        qualitydemyPage.basicLinkBtn.click();
        Select select=new Select(qualitydemyPage.selectMenu);
        select.selectByValue("beginner");
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        qualitydemyPage.basicLinkBtn.click();
        Assert.assertEquals(qualitydemyPage.levelBox.getText(),"Beginner");
    }
    @Given("Enable drip content button shold be changeble")
    public void enable_drip_content_button_shold_be_changeble() {
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
        qualitydemyPage.basicLinkBtn.click();
        Assert.assertTrue(qualitydemyPage.dripContent.isEnabled());
    }
    @Given("Check iif this course is top course checkbox should be selectable")
    public void check_iif_this_course_is_top_course_checkbox_should_be_selectable() {
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
        qualitydemyPage.basicLinkBtn.click();
        if (!qualitydemyPage.topCourseCheckBox.isSelected()){
            qualitydemyPage.topCourseLabel.click();
            qualitydemyPage.finishBtn.click();
            qualitydemyPage.courseSubmitBtn.click();
            qualitydemyPage.basicLinkBtn.click();
            Assert.assertTrue(qualitydemyPage.topCourseCheckBox.isSelected());
        }else {
            qualitydemyPage.topCourseLabel.click();
            qualitydemyPage.finishBtn.click();
            qualitydemyPage.courseSubmitBtn.click();
            qualitydemyPage.basicLinkBtn.click();
            Assert.assertFalse(qualitydemyPage.topCourseCheckBox.isSelected());
        }
    }

}
