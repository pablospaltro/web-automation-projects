package org.example.actions.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginActions {

    private WebDriver driver;

    public LoginActions(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(By.cssSelector("[data-test='username']")).sendKeys(username);
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();
    }


}
