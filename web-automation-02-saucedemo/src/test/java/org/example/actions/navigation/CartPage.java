package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".inventory_item_name")
    private WebElement productNameOnCart;

    public String getProductNameFromCart(){
        return this.productNameOnCart.getText();
    }
}
