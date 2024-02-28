package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    public HomePage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }
}
