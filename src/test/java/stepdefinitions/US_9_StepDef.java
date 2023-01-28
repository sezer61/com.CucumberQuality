package stepdefinitions;

import io.cucumber.java.en.Given;
import org.testng.annotations.BeforeTest;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reusable;
import utilities.configReader;

public class US_9_StepDef {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();


    @Given("The course in the cart should be able to get deleted from the remove link")
    public void the_course_in_the_cart_should_be_able_to_get_deleted_from_the_remove_link() {
        //*******************Sepetteki kurs, kaldır bağlantısından silinebilmelidir.**************************
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginBtn.click();
        qualitydemyPage.emailTextBox.sendKeys("kidohe7294@vingood.com");
        qualitydemyPage.password.sendKeys("1234.Ayse");
        qualitydemyPage.submit.click();
        qualitydemyPage.categories.click();
        qualitydemyPage.webDesignCourse.click();
        Reusable.scrollDown250();
        Reusable.bekle(3);
        qualitydemyPage.webDesignFor.click();
        qualitydemyPage.buyNowButton.click();
        qualitydemyPage.remove.click();///BUG Remove tusu çalışmıyor
        qualitydemyPage.removeText.isDisplayed();
    }
    @Given("When a valid coupon code is entered and applied, the discount should be shown in the price.")
    public void when_a_valid_coupon_code_is_entered_and_applied_the_discount_should_be_shown_in_the_price() {
        Driver.getDriver().get(configReader.getProperty("qadUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginBtn.click();
        qualitydemyPage.emailTextBox.sendKeys("kidohe7294@vingood.com");
        qualitydemyPage.password.sendKeys("1234.Ayse");
        qualitydemyPage.submit.click();
        qualitydemyPage.categories.click();
        qualitydemyPage.webDesignCourse.click();
        Reusable.scrollDown250();
        Reusable.bekle(3);
        qualitydemyPage.webDesignFor.click();
        qualitydemyPage.buyNowButton.click();
    }



    @Given("an invalid coupon code is entered and applied, the price should not change.")
    public void an_invalid_coupon_code_is_entered_and_applied_the_price_should_not_change() {
        qualitydemyPage.shoppingSayfasi.isDisplayed();
        Reusable.bekle(3);
        qualitydemyPage.totalPrice.isDisplayed();
        qualitydemyPage.kuponCodeBox.sendKeys("123654");
        qualitydemyPage.applyButon.click();
        Reusable.bekle(3);
        qualitydemyPage.originalPrice.isDisplayed();
        Reusable.bekle(3);
    }
    @Given("the checkout button is pressed, it should redirect to the payment page")
    public void the_checkout_button_is_pressed_it_should_redirect_to_the_payment_page() {
//*******************Geçerli bir kupon kodu girilip uygulandığında, indirim fiyatta gösterilmelidir.**********
        qualitydemyPage.shoppingSayfasi.isDisplayed();
        Reusable.bekle(3);
        qualitydemyPage.totalPrice.isDisplayed();
        qualitydemyPage.kuponCodeBox.sendKeys("PERCENT10");
        qualitydemyPage.applyButon.click();
        Reusable.bekle(3);
        qualitydemyPage.discountPrice.isDisplayed();
        Reusable.bekle(3);
        //****Ödeme butonuna basıldığında ödeme sayfasına yönlendirilmelidir..************
        qualitydemyPage.shoppingIcon.click();
        qualitydemyPage.checkOut.click();
        qualitydemyPage.odemeSayfasi.isDisplayed();
    }

}
