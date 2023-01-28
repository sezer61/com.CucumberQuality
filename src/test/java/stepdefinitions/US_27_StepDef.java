package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.configReader;

public class US_27_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("It should be possible to write descriptions in Meta keywords and Meta description textboxes")
    public void ıt_should_be_possible_to_write_descriptions_in_meta_keywords_and_meta_description_textboxes() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("ecihatgul@gmail.com");
        qualitydemyPage.password.sendKeys("Dicle140785+");
        qualitydemyPage.loginButton.click();
        qualitydemyPage.instructorBtn.click();
        qualitydemyPage.adresButtonu.sendKeys("balikesir edremit");
        qualitydemyPage.yourPhoneNumber.sendKeys("00905079583635");
        qualitydemyPage.anyMessage.sendKeys("Mutlu olun gerekirse banka soyun hayat cok guzel insanlar pek sevilcek turden degil biliyorum ama onlari da sevmeyi deneyin");

    }
}
