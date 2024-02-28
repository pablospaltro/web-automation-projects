package org.example.actions.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SearchActions {

    private WebDriver driver;

    public SearchActions(WebDriver driver) {
        this.driver = driver;
    }

    /*
    In this method, the first two 'clicks' are actually positioning the cursor
    over the element, and the third one is the real click to go to the next page
     */
    public void forTecnicatura() {
        // position on "Carreras":
        driver.findElement(By.xpath("//body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
        // position on "Tecnicaturas":
        driver.findElement(By.xpath("//body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();
        // click on "Técnico Universitario en Programación":
        // (With this one we should get to the next page, the specific one for the Tecnicatura)
        driver.findElement(By.xpath("//body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[5]/a[1]")).click();
    }

}
