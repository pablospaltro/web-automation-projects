package org.example.actions.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SearchActions {

    private WebDriver driver;

    public SearchActions(WebDriver driver) {
        this.driver = driver;
    }

    public void forTecnicaturas() {
        driver.findElement(By.cssSelector("a[href='https://mdp.utn.edu.ar/carreras/']")).click();
    }
}
