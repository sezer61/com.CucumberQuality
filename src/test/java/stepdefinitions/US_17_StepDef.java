package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

import java.nio.file.Files;
import java.nio.file.Paths;

public class US_17_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("selecting a file, the computer folder should be opened.")
    public void selecting_a_file_the_computer_folder_should_be_opened() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.firstLoginButton.click();
        qualitydemyPage.cookieAcceptButton.click();
        Reusable.bekle(4);

        qualitydemyPage.userMailBox.sendKeys("pisetap755@tohup.com");
        qualitydemyPage.userPasswordBox.sendKeys("Fy12068036!");

        qualitydemyPage.secondLoginButton.click();
        Reusable.bekle(7);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.profileImg);
        actions.click(qualitydemyPage.userProfile).perform();
        Reusable.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(3);
        qualitydemyPage.photoPage.click();
    }
    @Given("the upload button is pressed after the selected picture file, the profile picture should be uploaded.")
    public void the_upload_button_is_pressed_after_the_selected_picture_file_the_profile_picture_should_be_uploaded() {
        String dosyaYolu1= System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\certificates\\photo.png";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu1)));
        String dosyaYolu= System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\certificates\\photo.png";
        qualitydemyPage.choseFile.sendKeys(dosyaYolu);
        qualitydemyPage.uploadBtn.click();
        Assert.assertTrue(qualitydemyPage.successfullUpdate.isDisplayed());
    }
    @Given("It should give a warning when something other than image format is selected.")
    public void it_should_give_a_warning_when_something_other_than_image_format_is_selected() {
        Reusable.bekle(3);
        String dosyaYolu= System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\certificates\\PDF.pdf";
        qualitydemyPage.choseFile.sendKeys(dosyaYolu);
        qualitydemyPage.uploadBtn.click();
        Reusable.bekle(3);
        Assert.assertTrue(qualitydemyPage.failedUpdate.isDisplayed());
    }

}
