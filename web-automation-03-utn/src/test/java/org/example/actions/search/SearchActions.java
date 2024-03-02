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
    In the following methods, not all 'click' functions are actually clicking
    on the element. Some of them are just positioning the cursor over them
    (so the element can display its dropdown menu).

    forCareer(): the first two 'clicks' are actually positioning the cursor
    over the element, and the third one is the real click in order to go to
    the next page (this same methodology goes for 'forCourses()').
     */
    public void forCareer() {
        // position on "Carreras":
        driver.findElement(By.xpath("//body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
        // position on "Tecnicaturas":
        driver.findElement(By.xpath("//body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();
        // click on "Técnico Universitario en Programación":
        // (With this one we should get to the next page, the specific one for the Tecnicatura)
        driver.findElement(By.xpath("//body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[5]/a[1]")).click();
    }

    public void forCourses(){
        // position on "Courses"
        driver.findElement(By.xpath("//body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
        // click on the "Courses" button inside the dropdown menu
        driver.findElement(By.xpath("//body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
    }

}
