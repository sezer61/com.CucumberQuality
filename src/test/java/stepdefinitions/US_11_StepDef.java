package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

import java.util.Arrays;
import java.util.List;

public class US_11_StepDef {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("the compare link is clicked, it should redirect to the Course compare page")
    public void the_compare_link_is_clicked_it_should_redirect_to_the_course_compare_page() {
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
                .moveToElement(qualitydemyPage.myWishList)
                .click().perform();
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.compareButton);
        Reusable.bekle(1);
        qualitydemyPage.compareButton.click();
        Assert.assertTrue(qualitydemyPage.courseCompare.getText().contains("Course compare"));
    }

    @Given("Course should be  searchable from the search box")
    public void course_should_be_searchable_from_the_search_box() {
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
                .moveToElement(qualitydemyPage.myWishList)
                .click().perform();
        js.executeScript("arguments[0].scrollIntoView();", qualitydemyPage.compareButton);
        Reusable.bekle(1);
        qualitydemyPage.compareButton.click();
        Assert.assertTrue(qualitydemyPage.courseCompare.getText().contains("Course compare"));

    }

    @Given("the course name is clicked, it should redirect to the page of the relevant course.")
    public void the_course_name_is_clicked_it_should_redirect_to_the_page_of_the_relevant_course() {
        Reusable.bekle(1);
        Driver.getDriver().navigate().back();
        Reusable.bekle(1);
        qualitydemyPage.searchBox.sendKeys("Web");
        String expData = "Web";
        Reusable.bekle(1);
        List<WebElement> courseList = qualitydemyPage.courseList;
        for (WebElement each : courseList) {
            Assert.assertTrue(each.getText().contains(expData));
        }
    }

    @Given("the instructor icon is clicked, it should redirect to the relevant instructor page.")
    public void theInstructorIconIsClickedItShouldRedirectToTheRelevantInstructorPage() {
        Driver.getDriver().navigate().refresh();
        Reusable.bekle(2);
        List<WebElement> courseList = qualitydemyPage.courseList;
        int actCourseList = courseList.size();
        int expCourseList = 0;
        List<String> courseName = null;
        String strText="";
        for (int i = 0; i <courseList.size() ; i++) {
            strText="";
            Reusable.bekle(2);
            if (!courseList.get(i).isDisplayed()){
                js.executeScript("arguments[0].scrollIntoView();", courseList.get(i));
            }
            Reusable.bekle(2);
            strText = courseList.get(i).getText();
            courseList.get(i).click();

            if ((strText).contains(qualitydemyPage.courseHead.getText())){
                expCourseList++;
            }
            Driver.getDriver().navigate().back();
        }
        Assert.assertEquals(actCourseList,expCourseList);
        List<WebElement> instructorIconList = qualitydemyPage.instructorIcon;

        int actIcon = instructorIconList.size();
        int expIcon = 0;

        for (int i = 0; i <instructorIconList.size() ; i++) {
            Reusable.bekle(2);
            instructorIconList.get(i).click();
            if ((qualitydemyPage.instructorPageHead.getText()).contains("Instructor")){
                expIcon++;
            }
            Reusable.bekle(2);
            Driver.getDriver().navigate().back();
        }

        Assert.assertEquals(expIcon,actIcon);
    }




    @Given("The course should be able to verify the number and duration of the course on the relevant page when the course name is clicked.")
    public void theCourseShouldBeAbleToVerifyTheNumberAndDurationOfTheCourseOnTheRelevantPageWhenTheCourseNameIsClicked() {
        List<WebElement> courseInfos = qualitydemyPage.courseInfo;
        String[] arrCourseInfo = new String[courseInfos.size()];
        String[] arrCourseInfoControlPage = new String[courseInfos.size()];
        for (int i = 0; i <courseInfos.size() ; i++) {
            arrCourseInfo[i]=courseInfos.get(i).getText();
        }

        for (int i = 0; i <=qualitydemyPage.courseList.size() ; i++) {
            Reusable.bekle(2);
            qualitydemyPage.courseList.get(i).click();
            if (i!=0){
                i++;
            }
            arrCourseInfoControlPage[i] = qualitydemyPage.courseDurationInfo.getText();
            arrCourseInfoControlPage[i+1] = qualitydemyPage.courseLectureInfo.getText();
            Reusable.bekle(2);
            Driver.getDriver().navigate().back();
        }

        System.out.println(Arrays.toString(arrCourseInfo));
        System.out.println(Arrays.toString(arrCourseInfoControlPage));
        int actControlSize = arrCourseInfoControlPage.length;
        int expControlSize = 0;
        for (int i = 0; i <arrCourseInfo.length ; i++) {
            if (arrCourseInfoControlPage[i].split(" ")[0].equals(arrCourseInfo[i].split(" ")[0])){
                expControlSize++;
            }
        }
        Assert.assertEquals(expControlSize,actControlSize);
    }

}

