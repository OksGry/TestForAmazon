package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[contains(@id,'name')]")
    private WebElement inputName;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    private WebElement inputRepeatPassword;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public void enterUserName(final String name){
        inputName.sendKeys(name, Keys.ENTER);
    }

    public void enterUserEmail(final String email){
        inputEmail.sendKeys(email,Keys.ENTER);
    }

    public void enterUserPassword(final String password){
        inputPassword.sendKeys(password,Keys.ENTER);
    }

    public void enterUserPasswordCheck(final String password){
        inputRepeatPassword.sendKeys(password,Keys.ENTER);
    }

    public void clickContinueButton(){
        continueButton.click();
    }



}
