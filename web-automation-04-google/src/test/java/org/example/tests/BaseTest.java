package org.example.tests;

import org.example.actions.navigation.HomePage;
import org.example.actions.navigation.SearchResultsPage;
import org.example.actions.search.SearchActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    protected WebDriver driver;

    protected HomePage homePage;
    protected SearchResultsPage searchResultsPage;

    protected SoftAssert softAssert;

    protected SearchActions search;

    @BeforeMethod
    public void setUp() {
        String driverPath = "C:\\Users\\Usuario\\JAVA\\web-automation-projects\\web-automation-04-google\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        homePage = new HomePage(driver, "https://www.google.com/");
        searchResultsPage = new SearchResultsPage(driver);
        softAssert = new SoftAssert();
        search = new SearchActions(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
