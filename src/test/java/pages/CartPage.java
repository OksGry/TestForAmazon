package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
    private WebElement preCartButton;

    @FindBy(xpath = "//input[@value='Delete']")
    private WebElement deleteProductFromCartButton;

    @FindBy(xpath = "//span[@data-a-class='quantity']")
    private WebElement changeAmountOfProductButton;

    @FindBy(xpath = "//a[@id='dropdown1_2']")
    private WebElement amountButton;

    @FindBy(xpath = "//span[contains(@class,'product-price')]")
    private WebElement productPrice;

    @FindBy(xpath = "//span[contains(@id,'amount-activecart')]/span")
    private WebElement totalPrice;

    public CartPage(WebDriver driver){super(driver);}

    public void clickPreCartButton(){
        preCartButton.click();
    }

    public void clickDeleteProductFromCartButton(){
        deleteProductFromCartButton.click();
    }

    public void clickChangeAmountOfProductButton(){
        changeAmountOfProductButton.click();
    }

    public void clickAmountButton(){
        amountButton.click();
    }

    public float getProductPrice(){
        //return productPrice.getText().substring(1);
        return  Float.valueOf(productPrice.getText().substring(1));
    }

    public float getTotalPrice(){
        return  Float.valueOf(totalPrice.getText().substring(1));

    }
}
