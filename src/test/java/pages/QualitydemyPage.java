package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Reusable;

import java.util.List;

public class QualitydemyPage {




 public QualitydemyPage() {
  PageFactory.initElements(Driver.getDriver(), this);
 }
    //Diler Locators
    @FindBy(xpath = "//li[@class='has-children text-nowrap fw-bold']")
    public WebElement categories;
    @FindBy(xpath = "//input[@id='course_thumbnail']")
    public WebElement ImageOpt;

    @FindBy(xpath = "//span[text()='Web Design Course']")
    public WebElement webDesignCourse;
   @FindBy(xpath = "(//a[@class='text-wrap'])[1]")
    public WebElement webDesignForWebDev;
   @FindBy(xpath = "(//a[@class='course-title'])[2]")
   public WebElement webDesignFor;
   @FindBy(xpath = "//button[@class='btn btn-buy']" )
   public WebElement buyNowButton;
   @FindBy(xpath = "//div[@onclick='removeFaFromCartList(this)']")
   public WebElement remove;
   @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
   public WebElement shoppingSayfasi;

   @FindBy(xpath = "//div[text()='0 Courses in cart']")
   public WebElement removeText;

   @FindBy(xpath = "(//div[@class='icon'])[4]")
   public WebElement shoppingIcon;
   @FindBy(xpath = "//div[@class='total-price']")
   public WebElement totalPrice;
   @FindBy(xpath = "//span[@class='discount-rate']")
   public WebElement discountPrice;
   @FindBy(xpath = "//span[@class='original-price']")
   public WebElement originalPrice;
   @FindBy(xpath = "//a[@class='btn bg-background']")
   public WebElement reset;
   @FindBy(xpath ="//button[@onclick='handleCheckOut()']" )
   public WebElement checkOut;
   @FindBy(xpath = "//div[@class='float-end total-price']")
   public WebElement Total;
   @FindBy(xpath = "//img[@class='payment-gateway-icon']")
   public WebElement odemeSayfasi;
   @FindBy(xpath = "(//button[@type='button'])[1]")
   public WebElement apply;

   @FindBy(xpath = "//input[@id='coupon-code']")
   public WebElement kuponCodeBox;

    @FindBy(xpath = "//*[text()='Forgot password?']")
    public WebElement sifremiUnuttum;
    @FindBy(xpath = "//*[text()='Provide your valid email address']")
    public WebElement sifremiUnuttumSayfasi;
    @FindBy(xpath = "//input[@id='forgot-password-email']")
    public WebElement mButon;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement send;
    @FindBy(xpath = "//div[@class='toast toast-error']")
    public WebElement error;
    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement onay;
    @FindBy(xpath = "//a[@class='text-15px fw-700']")
    public WebElement goBackLogin;
    @FindBy(xpath="//p[@class='text-14px']")//a[text()='Login']
    public WebElement LoginGiris;
    @FindBy(xpath="//h1[text()='Login']")
    public WebElement LoginGirisOnay;
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login2;
    @FindBy(xpath="//a[text()='Log in']")
    public WebElement login;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement myCourseslist;
    @FindBy(xpath = "(//a[text()='Edit rating'])[2]")
    public WebElement editRating;
    @FindBy(xpath = "//select[@class='form-control']")
    public WebElement degree;
    @FindBy(xpath = "(//a[text()='Cancel'])[2]")
    public WebElement cancel;



    @FindBy(xpath="//input[@class='form-control py-2']")
    public WebElement myCoursesSearchBox;

    @FindBy(xpath = "(//i[@class='fas fa-search'])[2]")
    public WebElement myCoursesSearchBoxClick;
    @FindBy(xpath = "//span[@class='play-btn']")
    public WebElement courseIsdisplayed;
    @FindBy(xpath = "//a[@class='btn bg-background dropdown-toggle']")
    public WebElement myCoursesCategories;
    @FindBy(xpath = "(//select[@class='form-control'])[1]")
    public WebElement puanlama;
    @FindBy(xpath = "//option[text()='3 Out of 5']")
    public WebElement puanlamaText;
    @FindBy(xpath ="(//textarea[@class='form-control'])[2]")
    public WebElement textGonder;
    @FindBy(xpath="(//button[@type='button'])[4]")
    public WebElement publishRating;
    @FindBy(xpath="(//a[text()='Start lesson'])[2]")
    public WebElement startLesson;
    @FindBy(xpath="//a[text()='Music']")
    public WebElement music;

