package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTests extends BaseTest{

    private String NOT_VALID_EMAIL = "abcdf123@gsend.net";
    private String NAME = "Julia";
    private String EMAIL_REGISTER = "julia@gmail.com";
    private String EMAIL_SIGNIN = "oksanagrishman@gmail.com";
    private String PASSWORD = "123456";
    private String RE_PASSWORD ="A12345";


    private String helloMessage = "//h2[text()='Hi, Oksana']";
    private String allertMessage = "//div[contains(@class,'alert-error')]";
    private String allertMessageName = "//div[contains(text(),'Enter your name')]";
    private String allertMessagePassword = "//div[@role='alert']//div[contains(text(),'6 characters.')]";
    private String allertMessagePasswordCheck = "//div[@role='alert']//div[contains(text(),'match')]";

    @Test
    public void notValidSigIn(){

        getHomePage().clickAccountButton();
        getBasePage().implicitWait(10);
        getSignInPage().enterUserEmail(NOT_VALID_EMAIL);
        getBasePage().implicitWait(20);
        Boolean isPresent;
        isPresent = getDriver().findElements(By.xpath(allertMessage)).size()>0;
        assertTrue(isPresent);
    }

    @Test
    public void notInputName(){
        getHomePage().clickAccountButton();
        getBasePage().implicitWait(10);
        getSignInPage().clickCreateAccountButton();
        getRegisterPage().enterUserEmail(EMAIL_REGISTER);
        getRegisterPage().enterUserPassword(PASSWORD);
        getRegisterPage().enterUserPasswordCheck(PASSWORD);
        Boolean isPresent;
        isPresent = getDriver().findElements(By.xpath(allertMessageName)).size()>0;
        assertTrue(isPresent);

    }

    @Test
    public void notValidInputPassword() {
        getHomePage().clickAccountButton();
        getBasePage().implicitWait(10);
        getSignInPage().clickCreateAccountButton();
        getRegisterPage().enterUserName(NAME);
        getRegisterPage().enterUserEmail(EMAIL_REGISTER);
        getRegisterPage().enterUserPassword(PASSWORD.substring(1));
        getRegisterPage().enterUserPasswordCheck(PASSWORD);
        Boolean isPresent;
        isPresent = getDriver().findElements(By.xpath(allertMessagePassword)).size() > 0;
        assertTrue(isPresent);
    }

    @Test
    public void checkNotMatchPasswords() {
        getHomePage().clickAccountButton();
        getBasePage().implicitWait(10);
        getSignInPage().clickCreateAccountButton();
        getRegisterPage().enterUserName(NAME);
        getRegisterPage().enterUserEmail(EMAIL_REGISTER);
        getRegisterPage().enterUserPassword(PASSWORD);
        getRegisterPage().enterUserPasswordCheck(RE_PASSWORD);
        Boolean isPresent;
        isPresent = getDriver().findElements(By.xpath(allertMessagePasswordCheck)).size() > 0;
        assertTrue(isPresent);
    }


}
