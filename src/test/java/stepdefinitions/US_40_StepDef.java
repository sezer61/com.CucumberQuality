package stepdefinitions;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.*;
import utilities.Reusable;

public class US_40_StepDef {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Given("Course should be able to get selected from the search box")
    public void course_should_be_able_to_get_selected_from_the_search_box() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        Reusable.bekle(1);
        qualitydemyPage.cookies.click();
        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys(configReader.getProperty("40vaildEmail"));
        qualitydemyPage.password.sendKeys(configReader.getProperty("vaildPassword"));
        qualitydemyPage.loginButton.click();
        Reusable.bekle(2);
        qualitydemyPage.myCoursessHome.click();
        qualitydemyPage.myCoursesSearch.sendKeys("Build Responsive Real-World Websites with HTML and CSS");
        Reusable.scrollDown250();
        Reusable.bekle(3);
    }
    @Given("the course name is clicked, it should redirect to the pagee of the relevant course.")
    public void the_course_name_is_clicked_it_should_redirect_to_the_pagee_of_the_relevant_course() {
        Reusable.bekle(3);
        qualitydemyPage.myCoursesSearchClick.click();

    }
    @Given("The course should be listed when the desired date is selected from the filter dropbox and the filter button is pressed.")
    public void the_course_should_be_listed_when_the_desired_date_is_selected_from_the_filter_dropbox_and_the_filter_button_is_pressed() {
        String actual=Driver.getDriver().getTitle();
        String expected="Build Responsive Real-World Websites with HTML and CSS";
        Assert.assertTrue(actual.contains(expected));
    }

}