   //Locators found by Faruk

    @FindBy(xpath = "//input[@placeholder='Search for courses']")
    public WebElement searchBx;
    @FindBy(xpath = "//button[@id='course_2']")
    public WebElement courseBuyClick;
    @FindBy(xpath = "//span[text()='Requirements']")
    public WebElement requirementS;
    @FindBy(xpath = "(//input[@id='requirements'])[1]")
    public WebElement requirementSend;
    @FindBy(xpath = "(//input[@id='requirements'])[3]")
    public WebElement requirementSend2;
    @FindBy(xpath = "(//button[@class='btn btn-success btn-sm'])[1]")
    public WebElement requirementSendplus;
    @FindBy(xpath = "(//i[@class='fa fa-minus'])[2]")
    public WebElement requirementSendMinus;
    @FindBy(xpath = "//input[@placeholder='Search my courses']")
    public WebElement myCoursesSearch;
    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkoutClick;
    @FindBy(xpath = "//div[@class='course-image']")
    public WebElement myCoursesSearchClick;
    @FindBy(xpath = "//button[text()='Pay with stripe']")
    public WebElement payWithStripee;
    @FindBy(xpath = "//img[@class='payment-gateway-icon']")
    public WebElement checkoutStripe;
    @FindBy(xpath = "//a[text()='Get Enrolled']")
    public WebElement getEnrolled;
    @FindBy(xpath = "//a[text()='Already purchased']")
    public WebElement alreadyPurchased;
    @FindBy(xpath = "//label[text()='Free']")
    public WebElement aFree;
    @FindBy(xpath = "(//a[@class='course-title'])[3]")
    public WebElement listCoursee;
    @FindBy(xpath = "(//a[@class='course-title'])[2]")
    public WebElement listCoursee2;
    @FindBy(xpath = "//span[@class='lecture-title text-primary']")
    public WebElement curriculumFor;
    @FindBy(xpath = "(//span[@class='play-btn'])[2]")
    public WebElement playButtonClickList;
    @FindBy(xpath = "//h5[text()='Note:']")
    public WebElement playClickListNote;
    @FindBy(xpath = "//*[@class='btn btn-add-wishlist ']")
    public WebElement addToWishlist;
    @FindBy(xpath = "//*[text()='Added to wishlist']")
    public WebElement addedToWishlist;
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement soppingCartDisplayed;
    @FindBy(xpath = "(//div[@class='course-image'])[2]")
    public WebElement searchBxListCourse;
    @FindBy(xpath = "(//div[@class='course-image'])[2]")
    public WebElement searchBxListCourseOne;
    @FindBy(xpath = "//i[@class='fas fa-search']")
    public WebElement searchBxClick;

    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement cookies;
    public  void handleCookies(){
        if(cookies.isDisplayed()) {
            cookies.click();
            Reusable.bekle(2);
        }
    }
    @FindBy(xpath = "//span[@class='header-underline-2']")
    public WebElement topCategories;

    @FindBy(xpath = "(//a[@class='top-categories'])[1]")
    public WebElement webDesignDevelop;

    @FindBy(xpath = "(//div[@class='category-title'])[3]")
    public WebElement englishSCourse;

    @FindBy(xpath = "(//div[@class='category-title'])[9]")
    public WebElement disneyEnglishMagic;

    @FindBy(xpath = "(//div[@class='category-title'])[10]")
    public WebElement englishGrammer ;


    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[7]")
    public WebElement blog;

    @FindBy(xpath = "(//a[@href=\"https://qa.qualitydemy.com/home/courses\"])[2]")
    public WebElement allCourses;

    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[9]")
    public WebElement signUp;

    @FindBy(xpath = "//a[@href=\"https://qa.qualitydemy.com/home/about_us\"]")
    public WebElement aboutUs;

    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[11]")
    public WebElement privacyPolicy;

    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[12]")
    public WebElement termsAndCondition;

    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[13]")
    public WebElement refundPolicy;

    @FindBy(xpath = "//a[text()='Log in']")

     public WebElement ilkLoginLinki;

    @FindBy(linkText = "Forgot password?")
    public WebElement forgotPassword;

    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement signUpButonu;

    @FindBy(id = "first_name")
    public WebElement firstname;

    @FindBy(id = "last_name")
    public WebElement lastname;

    @FindBy(id = "registration-email")
    public WebElement emailforSignUp;

    @FindBy(id = "registration-password")
    public WebElement passwordForSingup;

