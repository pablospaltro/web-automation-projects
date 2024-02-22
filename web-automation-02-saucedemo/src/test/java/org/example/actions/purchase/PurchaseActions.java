package org.example.actions.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseActions {

    private WebDriver driver;

    public PurchaseActions(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart(){
        driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-backpack']")).click();
    }


}
