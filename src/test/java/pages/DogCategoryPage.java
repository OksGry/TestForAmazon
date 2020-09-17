package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DogCategoryPage extends BasePage{

    public DogCategoryPage(WebDriver driver){ super(driver);}

    @FindBy(xpath = "//a[@class='a-link-normal a-text-normal' and contains(@href,'ChomChom-Roller')]")
    private WebElement productButton;

    @FindBy(xpath = "//span[@dir='auto' and text() = 'Food']")
    private WebElement foodButton;

    @FindBy(xpath = "//div[@class='a-section a-spacing-medium']//a[@class='a-link-normal a-text-normal']")
    private List<WebElement> productsDescription;

    public List<WebElement> getProductsDescriptionList() {
        return productsDescription;
    }


    public void clickProductButton(){
        productButton.click();
    }

    public void clickFoodButton(){
        foodButton.click();
    }
}
