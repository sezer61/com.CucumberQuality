package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

import java.util.List;

public class US_12_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("Courses should be searchable from dropboxes")
    public void courses_should_be_searchable_from_dropboxes() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.firstLogin.click();
        Reusable.bekle(1);
        qualitydemyPage.emailTextBox.sendKeys(configReader.getProperty("qaStudentVaildEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaStudentVaildPassword"));
        qualitydemyPage.cookieAccept.click();
        Reusable.bekle(1);
        qualitydemyPage.loginButton.click();
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.compareButton);
        Reusable.bekle(1);
        qualitydemyPage.compareButton.click();
        qualitydemyPage.deleteCourseX.click();

        List<WebElement> coursesDropbox = qualitydemyPage.coursesDropbox;
        int actDropbox = coursesDropbox.size();
        int expSearchableDropbox = 0;
        Actions actions = new Actions(Driver.getDriver());
        String courseKeyValue = "Aysel";
        for (int i = 0; i <coursesDropbox.size() ; i++) {
            actions.moveToElement(coursesDropbox.get(i)).click().perform();
            Reusable.bekle(2);
            qualitydemyPage.searchTextBoxArea.sendKeys(courseKeyValue);
            if (qualitydemyPage.courseDropboxResult.getText().contains(courseKeyValue)){
                expSearchableDropbox++;
            }
            Reusable.bekle(2);
        }
        Assert.assertEquals(actDropbox,expSearchableDropbox);
    }
    @Given("the get enrolled button is clicked, it should redirect to the page of the relevant course.")
    public void the_get_enrolled_button_is_clicked_it_should_redirect_to_the_page_of_the_relevant_course() {
        Driver.getDriver().navigate().refresh();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.coursesDropbox.get(0)).click().perform();


        String courseKeyValue = "javaya tav olmak7";

        qualitydemyPage.searchTextBoxArea.sendKeys(courseKeyValue + Keys.ENTER);
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.getEnrolledButton);
        Reusable.bekle(1);
        qualitydemyPage.getEnrolledButton.click();

        Reusable.bekle(3);
        Assert.assertTrue(qualitydemyPage.courseHead.isDisplayed());
    }
    @Given("the learn more link is clicked, it should redirect to the page of the relevant course.")
    public void the_learn_more_link_is_clicked_it_should_redirect_to_the_page_of_the_relevant_course() {
        Driver.getDriver().navigate().back();
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.deleteCourseX);
        Reusable.bekle(1);
        qualitydemyPage.deleteCourseX.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.coursesDropbox.get(0)).click().perform();

        String courseKeyValue = "Aysel";
        qualitydemyPage.searchTextBoxArea.sendKeys(courseKeyValue + Keys.ENTER);
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.courseEnrollButton);
        Reusable.bekle(1);
        qualitydemyPage.courseEnrollButton.click();

        Reusable.bekle(3);
        Assert.assertTrue(qualitydemyPage.enrolledPageInfo.getText().contains("Shopping"));
    }
    @Given("the buy now button is clicked, it should redirect to the shopping_cart page")
    public void the_buy_now_button_is_clicked_it_should_redirect_to_the_shopping_cart_page() {
        Driver.getDriver().navigate().back();
        qualitydemyPage.deleteCourseX.click();
        Reusable.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.coursesDropbox.get(0)).click().perform();

        String courseKeyValue = "Aysel";
        qualitydemyPage.searchTextBoxArea.sendKeys(courseKeyValue + Keys.ENTER);
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.learnMoreLink);
        Reusable.bekle(1);
        qualitydemyPage.learnMoreLink.click();

        Reusable.bekle(3);
        Assert.assertTrue(qualitydemyPage.courseOverviewPage.isDisplayed());
    }

}
