package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_4_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("Top categories under the heading; Web Design for Web Developers, Disney Magic English, English Speaking Course, English Conjunctions; should be visible and clickable. After clicking the .... icons, the company-related pages should be visible.")
    public void top_categories_under_the_heading_web_design_for_web_developers_disney_magic_english_english_speaking_course_english_conjunctions_should_be_visible_and_clickable_after_clicking_the_icons_the_company_related_pages_should_be_visible() {
        /*
        When I enter the main page, I should be able to see the headings at the
        bottom of the page and control their functions.
         */
        /*
        "Top categories" under the heading; Web Design for Web Developers, Disney Magic English,
        English Speaking  Course, English Conjunctions;
         should be visible and clickable. After clicking the
         .... icons, the company-related pages should be visible.
         */

        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();

        Reusable.scrollDown();
        Reusable.bekle(3);

        Assert.assertTrue(qualitydemyPage.webDesignDevelop.isDisplayed() && qualitydemyPage.webDesignDevelop.isEnabled());
        Assert.assertTrue(qualitydemyPage.englishSCourse.isDisplayed()&&qualitydemyPage.englishSCourse.isEnabled());
        Assert.assertTrue(qualitydemyPage.disneyEnglishMagic.isDisplayed()&&qualitydemyPage.disneyEnglishMagic.isEnabled());
        Assert.assertTrue(qualitydemyPage.englishGrammer.isDisplayed()&&qualitydemyPage.englishGrammer.isEnabled());
        Reusable.bekle(3);
        // qualitydemyPage.webDesignDevelop.isEnabled();
        //  qualitydemyPage.webDesignDevelop.click();
        qualitydemyPage.englishSCourse.click();
        String englishUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(englishUrl.contains("speaking"));
        Driver.getDriver().navigate().back();
        Reusable.scrollDown();
        Reusable.bekle(4);
        qualitydemyPage.webDesignDevelop.click();
        Reusable.bekle(3);

        String webDDUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(webDDUrl.contains("web-design-for-web-developers"));
        Driver.getDriver().navigate().back();
        //Reuseable.scrollDown();
        Reusable.bekle(5);
        qualitydemyPage.englishGrammer.click();

        String eGrammer=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(eGrammer.contains("grammar"));

        Driver.getDriver().navigate().back();
        //  Reuseable.scrollDown();
        Reusable.bekle(6);


        qualitydemyPage.disneyEnglishMagic.click();
        Reusable.bekle(3);

        String dEngMac=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(dEngMac.contains("disney"));
    }
    @Given("Useful links under the heading; Blog, All courses, Sign up; should be visible and clickable After clicking the .... icons, the company-related pages should be visible.")
    public void useful_links_under_the_heading_blog_all_courses_sign_up_should_be_visible_and_clickable_after_clicking_the_icons_the_company_related_pages_should_be_visible() {
        /*
     "Useful links" under the heading; Blog, All courses, Sign up; should be visible and clickable
       After clicking the .... icons, the company-related pages should be visible.
     ("Faydalı Linkler" başlığı altında;Blog,tüm kurslar, Kaydolma; görünür ve tıklanabilir olmalıdır
       ikonlarına tıkladıktan sonra firma ile ilgili sayfaların görünmesi gerekmektedir.)
         */

        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();

        Reusable.bekle(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();

        // System.out.println("All course yazisi: " +qualitydemyPage.allCourses.getText());
        qualitydemyPage.blog.isDisplayed();
        qualitydemyPage.allCourses.isDisplayed();
        qualitydemyPage.allCourses.isEnabled();
        qualitydemyPage.signUp.isDisplayed();

        qualitydemyPage.allCourses.click();


        Driver.closeDriver();
    }
    @Given("Help under the heading; About us, Privacy policy, Terms and condition,Refund policy; should be visible and clickable After clicking the .... icons, the company-related pages should be visible.")
    public void help_under_the_heading_about_us_privacy_policy_terms_and_condition_refund_policy_should_be_visible_and_clickable_after_clicking_the_icons_the_company_related_pages_should_be_visible() {
        /*
        "Help" under the heading; About us, Privacy policy, Terms and condition,Refund policy;
        should be visible and clickable After clicking the
           .... icons, the company-related pages should be visible.
         */

        Driver.getDriver().get(configReader.getProperty("qadUrl"));

        qualitydemyPage.cookies.click();
        Reusable.bekle(4);

        // Reuseable.scrollDown();



        //  System.out.println("about yazisi : " + qualitydemyPage.aboutUs.getText());
        // Reuseable.scrollDown();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        Reusable.bekle(3);


        qualitydemyPage.aboutUs.click();

        String aboutUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(aboutUrl.contains("about_us"));

        Driver.getDriver().navigate().back();


        qualitydemyPage.privacyPolicy.click();
        String privacyUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(privacyUrl.contains("privacy_policy"));

        Driver.getDriver().navigate().back();
        Reusable.scrollDown();
        Reusable.bekle(3);

        qualitydemyPage.termsAndCondition.click();
        String termsConUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(termsConUrl.contains("terms_and_condition"));

        Driver.getDriver().navigate().back();

        qualitydemyPage.refundPolicy.click();
        String reFundUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(reFundUrl.contains("refund_policy"));





        Driver.closeDriver();
    }

}
