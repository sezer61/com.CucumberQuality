package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

import java.util.List;

public class US_33_StepDef {

    QualitydemyPage qualitydemyPage_ =new QualitydemyPage();
    @Given("The desired option should be searchable from the Course overview provider dropdown")
    public void the_desired_option_should_be_searchable_from_the_course_overview_provider_dropdown() {
            //The desired option should be searchable from the Course overview provider dropdown
            //Relevant url should be enterable in Course overview url textbox
            //Image can be uploaded to Course thumbnail
            QualitydemyPage qualitydemyPage_ =new QualitydemyPage();
            Driver.getDriver().get(configReader.getProperty("qadUrl"));
            qualitydemyPage_.cookies.click();
            qualitydemyPage_.login.click();
            qualitydemyPage_.email.sendKeys(configReader.getProperty("vaildEmail"));
            qualitydemyPage_.password.sendKeys(configReader.getProperty("vaildPassword"));
            qualitydemyPage_.loginButton.click();
            qualitydemyPage_.Instructor.click();
            qualitydemyPage_.courseManager.click();
            qualitydemyPage_.addNewCourse.click();
    }
    @Given("Relevant url should be enterable in Course overview url textbox")
    public void relevant_url_should_be_enterable_in_course_overview_url_textbox() {
        //The functions of the course_form/add_course media section should work correctly
        qualitydemyPage_.media.click();
        List<WebElement> listMedia= qualitydemyPage_.mediaList;
        List<String>strings=Reusable.getElementsText(listMedia);
        strings.forEach(each-> Assert.assertTrue(each.contains("Youtube")));
        strings.forEach(each-> Assert.assertTrue(each.contains("Vimeo")));
        strings.forEach(each-> Assert.assertTrue(each.contains("Html5")));
        qualitydemyPage_.courseOverviewUrl.sendKeys(configReader.getProperty("attemptUrl"));
    }
    @Given("image can be uploaded to Course thumbnail")
    public void image_can_be_uploaded_to_course_thumbnail() {
        String dosyayolu=System.getProperty("user.home","C:\\Users\\sezer\\IdeaProjects\\com.d.cucumber\\team16.jpeg");
        Reusable.scrollDown();
        Reusable.bekle(3);
        qualitydemyPage_.ImageOpt.sendKeys(dosyayolu);
    }
}
