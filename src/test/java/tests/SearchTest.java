package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest{

    private String SEARCH_KEYWORD = "testing";
    private String RESULT_KEYWORD = "pet-supplies";

    @Test
    public void checkThatSearchResultsContainsSearchWord(){
        getHomePage().clickSeearchByDepartametButton();
        getBasePage().implicitWait(10);
        getHomePage().clickBooksDepartamentButton();
        getBasePage().implicitWait(10);
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().implicitWait(10);
        for (WebElement webElement: getSearchResultPage().getSearchResultProductList()){
            assertTrue(webElement.getAttribute("href").contains(SEARCH_KEYWORD));
        }
    }

    @Test
    public void checkThatResultСorrespondsChoseCategory(){
        getHomePage().clickShopByCategoryButton();
        getBasePage().implicitWait(10);
        getCategoryPage().clickPetCategoryButton();
        getCategoryPage().clickDogsCategoryButton();
        for (WebElement webElement: getDDogCategoryPage().getProductsDescriptionList()){
            assertTrue(webElement.getAttribute("href").contains(RESULT_KEYWORD));
        }
    }

}
