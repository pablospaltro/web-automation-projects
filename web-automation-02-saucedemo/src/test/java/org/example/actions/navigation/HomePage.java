package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }

    @FindBy(css="")
    private WebElement searchInput;

    @FindBy(css="")
    private WebElement submitBtn;


    public void setBarText(String text){
        this.searchInput.sendKeys(text);
    }

    public void clickOnSearch(){
        this.submitBtn.click();
    }
}