package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_14_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("the invoice button is clicked, it should redirect to the invoice page.")
    public void the_invoice_button_is_clicked_it_should_redirect_to_the_invoice_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.firstLogin.click();
        Reusable.bekle(1);
        qualitydemyPage.emailTextBox.sendKeys(configReader.getProperty("qaStudentVaildEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaStudentVaildPassword"));
        qualitydemyPage.cookieAccept.click();
        Reusable.bekle(1);
        qualitydemyPage.loginButton.click();
        Reusable.bekle(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.myProfileIcon)
                .moveToElement(qualitydemyPage.purchaseHistoryButton)
                .click().perform();

        qualitydemyPage.invoiceButton.click();
        Reusable.bekle(1);

        Reusable.switchToWindow("Invoice | QualityDemy");

        Assert.assertTrue(qualitydemyPage.invoicePage.getText().contains("invoice"));
    }
    @Given("the coucrse name is clicked, it should redirect to the page of the relevant course.")
    public void the_coucrse_name_is_clicked_it_should_redirect_to_the_page_of_the_relevant_course() {
        Reusable.switchToWindow("Purchase History | QualityDemy");

        qualitydemyPage.purchaseCourse.click();

        Reusable.bekle(1);
        Assert.assertTrue(qualitydemyPage.myCoursesListDisplayed.isDisplayed());
    }


}
