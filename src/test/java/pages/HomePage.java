package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath ="//select[@title='Search in']")
    private WebElement searchByDepartamentButton;

    @FindBy(xpath = "//option[text()='Books']")
    private WebElement booksDepartamentButton;

    @FindBy(xpath = "//input[@name='field-keywords']")
    private WebElement inputSearch;

    @FindBy(xpath ="//div[@id='nav-tools']/a[contains(@href,'signin')]")
    private WebElement accountButton;

    @FindBy(xpath = "//a[@aria-label='Shop by Category - Shop now']")
    private WebElement shopByCategoryButton;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement cartCount;


    public HomePage(WebDriver driver){ super(driver);}

    public void clickSeearchByDepartametButton(){
        searchByDepartamentButton.click();
    }

    public void clickBooksDepartamentButton(){
        booksDepartamentButton.click();
    }

    public void searchByKeyword(final String keyword){
        inputSearch.sendKeys(keyword, Keys.ENTER);
    }

    public void clickAccountButton(){
        accountButton.click();
    }

    public void clickShopByCategoryButton(){
        shopByCategoryButton.click();
    }

    public String getCartCount(){
        return cartCount.getText();
    }

    // done


}
