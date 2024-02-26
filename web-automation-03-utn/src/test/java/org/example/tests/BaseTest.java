package org.example.tests;

import org.example.actions.navigation.HomePage;
import org.example.actions.navigation.CarrerasPage;
import org.example.actions.search.SearchActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    protected WebDriver driver;

    protected HomePage homePage;
    protected CarrerasPage carrerasPage;

    protected SoftAssert softAssert;

    protected SearchActions search;
    protected Actions actions;

    @BeforeMethod
    public void setUp() {
        String driverPath = "C:\\Users\\Usuario\\JAVA\\web-automation-projects\\web-automation-03-utn\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        homePage = new HomePage(driver, "https://mdp.utn.edu.ar/");
        carrerasPage = new CarrerasPage(driver);
        softAssert = new SoftAssert();
        search = new SearchActions(driver);
        actions = new Actions(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public SoftAssert getSoftAssert() {
        return softAssert;
    }

}
