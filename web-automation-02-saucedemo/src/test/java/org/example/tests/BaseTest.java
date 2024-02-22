package org.example.tests;

import org.example.actions.login.LoginActions;
import org.example.actions.navigation.CartPage;
import org.example.actions.navigation.InventoryPage;
import org.example.actions.purchase.PurchaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.example.actions.navigation.HomePage;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    protected WebDriver driver;

    protected HomePage homePage;
    protected InventoryPage inventoryPage;
    protected CartPage cartPage;

    protected SoftAssert softAssert;

    protected LoginActions login;
    protected PurchaseActions purchase;



    @BeforeMethod
    public void setUp() {
        String driverPath = "C:\\Users\\Usuario\\JAVA\\web-automation-projects\\web-automation-02-saucedemo\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        homePage = new HomePage(driver, "https://www.saucedemo.com");
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        softAssert = new SoftAssert();
        login = new LoginActions(driver);
        purchase = new PurchaseActions(driver);
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
