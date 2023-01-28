package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

import java.util.List;
import java.util.stream.Collectors;

public class US_22_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("the Add new instructor section is clicked, it should be possible to choose from among the instructors added here.")
    public void the_add_new_instructor_section_is_clicked_it_should_be_possible_to_choose_from_among_the_instructors_added_here() {
        qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginBtn.click();
        qualitydemyPage.emailTextBox.sendKeys("pisetap755@tohup.com");
        qualitydemyPage.password.sendKeys("Fy12068036!");
        qualitydemyPage.submit.click();
        qualitydemyPage.instructorBtn.click();
        qualitydemyPage.courseManagerBtn.click();
        qualitydemyPage.courseLink.click();
        qualitydemyPage.basicLinkBtn.click();
        Reusable.bekle(2);
    }
    @Given("It should be possible to make changes on the Course title, Short description and description")
    public void ıt_should_be_possible_to_make_changes_on_the_course_title_short_description_and_description() {
        qualitydemyPage.addInstructorTextBox.click();
        Reusable.bekle(2);
        int indexOfParentheses=qualitydemyPage.newInstructor.getText().indexOf('(');
        String textOfAddedNewInstructor=qualitydemyPage.newInstructor.getText().substring(0,indexOfParentheses-1);
        System.out.println(textOfAddedNewInstructor);
        qualitydemyPage.newInstructor.click();
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        qualitydemyPage.viewOnFrontend.click();
        Reusable.switchToWindow1("C# programming from zero to hero");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Reusable.bekle(3);

        List<String> textOfInstructors=qualitydemyPage.instructorList.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println(textOfInstructors);
        int count=0;
        for (String each:textOfInstructors) {
            System.out.println(each);
            if (each.contains(textOfAddedNewInstructor)){
                count++;
            }
        }
        System.out.println(count);
        Assert.assertTrue(count>0);
    }
    @Given("The desired category should be able to get selected from the Category section.")
    public void the_desired_category_should_be_able_to_get_selected_from_the_category_section() {
        Assert.assertTrue(qualitydemyPage.courseTitle.isEnabled());
        Assert.assertTrue(qualitydemyPage.shortDescription.isEnabled());
        Assert.assertTrue(qualitydemyPage.description.isEnabled());
    }
    @Given("The desired level should be able to get selected from the Level section.")
    public void the_desired_level_should_be_able_to_get_selected_from_the_level_section() {
        qualitydemyPage.categoryDropMenu.click();
        qualitydemyPage.webDesignSubmenu.click();
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        qualitydemyPage.basicLinkBtn.click();
        Assert.assertEquals(qualitydemyPage.categoryDropMenu.getText(), "Web Design for Web Developers");
    }
    @Given("Enable drip content button can be changed")
    public void enable_drip_content_button_can_be_changed() {
        Select select=new Select(qualitydemyPage.selectMenu);
        select.selectByValue("beginner");
        qualitydemyPage.finishBtn.click();
        qualitydemyPage.courseSubmitBtn.click();
        qualitydemyPage.basicLinkBtn.click();
        Assert.assertEquals(qualitydemyPage.levelBox.getText(),"Beginner");
        Assert.assertTrue(qualitydemyPage.dripContent.isEnabled());
    }
    @Given("Check if this course is top course checkbox should be selectable")
    public void check_if_this_course_is_top_course_checkbox_should_be_selectable() {
        if (!qualitydemyPage.topCourseCheckBox.isSelected()) {
            qualitydemyPage.topCourseLabel.click();
            qualitydemyPage.finishBtn.click();
            qualitydemyPage.courseSubmitBtn.click();
            qualitydemyPage.basicLinkBtn.click();
            Assert.assertTrue(qualitydemyPage.topCourseCheckBox.isSelected());
        } else {
            qualitydemyPage.topCourseLabel.click();
            qualitydemyPage.finishBtn.click();
            qualitydemyPage.courseSubmitBtn.click();
            qualitydemyPage.basicLinkBtn.click();
            Assert.assertFalse(qualitydemyPage.topCourseCheckBox.isSelected());
        }
    }


}
