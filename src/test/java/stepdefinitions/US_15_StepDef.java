package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_15_StepDef {
    @Given("First name,Last name,Title,Your skills,Biography,Add your twitter link,Add your facebook linkAdd your linkedin link texts should be able to get entered")
    public void first_name_last_name_title_your_skills_biography_add_your_twitter_link_add_your_facebook_link_add_your_linkedin_link_texts_should_be_able_to_get_entered() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.firstLoginButton.click();
        qualitydemyPage.cookieAcceptButton.click();
        Reusable.bekle(4);

        qualitydemyPage.userMailBox.sendKeys(configReader.getProperty("QudemyEmailAddress"));
        qualitydemyPage.userPasswordBox.sendKeys(configReader.getProperty("QudemyPassword"));

        qualitydemyPage.secondLoginButton.click();
        Reusable.bekle(7);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.profileImg);
        actions.click(qualitydemyPage.userProfile).perform();

        String expTitle = "User Profile";
        String actTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actTitle.contains(expTitle));

        Assert.assertTrue(qualitydemyPage.firstNameBox.isEnabled());
        Assert.assertTrue(qualitydemyPage.lastNameBox.isEnabled());
        Assert.assertTrue(qualitydemyPage.titleBox.isEnabled());
        Assert.assertTrue(qualitydemyPage.skillsBox.isEnabled());
        //actions.keyDown(Keys.PAGE_DOWN).perform();
        //Reuseable.bekle(4);
        //Assert.assertTrue(qualitydemyPage.biographyBox.isEnabled());
        Reusable.bekle(3);
        actions.keyDown(Keys.PAGE_DOWN).perform();
        Reusable.bekle(3);
        Assert.assertTrue(qualitydemyPage.twLinkBox.isEnabled());
        Assert.assertTrue(qualitydemyPage.fcLinkBox.isEnabled());
        Assert.assertTrue(qualitydemyPage.lnLinkBox.isEnabled());
    }
    @Given("the save button is pressed after the changes made, the changes should be saved.")
    public void the_save_button_is_pressed_after_the_changes_made_the_changes_should_be_saved() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.firstLoginButton.click();
        qualitydemyPage.cookieAcceptButton.click();
        Reusable.bekle(4);

        qualitydemyPage.userMailBox.sendKeys(configReader.getProperty("QudemyEmailAddress"));
        qualitydemyPage.userPasswordBox.sendKeys(configReader.getProperty("QudemyPassword"));

        qualitydemyPage.secondLoginButton.click();
        Reusable.bekle(7);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.profileImg);
        actions.click(qualitydemyPage.userProfile).perform();

        String expTitle = "User Profile";
        String actTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actTitle.contains(expTitle));

        qualitydemyPage.firstNameBox.sendKeys("john" + Keys.TAB);
        qualitydemyPage.lastNameBox.sendKeys("doe" + Keys.TAB);
        qualitydemyPage.titleBox.sendKeys("john" + Keys.TAB);
        actions.keyDown(Keys.PAGE_DOWN).sendKeys(qualitydemyPage.skillsBox,"learn selenium" + Keys.TAB);
        actions.keyDown(Keys.PAGE_DOWN).sendKeys(qualitydemyPage.biographyBox,"learn selenium" + Keys.TAB);
        actions.keyDown(Keys.PAGE_DOWN).sendKeys(qualitydemyPage.twLinkBox,"learn selenium" + Keys.TAB);
        actions.keyDown(Keys.PAGE_DOWN).sendKeys(qualitydemyPage.fcLinkBox,"learn selenium" + Keys.TAB);
        actions.keyDown(Keys.PAGE_DOWN).sendKeys(qualitydemyPage.lnLinkBox,"learn selenium");
        Assert.assertTrue(qualitydemyPage.saveButton.isDisplayed());
        Reusable.bekle(2);
        actions.keyDown(Keys.PAGE_DOWN).click();

        Driver.closeDriver();
    }
    @Given("profile button should redirect to user profile page")
    public void profile_button_should_redirect_to_user_profile_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
