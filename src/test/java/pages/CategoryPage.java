package pages;

import javafx.beans.value.WeakChangeListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage{

    @FindBy(xpath = "//a[text()='Pet Supplies']")
    private WebElement petCategoryButton;

    @FindBy(xpath = "//a[@aria-label='DOGS']")
    private WebElement dogsCategoryButton;

    public CategoryPage(WebDriver driver){
        super(driver);
    }

    public void clickPetCategoryButton(){
        petCategoryButton.click();
    }

    public void clickDogsCategoryButton(){
        dogsCategoryButton.click();
    }
}
