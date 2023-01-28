package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

import java.util.Set;

public class US_19_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("the appropriate values are selected from the filter and the filter button is pressed, the relevant course should appear in the list.")
    public void the_appropriate_values_are_selected_from_the_filter_and_the_filter_button_is_pressed_the_relevant_course_should_appear_in_the_list() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("qaInspectorEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaInspectorPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.courseManagerBtn.click();

        Reusable.bekle(2);

        WebElement courseListCategory = Driver.getDriver().findElement(By.xpath("//select[@id='category_id']"));
        Select select1=new Select(courseListCategory);
        select1.selectByVisibleText("Java Programming Language");

        Reusable.bekle(2);

        WebElement statusCategory = Driver.getDriver().findElement(By.xpath("//select[@id='status']"));
        Select select2=new Select(statusCategory);
        select2.selectByValue("active");

        Reusable.bekle(3);

        WebElement priceCategory = Driver.getDriver().findElement(By.xpath("//select[@id='price']"));
        Select select3=new Select(priceCategory);
        select3.selectByValue("free");

        Reusable.bekle(2);

        qualitydemyPage.filterButton.click();

        String exceptedKelime="Free Java Dersleri 02 Data Nedir? Data Turleri Nelerdir ?";
        String actualKelime=Driver.getDriver().
                findElement(By.xpath("//a[text()='Free Java Dersleri 02 Data Nedir? Data Turleri Nelerdir ?']"))
                .getText();

        Assert.assertEquals(actualKelime,exceptedKelime);
    }
    @Given("Coursme should be able to get selected from the search box")
    public void coursme_should_be_able_to_get_selected_from_the_search_box() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("qaInspectorEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaInspectorPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.courseManagerBtn.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        qualitydemyPage.srchbx.sendKeys("Piyano");

        Reusable.bekle(2);
        String exceptedKelime="Piyano";
        String actualKelime=Driver.getDriver().findElement(By.xpath
                ("//a[text()='Piyano Dersi #1 - " +
                        "Tuşlar (Yeni Başlayanlar İçin Ücretsiz Piyano Kursu)" +
                        " \"Piyano Nasıl Çalınır\"']")).getText();
        Assert.assertTrue(actualKelime.contains(exceptedKelime));
    }
    @Given("Clicking on the three dots under the action section and clicking the View course on frontend link should redirect to the page of the relevant course.")
    public void clicking_on_the_three_dots_under_the_action_section_and_clicking_the_view_course_on_frontend_link_should_redirect_to_the_page_of_the_relevant_course() {
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

        qualitydemyPage.srchbx.sendKeys("Piyano");
        Reusable.bekle(2);
        qualitydemyPage.tdshrtbx.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String ilkSayfaHandleDegeri=Driver.getDriver().getWindowHandle();

        Reusable.bekle(2);

        qualitydemyPage.actionsButton.click();

        qualitydemyPage.viewCourse.click();

        Reusable.bekle(3);

        Set<String> tumWHDegerleriSeti=Driver.getDriver().getWindowHandles();

        String ikinciSayfaWHD="";

        for (String eachWhd:tumWHDegerleriSeti
        ) {
            if (!eachWhd.equals(ilkSayfaHandleDegeri))
                ikinciSayfaWHD=eachWhd;
        }


        Driver.getDriver().switchTo().window(ikinciSayfaWHD);

        String expectedTitle= "Piyano Dersi #1";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Given("Clicking on the three dots under the action section and clicking the Go to course playing page link should lead to the page of the relevant course content.")
    public void clicking_on_the_three_dots_under_the_action_section_and_clicking_the_go_to_course_playing_page_link_should_lead_to_the_page_of_the_relevant_course_content() {
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

        qualitydemyPage.srchbx.sendKeys("Piyano");
        Reusable.bekle(2);
        qualitydemyPage.tdshrtbx.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();

        Reusable.bekle(2);

        qualitydemyPage.actionsButton.click();

        qualitydemyPage.goToCourse.click();

        Reusable.bekle(3);

        Set<String> tumWHDegerleriSeti=Driver.getDriver().getWindowHandles();

        String ikinciSayfaWHD="";

        for (String eachWhd:tumWHDegerleriSeti
        ) {
            if (!eachWhd.equals(ilkSayfaHandleDegeri))
                ikinciSayfaWHD=eachWhd;
        }


        Driver.getDriver().switchTo().window(ikinciSayfaWHD);

        String expectedTitle= "Piyano Dersi #1";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Given("you click on the three dots under the action section and click on the Edit this course link, it should redirect to the edit page of the relevant course.")
    public void you_click_on_the_three_dots_under_the_action_section_and_click_on_the_edit_this_course_link_it_should_redirect_to_the_edit_page_of_the_relevant_course() {
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

        qualitydemyPage.srchbx.sendKeys("Piyano");
        Reusable.bekle(2);
        qualitydemyPage.tdshrtbx.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();

        Reusable.bekle(2);

        qualitydemyPage.actionsButton.click();

        qualitydemyPage.editCourse.click();

        Reusable.bekle(3);


        String expectedTitle= "Edit course";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Given("Clicking on the three dots under the action section and clicking the Section and lesson link should lead to the edit page of the relevant course.")
    public void clicking_on_the_three_dots_under_the_action_section_and_clicking_the_section_and_lesson_link_should_lead_to_the_edit_page_of_the_relevant_course() {
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

        qualitydemyPage.srchbx.sendKeys("Piyano");
        Reusable.bekle(2);
        qualitydemyPage.tdshrtbx.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();

        Reusable.bekle(2);

        qualitydemyPage.actionsButton.click();

        qualitydemyPage.sectionAndLesson.click();

        Reusable.bekle(3);


        String expectedTitle= "Edit course";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Given("you click on the three dots under the action section and click on the Mark as drafted link, a confirmation message should come and after approval, the status section of the course should change to draft.")
    public void you_click_on_the_three_dots_under_the_action_section_and_click_on_the_mark_as_drafted_link_a_confirmation_message_should_come_and_after_approval_the_status_section_of_the_course_should_change_to_draft() {
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

        qualitydemyPage.srchbx.sendKeys("Piyano");
        Reusable.bekle(2);

        qualitydemyPage.tdshrtbx.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();

        Reusable.bekle(2);

        qualitydemyPage.actionsButton.click();

        qualitydemyPage.markAsDrafted.click();

        Reusable.bekle(1);

        Assert.assertTrue(qualitydemyPage.areyouSure.isDisplayed());

        qualitydemyPage.updateLinkContinou.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        qualitydemyPage.srchbx.sendKeys("Piyano");
        Reusable.bekle(2);

        qualitydemyPage.tdshrtbx.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String expectedStatus="Draft";
        String actualStatus=Driver.getDriver()
                .findElement(By.xpath("//tbody//tr[2]//ul/li[2]/span//span")).getText();

        Assert.assertEquals(actualStatus,expectedStatus);
    }
    @Given("you click on the three dots under the action section and click on the Publish this course link, a confirmation message should come and after approval, the status section of the course should change to active.")
    public void you_click_on_the_three_dots_under_the_action_section_and_click_on_the_publish_this_course_link_a_confirmation_message_should_come_and_after_approval_the_status_section_of_the_course_should_change_to_active() {
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

        qualitydemyPage.srchbx.sendKeys("Piyano");
        Reusable.bekle(2);

        qualitydemyPage.tdshrtbx.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();

        Reusable.bekle(2);

        qualitydemyPage.actionsButton.click();

        qualitydemyPage.markAsDrafted.click();

        Reusable.bekle(1);

        Assert.assertTrue(qualitydemyPage.areyouSure.isDisplayed());

        qualitydemyPage.updateLinkContinou.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        qualitydemyPage.srchbx.sendKeys("Piyano");
        Reusable.bekle(2);

        qualitydemyPage.tdshrtbx.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String expectedStatus="Active";
        String actualStatus=Driver.getDriver()
                .findElement(By.xpath("//tbody//tr[2]//ul/li[2]/span//span")).getText();

        Assert.assertEquals(actualStatus,expectedStatus);
    }
    @Given("you click on the three dots under the action section and click on the delete link from here, a confirmation message should come and the course should be deleted from the list after approval.")
    public void you_click_on_the_three_dots_under_the_action_section_and_click_on_the_delete_link_from_here_a_confirmation_message_should_come_and_the_course_should_be_deleted_from_the_list_after_approval() {
        String kursAdi="Denemex";

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
        qualitydemyPage.courseTitleBox.sendKeys(kursAdi);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement courseListCategory = Driver.getDriver().findElement(By.xpath("(//select[@class='form-control select2 select2-hidden-accessible'])[1]"));
        Select select11=new Select(courseListCategory);
        select11.selectByValue("5");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(1);

        qualitydemyPage.nextButton.click();
        Reusable.bekle(1);
        qualitydemyPage.nextButton.click();
        Reusable.bekle(1);
        qualitydemyPage.nextButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(1);
        qualitydemyPage.nextButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(1);
        qualitydemyPage.nextButton.click();
        Reusable.bekle(1);

        qualitydemyPage.nextButton.click();
        Reusable.bekle(1);
        qualitydemyPage.courseSubmitBtn.click();

        qualitydemyPage.backtoCourseListButton.click();
        Reusable.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(1);
        qualitydemyPage.denemexButton.click();
        Reusable.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(1);
        qualitydemyPage.denemexActionsbutton.click();
        Reusable.bekle(1);
        qualitydemyPage.denemexDeletebutton.click();

        Reusable.bekle(1);
        String onayKelime=qualitydemyPage.areyouSure.getText();
        Reusable.bekle(1);

        Assert.assertTrue(qualitydemyPage.areyouSure.isDisplayed());
        Reusable.bekle(1);

        qualitydemyPage.continueButton.click();
        Reusable.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(1);

        qualitydemyPage.srchbx.sendKeys(kursAdi);

        String expectedResult="No matching records found";
        String actualResult=qualitydemyPage.srchbxResult.getText();


        Assert.assertEquals(actualResult,expectedResult);
    }
    @Given("Clicking the add new course button should redirect to the add_course page")
    public void clicking_the_add_new_course_button_should_redirect_to_the_add_course_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("qaInspectorEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaInspectorPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.courseManagerBtn.click();

        qualitydemyPage.addNewCourse.click();

        Reusable.bekle(1);

        String expectedTitle= "Add course";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Given("the course name in the list is clicked, it should redirect to the edit page of the relevant course.")
    public void the_course_name_in_the_list_is_clicked_it_should_redirect_to_the_edit_page_of_the_relevant_course() {
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

        String expectedTitle= "Edit course";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }



}
