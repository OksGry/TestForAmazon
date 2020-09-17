package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver driver){super(driver);}

    @FindBy(xpath ="//input[@type='email']")
    private WebElement emailInput;

    @FindBy(xpath ="//input[@id='continue'")
    private WebElement continueButton;

    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//form[@name='signIn']//input[@type='password']")
    private WebElement inputPassword;



    public void enterUserEmail(final String email){
        emailInput.sendKeys(email,Keys.ENTER);
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void clickCreateAccountButton(){
        createAccountButton.click();
    }

    public void enterUserPassword(final String password) {
        inputPassword.sendKeys(password, Keys.ENTER);
    }



}
