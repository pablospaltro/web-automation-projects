package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }

    @FindBy(css="[data-test='username']")
    private WebElement usernameInput;

    @FindBy(css="[data-test='password']")
    private WebElement passwordInput;

    @FindBy(css="[data-test='login-button]'")
    private WebElement submitBtn;

    public void setUsername(String text){
        this.usernameInput.sendKeys(text);
    }

    public void setPassword(String text){
        this.passwordInput.sendKeys(text);
    }

    public void clickOnSearch(){
        this.submitBtn.click();
    }
}