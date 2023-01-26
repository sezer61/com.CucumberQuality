package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.configReader;

public class US_18_StepDef {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("the Number of courses section is clicked, it should redirect to the courses page")
    public void the_number_of_courses_section_is_clicked_it_should_redirect_to_the_courses_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("qaInspectorEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaInspectorPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.numberOfClass.click();

        Assert.assertTrue(qualitydemyPage.coursesTitle.isDisplayed());
    }
    @Given("pending balance section is clicked, it should redirect to payout_report page")
    public void pending_balance_section_is_clicked_it_should_redirect_to_payout_report_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("qaInspectorEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaInspectorPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.pendingBalance.click();

        Assert.assertTrue(qualitydemyPage.payoutReportTitle.isDisplayed());
    }
    @Given("the Requested withdrawal amount section is clicked, it should redirect to the payout_report page.")
    public void the_requested_withdrawal_amount_section_is_clicked_it_should_redirect_to_the_payout_report_page() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("qaInspectorEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("qaInspectorPassword"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.Instructor.click();
        qualitydemyPage.requestedWithdrawalAmount.click();

        Assert.assertTrue(qualitydemyPage.payoutReportTitle.isDisplayed());
    }

}
