package org.example.actions.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginActions {

    private WebDriver driver;

    public LoginActions(WebDriver driver) {
        this.driver = driver;
    }

    public void as(User user) {
        driver.findElement(By.cssSelector("[data-test='username']")).sendKeys(user.getUsername());
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys(user.getPassword());
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();
    }


}
