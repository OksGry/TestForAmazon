package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CartTests extends BaseTest{

    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";
    private String EMPTY_CART_COUNT = "0";

    @Test
    public void checkAddToCart(){
        getHomePage().clickShopByCategoryButton();
        getBasePage().implicitWait(10);
        getCategoryPage().clickPetCategoryButton();
        getCategoryPage().clickDogsCategoryButton();
        getBasePage().implicitWait(10);
        getDDogCategoryPage().clickProductButton();
        getProductPage().clickAddToCartButton();
        getCartPage().clickPreCartButton();
        assertEquals(getHomePage().getCartCount(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);

    }

    @Test
    public void checkRemoveToCart(){
        getHomePage().clickShopByCategoryButton();
        getBasePage().implicitWait(10);
        getCategoryPage().clickPetCategoryButton();
        getCategoryPage().clickDogsCategoryButton();
        getBasePage().implicitWait(10);
        getDDogCategoryPage().clickProductButton();
        getProductPage().clickAddToCartButton();
        getCartPage().clickPreCartButton();
        getCartPage().clickDeleteProductFromCartButton();
        assertEquals(getHomePage().getCartCount(), EMPTY_CART_COUNT);

    }

    @Test
    public void checkChangeTotalPriceСorrespondsOfAmountOfProducts(){
        getBasePage().implicitWait(10);
        getHomePage().clickShopByCategoryButton();
        getBasePage().implicitWait(10);
        getCategoryPage().clickPetCategoryButton();
        getCategoryPage().clickDogsCategoryButton();
        getBasePage().implicitWait(10);
        getDDogCategoryPage().clickProductButton();
        getProductPage().clickAddToCartButton();
        getCartPage().clickPreCartButton();
        getCartPage().clickChangeAmountOfProductButton();
        getCartPage().clickAmountButton();
        refreshPage();
        getBasePage().implicitWait(30);
        String expectedPrice = String.valueOf((getCartPage().getProductPrice())*2);
        String actualResult = String.valueOf(getCartPage().getTotalPrice());
        assertEquals( actualResult, expectedPrice);

    }




}
