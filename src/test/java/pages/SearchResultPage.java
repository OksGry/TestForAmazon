package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver){ super(driver);}

    @FindBy(xpath="//div[@class='a-section a-spacing-medium']//h2/a[@class='a-link-normal a-text-normal']")
    private List<WebElement> searchResultProductList;

    public List<WebElement> getSearchResultProductList(){
        return searchResultProductList;
    }
}
