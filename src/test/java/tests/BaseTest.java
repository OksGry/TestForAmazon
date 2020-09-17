package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {

    private WebDriver driver;
    private static final String AMAZON_URL = "https://www.amazon.com/";

    @BeforeTest
    public void profileSetUP(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AMAZON_URL);
    }

    @AfterMethod
    public void tearDown() {driver.close();}

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public SignInPage getSignInPage(){ return new SignInPage(getDriver());}

    public RegisterPage getRegisterPage(){ return new RegisterPage(getDriver());}

    public DogCategoryPage getDDogCategoryPage(){return new DogCategoryPage(getDriver());}

    public CategoryPage getCategoryPage(){return new CategoryPage(getDriver());}

    public CartPage getCartPage(){return new CartPage(getDriver());}

    public ProductPage getProductPage(){return new ProductPage(getDriver());}

    public void refreshPage(){
        driver.navigate().refresh();
    }


}