    @FindBy(xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement signUpBox;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCourseLinki;

    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div")
    public WebElement succesword;


     @FindBy(id="login-email")
     public WebElement kullaniciEmailKutusu;

     @FindBy(id="login-password")
     public WebElement passwordKutusu;

    @FindBy(xpath = "//*[text()='Invalid login credentials']")
    public WebElement invalidLogin;

   @FindBy(xpath = "//button[text()='Login']")
   public WebElement loginButonu;

   @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div/p[1]")
   public WebElement nameLastnameWarning;

   //@FindBy(xpath = "//*[@id=\"toast-container\"]/div/div/p/text()")
   @FindBy(xpath = "//*[text()='Your password should be a minimum of 6 characters and a combination of uppercase letters, lowercase letters, numbers, or symbols.']")
   public WebElement passwordWarning;

   @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div")
   public WebElement registeredEmail;

   @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div/p[1]")
   public WebElement missingEmail;












    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginBtn;
    @FindBy(id = "login-email")
    public WebElement emailTextBox;
    @FindBy(id = "login-password")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement submit;
    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement instructorBtn;
    @FindBy(xpath = "//*[text()='Course manager']")
    public WebElement courseManagerBtn;
    @FindBy(xpath = "//*[text()='C# programming from zero to hero']")
    public WebElement courseLink;
    @FindBy(xpath = "//span[text()='Outcomes']")
    public WebElement outcomesLink;
    @FindBy(xpath = "(//input[@placeholder='Provide outcomes'])[1]")
    public WebElement outcomesTextBox1;
    @FindBy(xpath = "//span[text()='Finish']")
    public WebElement finishBtn;
    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement courseSubmitBtn;
    @FindBy(xpath = "(//i[@class='fa fa-plus'])[2]")
    public WebElement plusBtn;
    @FindBy(xpath = "(//input[@placeholder='Provide outcomes'])[3]")
    public WebElement outcomesTextBox2;
    @FindBy(xpath = "//*[text()='View on frontend ']")
    public WebElement viewOnFrontend;
    @FindBy(xpath = "//ul[@class='what-you-get__items']/li")
    public List<WebElement> outcomeList;
    @FindBy(xpath = "(//button[@class='btn btn-danger btn-sm'])[2]")
    public WebElement minusBtn;
    @FindBy(xpath = "//span[text()='Pricing']")
    public WebElement pricingSection;
    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement freeCheckbox;
    @FindBy(xpath = "//label[@for='is_free_course']")
    public WebElement freeCheckboxClic;
    @FindBy(xpath = "//*[text()='Check if this is a free course']")
    public WebElement freeCheckboxLabel;
    @FindBy(xpath = "//div[@class='course-sidebar-text-box']")
    public WebElement courseFrontendDescription;
    @FindBy(xpath = "//*[@*='Enter course course price']")
    public WebElement desiredPriceTextbox;
    @FindBy(xpath = "//input[@id='price']")
    public WebElement priceCClick;
    @FindBy(xpath = "//input[@id='discounted_price']")
    public WebElement discountP;
    @FindBy(id = "discount_flag")
    public WebElement discountCheckbox;
    @FindBy(xpath = "//label[@for='discount_flag']")
    public WebElement discountLabel;
    @FindBy(id = "discounted_price")
    public WebElement discountedPriceTextbox;
    @FindBy(xpath = "//a[text()=' Account']")
    public WebElement accountButton;
    @FindBy(id = "current_password")
    public WebElement currentPassword;
    @FindBy(id = "new_password")
    public WebElement newPassword;
    @FindBy(id = "confirm_password")
    public WebElement confirmPassword;
    @FindBy(xpath = "(//ul)[12]/li[3]")
    public WebElement photoPage;
    @FindBy(id = "user_image")
    public WebElement choseFile;
    @FindBy(xpath = "//button[@class='btn red px-5 py-2 radius-8']")
    public WebElement uploadBtn;
    @FindBy(xpath = "//div[text()='Updated successfully']")
    public WebElement successfullUpdate;
    @FindBy(xpath = "//*[text()='Please select only jpg/png file.']")
    public WebElement failedUpdate;
    @FindBy(xpath = "//ul[@class='select2-selection__rendered']")
    public WebElement addInstructorTextBox;
    @FindBy(xpath = "(//ul)[6]/li[1]")
    public WebElement newInstructor;
    @FindBy(xpath = "//*[@class='row justify-content-center mb-3']")
    public List<WebElement> instructorList;
    @FindBy(xpath = "//span[text()='Requirements']")
    public WebElement getRequirementBtn;
    @FindBy(xpath = "(//button[@class='btn btn-success btn-sm'])[1]")
    public WebElement requirementPlusBtn;
    @FindBy(xpath = "(//input[@id='requirements'])[3]")
    public WebElement requirementPlusTextBox;
    @FindBy(xpath = "(//button[@class='btn btn-danger btn-sm'])[1]")
    public WebElement requirementMinusBtn;










    //Sezer Locators

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement login1;
    @FindBy(xpath = "//i[@class='mdi mdi-arrow-right-bold']")
    public WebElement rightBold;
    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement closeStripe;
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement shoppingDisplayed;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailStripe;
    @FindBy(xpath = "(//div[@class='flex-item width-12'])[6]")
    public WebElement stripePay;
    @FindBy(xpath = "//h1[text()='My courses']")
    public WebElement myCoursess;
    @FindBy(xpath = "(//a[text()='My courses'])[1]")
    public WebElement myCoursessHome;
    @FindBy(xpath = "(//h5[@class='title'])[1]")
    public WebElement myCoursessTitle;
    @FindBy(xpath = "//input[@id='cardNumber']")
    public WebElement cardNumberStripe;
    @FindBy(xpath = "//input[@id='cardExpiry']")
    public WebElement cardInfoStripeAaYy;
    @FindBy(xpath = "//input[@id='cardCvc']")
    public WebElement cardInfoStripeCvc;
    @FindBy(xpath = "//input[@id='billingName']")
    public WebElement cardInfoStripeName;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement cardInfoStripe;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;
    @FindBy(xpath ="//a[text()='Instructor']")
    public WebElement Instructor;
    @FindBy(xpath ="//span[text()='Course manager']")
    public WebElement courseManager;
    @FindBy(xpath ="//a[text()='Add new course']")
    public WebElement addNewCourse;
    @FindBy(xpath ="//span[text()='Media']")
    public WebElement media;
    @FindBy(xpath ="(//div[@class='col-md-10'])[11]")
    public List<WebElement> mediaList;
    @FindBy(xpath ="//input[@id='course_overview_url']")
    public WebElement courseOverviewUrl;
    @FindBy(xpath ="//label[@for='course_thumbnail']")
    public WebElement courseImg;
    @FindBy(xpath ="(//a[@data-toggle='tab'])[6]")
    public WebElement seo;
    @FindBy(xpath ="//input[@size='43']")
    public WebElement metaKeywords;
    @FindBy(xpath ="//textarea[@name='meta_description']")
    public WebElement metaDescription;
    @FindBy(xpath ="//textarea[@name='meta_description']")
    public WebElement buttonrightclick;
    @FindBy(xpath ="//h3[text()='Thank you !']")
    public WebElement titleDisplayed;
    @FindBy(xpath ="//span[text()='Manage profile']")
    public WebElement manageProfile;
    @FindBy(xpath ="(//span[@class='text-danger'])[2]")
    public WebElement emailShouldNotChange;
    @FindBy(xpath ="(//span[@class='text-danger'])[1]")
    public WebElement firstNameShouldNotChange;
    @FindBy(xpath ="//*[@id='address']")
    public WebElement addressDisplayed;
    @FindBy(xpath ="//*[@id='phone']")
    public WebElement phoneNumbersDisplayed;
    @FindBy(xpath ="//*[@id='message']")
    public WebElement anyMessageDisplayed;
    @FindBy(xpath ="(//button[@class='btn'])[2]")
    public WebElement applyButon;
    @FindBy(xpath ="//a[@class='fake_status btn btn-danger']")
    public WebElement clickToActiveDisplayed;
    @FindBy(xpath ="//div[text()='Approved']")
    public WebElement approvedDisplayed;
    @FindBy(xpath ="(//a[text()='My courses'])[1]")
    public WebElement myCoursesClick;
    @FindBy(xpath ="(//div[@class='course-image'])[2]")
    public WebElement myCoursesListClick;
    @FindBy(xpath ="(//h1[@class='title'])[1]")
    public WebElement myCoursesListDisplayed;
    @FindBy(xpath ="(//div[@class='title float-start'])[2]")
    public WebElement contextMenu;
    @FindBy(xpath = "//span[text()='Basic']")
    public WebElement basicLinkBtn;
    @FindBy(id = "course_title")
    public  WebElement courseTitle;
    @FindBy(id="short_description")
    public WebElement shortDescription;
    @FindBy(xpath = "//div[@class='note-editable card-block']")
    public WebElement description;
    @FindBy(id = "select2-sub_category_id-container")
    public WebElement categoryDropMenu;

    @FindBy(xpath = "(//ul)[6]/li[2]/ul/li[1]")
    public WebElement webDesignSubmenu;
    @FindBy(id = "level")
    public WebElement selectMenu;
    @FindBy(id = "select2-level-container")
    public WebElement levelBox;
    @FindBy(xpath = "(//label[@for='enable_drip_content'])[2]")
    public WebElement dripContent;
    @FindBy(xpath = "//*[@id='is_top_course']")
    public WebElement topCourseCheckBox;
    @FindBy(xpath = "//*[text()='Check if this course is top course']")
    public WebElement topCourseLabel;




    //oboyraz Locators

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement firstLogin;

    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement cookieAccept;
    @FindBy(xpath = "//button[@class='btn-compare-sm float-end']")
    public WebElement compareButton;

    @FindBy(xpath = "(//img[@class='img-fluid'])[2]")
    public WebElement myProfileIcon;

    @FindBy(xpath = "//*[text()='My wishlist']")
    public WebElement myWishList;

    @FindBy(xpath = "//nav[@aria-label='breadcrumb']")
    public WebElement courseCompare;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement searchBox;

    @FindBy(xpath = "//h5[@class='title']")
    public List<WebElement> courseList;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement courseHead;

    @FindBy(xpath = "//img[@data-bs-toggle='tooltip']")
    public List<WebElement> instructorIcon;

    @FindBy(xpath = "//h4[text()='Instructor']")
    public WebElement instructorPageHead;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/div[4]/ul/li[1]")
    public WebElement courseDurationInfo;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/div[4]/ul/li[2]")
    public WebElement courseLectureInfo;

    @FindBy(xpath = "//span[@class='text-muted text-12px']")
    public List<WebElement> courseInfo;

    @FindBy(xpath = "//span[@class='select2-selection__clear']")
    public WebElement deleteCourseX;

    @FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
    public List<WebElement> coursesDropbox;

    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
    public WebElement courseDropboxResult;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchTextBoxArea;

    @FindBy(xpath = "//*[text()='Buy now']")
    public WebElement courseEnrollButton;

    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement enrolledPageInfo;

    @FindBy(xpath = "//a[@class='text-danger fw-500 pt-3 d-inline-block']")
    public WebElement learnMoreLink;

    @FindBy(xpath = "//*[text()='Course overview']")
    public WebElement courseOverviewPage;

    @FindBy(xpath = "//*[text()='Get Enrolled']")
    public WebElement getEnrolledButton;

    @FindBy(xpath = "//*[text()='My messages']")
    public WebElement myMessages;

    @FindBy(xpath = "//select[@class='form-control']")
    public  WebElement selectList;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement messageTextBox;

    @FindBy(xpath = "//div[@class='message-box-wrap me']")
    public List<WebElement> sendMessageTextBox;

    @FindBy(xpath = "//*[text()='Send ']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//div[@class='message']")
    public List<WebElement> messageContent;

    @FindBy(xpath = "//div[@class='col-lg-7 p-0']")
    public WebElement messageDetailBox;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelMessageButton;

    @FindBy(id = "NewMessage")
    public WebElement composeButton;

    @FindBy(xpath = "//div[@class='message-sender-wrap']")
    public List<WebElement> messageSenderAreas;

    @FindBy(xpath = "//*[text()='Purchase history']")
    public WebElement purchaseHistoryButton;

    @FindBy(xpath = "//*[text()='Invoice']")
    public WebElement invoiceButton;

    @FindBy(xpath = "//*[text()='invoice']")
    public WebElement invoicePage;

    @FindBy(xpath = "//a[@class='purchase-history-course-title']")
    public WebElement purchaseCourse;

    //Harun yucel testcase locaters

    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement  instructorElement;

    @FindBy(xpath = "//h4[@class='page-title']")
    public WebElement  BecomeAninstructor;

    @FindBy(xpath = "//h4[text()='Your application']")
    public WebElement  YOURAPPLICATION;

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement  DashboardButon;

    @FindBy(xpath = "//*[text()='Course manager']")
    public WebElement  CourseManagerButton;
    @FindBy(xpath = "//a[text()='english course']")
    public WebElement courseLinkH;
    @FindBy(xpath = "//a[text()=' Add section']")
    public WebElement addSection;
    @FindBy(xpath = "//input[@id='title']")
    public WebElement inputText;

   @FindBy(xpath = "(//div[@class='modal-content'])[5]")
     public WebElement sectionlist;

    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement addSectionSubmit;
    @FindBy(xpath = "//*[text()='to be']")
    public WebElement sections;

    @FindBy(xpath = "//*[text()='Close']")
    public WebElement addSectionclose;
    @FindBy(xpath = "(//button[@aria-label='Close'])[5]")
    public WebElement xBtn;
    @FindBy(xpath = "(//*[text()='Course manager'])[2]")
    public WebElement cMaganerHeader;

    @FindBy(xpath = "//a[text()=' Add lesson']")
    public WebElement addLesson;

    @FindBy(xpath = "(//label[@class='custom-control-label'])[8]")
    public WebElement gooogleDriveVideo;


    @FindBy(xpath = "//div[@class='alert alert-info']")
    public WebElement lessontype;

    @FindBy(xpath = "//a[@type='button']")
    public WebElement next;

    @FindBy(xpath = "//h5[text()='Select lesson type']")
    public WebElement selectLessontype;


 @FindBy(xpath = "//form[@class='required-form']")
 public WebElement addlessonTable;

 @FindBy(xpath = "//button[text()='Close']")
 public WebElement closebutton;

 @FindBy(xpath = "(//a[@class='btn btn-outline-primary btn-rounded btn-sm ml-1'])[3]")
 public WebElement sortSections;

 @FindBy(xpath = "//div[@id='144']")
 public WebElement lessonbutton1;

 @FindBy(xpath = "//div[@id='91']")
 public WebElement lessonbutton2;

 @FindBy(xpath = "//div[@id='63']")
 public WebElement lessonbutton3;

 @FindBy(xpath = "//button[text()='Update sorting']")
 public WebElement updatesorting;
@FindBy(xpath = "//div[@id='section-list']/div")
public List<WebElement> dragDropList;


 @FindBy(xpath = "//div[@id='section-63']")
 public WebElement section3Table;


 @FindBy(xpath = "(//button[@class='btn btn-outline-secondary btn-rounded btn-sm'])[3]")
 public WebElement sortLesson;

 @FindBy(xpath = "(//div[@class='card mb-0 mt-2 draggable-item'])[1]")
 public WebElement sortLessonbutton1;

 @FindBy(xpath = "(//div[@class='card mb-0 mt-2 draggable-item'])[2]")
 public WebElement sortLessonbutton2;


 @FindBy(xpath = "//button[@id='lesson-sort-btn']")
 public WebElement updatesorting2;


 @FindBy(xpath = "//div[@id='lesson-61']")
 public WebElement Lesson2;

 @FindBy(xpath = "//div[@id='lesson-72']")
 public WebElement Lesson3;

 @FindBy(xpath = "//input[@id='title']")
 public WebElement updateSectionTitle;

 @FindBy(xpath = "(//button[@name='button'])[8]")
 public WebElement editeSection;

 @FindBy(xpath = "(//button[text()='Submit'])[2]")
 public WebElement submitedit;

 @FindBy(xpath = "(//h5[@class='card-title'])[3]")
 public WebElement editeSectionTitle;

 @FindBy(xpath = "//button[text()='Close']")
 public WebElement closeedit;

 @FindBy(xpath = "//div[@id='section-458']")
 public WebElement deletesectionTable;

 @FindBy(xpath = "(//button[@class='btn btn-outline-secondary btn-rounded btn-sm ml-1'])[6]")
 public WebElement deletesection;


 @FindBy(xpath = "//a[@id='update_link']")
 public WebElement continueDeleteSection;

 @FindBy(xpath = "//a[@class='nav-link rounded-0 pt-2 pb-2 active']")
 public WebElement curriculum;

 @FindBy(xpath = "//button[@onclick='checkRequiredFields()']")
 public WebElement submitsection;


 @FindBy(xpath = "(//div[@class='note-editable card-block'])[2]")
 public WebElement updatelessonExplanation;


 @FindBy(xpath = "//div[@id='lesson-229']")
 public WebElement lesson1box;

 @FindBy(xpath = "(//i[@class='mdi mdi-pencil-outline'])[2]")
 public WebElement lesson1edit;

 @FindBy(xpath = "(//i[@class='mdi mdi-window-close'])[2]")
 public WebElement lesson1close;

 @FindBy(xpath = "(//input[@name='title'])[2]")
 public WebElement lesson1title;

 @FindBy(xpath = "(//h5[@class='card-title mb-0'])[1]")
 public WebElement lesson1text;


 @FindBy(xpath = "//button[text()='Update lesson']")
 public WebElement lesson1update;

 @FindBy(xpath = "//h5[text()='Update lesson']")
 public WebElement updateLessontitle;

 @FindBy(xpath = "//*[text()='Invalid url. Your video source has to be either youtube or vimeo']")
 public WebElement invalidUrlText;






    // cihat gul

    @FindBy(xpath = "(//*[@style='width: auto;'])[4]")
    public WebElement youtubebuttonu;

    @FindBy(xpath = "//textarea[@name='address']")
    public WebElement adresButtonu;

    @FindBy(xpath = "//input[@placeholder='Your phone number will go here']")
    public WebElement yourPhoneNumber;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement anyMessage;

    @FindBy(xpath = "//label[@for='youtube']")
    public WebElement youtubevideo;

    @FindBy(xpath = "(//input[@class='form-control'])[9]")
    public WebElement lessontypeTitle;

    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[5]")
    public WebElement section;

    @FindBy(xpath = "//span[@class='select2-results']")
    public WebElement tobe;

    @FindBy(id = "video_url")
    public WebElement videoUrl;

    @FindBy(xpath = "//input[@id='duration']")
    public WebElement duration;

    @FindBy(xpath = "//button[text()='Add lesson']")
    public WebElement addLesson2;

    @FindBy(xpath = "//div[@id='section-63']")
    public WebElement lesoontablo;

    // cihat gul

    @FindBy(xpath = "//body/div[3]/div")
    public WebElement congratulationsmessage;

    @FindBy(xpath = "(//a[text()='Edit this course'])[1]")
    public WebElement actionsEditCourse;

    @FindBy(xpath = "(//a[@class='side-nav-link '])[1]")
    public WebElement courseManagerLink;


    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement instructorLink;

 /*@FindBy(xpath = "(//input[@class='form-control'])[9]")
 //public WebElement lessontypeTitle;

 //@FindBy(xpath = "(//span[@class='select2-selection__arrow'])[5]")
 //public WebElement section;

 @FindBy(xpath = "//span[@class='select2-results']")
 public WebElement tobe;

 @FindBy(id = "video_url")
 public WebElement videoUrl;




 @FindBy(xpath = "//input[@id='duration']")
 public WebElement duration;


 @FindBy(xpath = "//button[text()='Add lesson']")
 public WebElement addLesson2;

 @FindBy(xpath = "//div[@id='section-63']")
 public WebElement lesoontablo;
  */

 @FindBy(xpath = "//div[@class='modal-body ml-2 mr-2']")
 public WebElement durationgroup;

 @FindBy(xpath = "//label[text()='Invalid url. Your video source has to be either youtube or vimeo']")
 public WebElement invalidUrl;

 @FindBy(xpath = "(//div[@class='note-editable card-block'])[2]")
 public WebElement Summary;

 @FindBy(xpath = "//input[@id='free_lesson']")
 public WebElement freelessoncheckbox;













    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookiesAccept;



//mustafazdl Locators

 @FindBy(xpath = "//div[@class='card shadow-none m-0']")
 public WebElement numberOfClass;

 @FindBy(xpath = "//h4[@class='page-title']")
 public WebElement coursesTitle;

 @FindBy(xpath = "//p[text()='Pending balance']")
 public WebElement pendingBalance;

 @FindBy(xpath = "//h4[@class='page-title']")
 public WebElement payoutReportTitle;

 @FindBy(xpath = "//p[text()='Requested withdrawal amount']")
 public WebElement requestedWithdrawalAmount;


 @FindBy(xpath = "//button[text()='Filter']")
 public WebElement filterButton;

 @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[2]")
 public WebElement statusClick;

 @FindBy(xpath = "(//input[@class='select2-search__field']")
 public WebElement statusBox;

 @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[3]")
 public WebElement priceClick;

 @FindBy(xpath = "(//input[@class='select2-search__field']")
 public WebElement priceBox;

 @FindBy(xpath = "(//div[@id='course-datatable-server-side_info']")
 public WebElement filterResult;

 @FindBy(xpath = "//input[@class='form-control form-control-sm']")
 public WebElement srchbx;

 @FindBy(xpath = "//td[text()='No matching records found']")
 public WebElement srchbxResult;


 @FindBy(xpath = "//*[@class='sorting_1']")
 public WebElement tdshrtbx;

 @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[2]")
 public WebElement actionsButton;

 @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[5]")
 public WebElement denemexActionsbutton;

 @FindBy(xpath = "(//ul)[5]/li[1]")
 public WebElement viewCourse;

 @FindBy(xpath = "(//ul)[5]/li[2]")
 public WebElement goToCourse;

 @FindBy(xpath = "(//ul)[5]/li[3]")
 public WebElement editCourse;

 @FindBy(xpath = "(//ul)[5]/li[4]")
 public WebElement sectionAndLesson;

 @FindBy(xpath = "(//ul)[5]/li[5]")
 public WebElement markAsDrafted;

 @FindBy(xpath = "(//ul)[5]/li[6]")
 public WebElement deleteButton;

 @FindBy(xpath = "(//ul)[8]/li[6]")
 public WebElement denemexDeletebutton;


 @FindBy(xpath = "//a[@id='update_link']")
 public WebElement updateLinkContinou;

 @FindBy(xpath = "//input[@id='course_title']")
 public WebElement courseTitleBox;

 @FindBy(xpath = "(//a[@class='btn btn-info'])[2]")
 public WebElement nextButton;

 @FindBy(xpath = "//i[@class='mdi mdi-arrow-left-bold']")
 public WebElement backButton;

 @FindBy(xpath = "//a[@class='alignToTitle btn btn-outline-secondary btn-rounded btn-sm my-1']")
 public WebElement backtoCourseListButton;

 @FindBy(xpath = "//a[@class='alignToTitle btn btn-outline-secondary btn-rounded btn-sm ml-1 my-1']")
 public WebElement viewonFrontedButton;

 @FindBy(xpath = "(//td[@class='sorting_1'])[4]")
 public WebElement denemexButton;

 @FindBy(xpath = "(//p[text()='Are you sure?'])[1]")
 public WebElement areyouSure;

 @FindBy(xpath = "//a[@id='update_link']")
 public WebElement continueButton;

 @FindBy(xpath = "(//td/strong/a)[1]")
 public WebElement courseListBirinciDers;

 @FindBy(xpath = "//a[@class='nav-link rounded-0 pt-2 pb-2 active']")
 public WebElement requirementsBox;

 @FindBy(xpath = "(//input[@id='outcomes'])[1]")
 public WebElement provideOutcomesBox;

 @FindBy(xpath = "//input[@id='price']")
 public WebElement coursePriceBox;

 @FindBy(xpath = "//input[@id='course_overview_url']")
 public WebElement courseOverviewUrlBox;

 @FindBy(xpath = "//textarea[@name='meta_description']")
 public WebElement metaDescriptionBox;











 // cihat aydın locaters

 @FindBy(linkText = "Log in")
 public WebElement firstLoginButton;

 @FindBy (linkText = "Accept")
 public WebElement cookieAcceptButton;

 @FindBy (id = "login-email")
 public WebElement userMailBox;

 @FindBy (id = "login-password")
 public WebElement userPasswordBox;

 @FindBy (xpath = "(//button[@type='submit'])[2]")
 public WebElement secondLoginButton;

 @FindBy (xpath = "//div[@class = 'user-box menu-icon-box']")
 public WebElement profileImg;

 @FindBy (xpath = "//*[text()='User profile']")
 public WebElement userProfile;

 @FindBy (xpath = "//input[@id='FristName']")
 public WebElement firstNameBox;

 @FindBy (xpath = "//input[@name='last_name']")
 public WebElement lastNameBox;

 @FindBy (xpath = "//textarea[@name='title']")
 public WebElement titleBox;

 @FindBy (xpath = "//*[@class='input placeholder']")
 public WebElement skillsBox;

 @FindBy (xpath = "//body[@id='tinymce']")
 public WebElement biographyBox;

 @FindBy (xpath = "//input[@name='twitter_link']")
 public WebElement twLinkBox;

 @FindBy (xpath = "//input[@name='facebook_link']")
 public WebElement fcLinkBox;

 @FindBy (xpath = "//input[@name='linkedin_link']")
 public WebElement lnLinkBox;

 @FindBy(xpath = "//*[text()='Save']")
 public WebElement saveButton;

 @FindBy(xpath = "//i[@class='far fa-user-circle']")
 public WebElement profileButton;




}
