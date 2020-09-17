package tests;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FilterTest extends BaseTest{

    String KEY_WORD = "Food";

    @Test
    public void checkFilterByDepsrtament() {
        getHomePage().clickShopByCategoryButton();
        getBasePage().implicitWait(10);
        getCategoryPage().clickPetCategoryButton();
        getCategoryPage().clickDogsCategoryButton();
        getBasePage().implicitWait(10);
        getDDogCategoryPage().clickFoodButton();
        for (WebElement webElement : getDDogCategoryPage().getProductsDescriptionList()) {

            assertTrue(webElement.getText().contains(KEY_WORD));
        }
    }
}
