package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.example.pages.HomePage;
import org.example.pages.InventoryPage;
import org.example.pages.SellStepOnePage;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected InventoryPage inventoryPage;
    protected SellStepOnePage sellStepOnePage;

    @BeforeMethod
    public void setUp() {
        String driverPath = "C:\\Users\\Usuario\\JAVA\\web-automation-projects\\web-automation-01-meli\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        homePage = new HomePage(driver, "https://www.mercadolibre.com.ar");
        inventoryPage = new InventoryPage(driver);
        sellStepOnePage = new SellStepOnePage(driver);
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

    public InventoryPage getInventoryPage() {
        return inventoryPage;
    }

    public SellStepOnePage getSellStepOnePage() {
        return sellStepOnePage;
    }
}
