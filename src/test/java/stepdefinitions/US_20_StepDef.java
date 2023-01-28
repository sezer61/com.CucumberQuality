package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

import java.util.Set;

public class US_20_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("the Back to course list button is clicked, it should redirect to the course manager page.")
    public void the_back_to_course_list_button_is_clicked_it_should_redirect_to_the_course_manager_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("qaInspectorEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaInspectorPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.courseManagerBtn.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Reusable.bekle(1);

        qualitydemyPage.courseListBirinciDers.click();
        qualitydemyPage.backtoCourseListButton.click();

        String expectedTitle= "Active courses";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Given("the View on frontend button is clicked, it should redirect to the page of the relevant course content.")
    public void the_view_on_frontend_button_is_clicked_it_should_redirect_to_the_page_of_the_relevant_course_content() {
        String birinciDersAdi="Free Java Dersleri 01 Programlamaya Giris";

        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("qaInspectorEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaInspectorPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.courseManagerBtn.click();

        String ilkSayfaHandleDegeri=Driver.getDriver().getWindowHandle();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Reusable.bekle(1);

        qualitydemyPage.courseListBirinciDers.click();
        qualitydemyPage.viewonFrontedButton.click();

        Reusable.bekle(3);

        Set<String> tumWHDegerleriSeti=Driver.getDriver().getWindowHandles();

        String ikinciSayfaWHD="";

        for (String eachWhd:tumWHDegerleriSeti
        ) {
            if (!eachWhd.equals(ilkSayfaHandleDegeri))
                ikinciSayfaWHD=eachWhd;
        }


        Driver.getDriver().switchTo().window(ikinciSayfaWHD);

        String expectedTitle= birinciDersAdi;
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Given("It should be possible to switch between the menus with the arrows at the bottom of the page")
    public void it_should_be_possible_to_switch_between_the_menus_with_the_arrows_at_the_bottom_of_the_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("qaInspectorEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaInspectorPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.courseManagerBtn.click();

        Actions actions = new Actions(Driver.getDriver());

        qualitydemyPage.addNewCourse.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        qualitydemyPage.nextButton.click();
        Reusable.bekle(1);

        Assert.assertTrue(qualitydemyPage.requirementsBox.isDisplayed());

        qualitydemyPage.nextButton.click();
        Reusable.bekle(1);

        Assert.assertTrue(qualitydemyPage.provideOutcomesBox.isDisplayed());

        qualitydemyPage.nextButton.click();
        Reusable.bekle(1);

        Assert.assertTrue(qualitydemyPage.coursePriceBox.isDisplayed());

        qualitydemyPage.nextButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(1);

        Assert.assertTrue(qualitydemyPage.courseOverviewUrlBox.isDisplayed());

        qualitydemyPage.nextButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(1);

        Assert.assertTrue(qualitydemyPage.metaDescriptionBox.isDisplayed());

        qualitydemyPage.nextButton.click();
        Reusable.bekle(1);

        Assert.assertTrue(qualitydemyPage.courseSubmitBtn.isDisplayed());


        Reusable.bekle(1);
        qualitydemyPage.backButton.click();
        Reusable.bekle(1);
        Assert.assertTrue(qualitydemyPage.metaDescriptionBox.isDisplayed());

        qualitydemyPage.backButton.click();
        Reusable.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(qualitydemyPage.courseOverviewUrlBox.isDisplayed());

        qualitydemyPage.backButton.click();
        Reusable.bekle(1);
        Assert.assertTrue(qualitydemyPage.coursePriceBox.isDisplayed());

        qualitydemyPage.backButton.click();
        Reusable.bekle(1);
        Assert.assertTrue(qualitydemyPage.provideOutcomesBox.isDisplayed());

        qualitydemyPage.backButton.click();
        Reusable.bekle(1);
        Assert.assertTrue(qualitydemyPage.requirementsBox.isDisplayed());

        qualitydemyPage.backButton.click();
        Reusable.bekle(1);
        Assert.assertTrue(qualitydemyPage.courseTitleBox.isDisplayed());
    }

}
