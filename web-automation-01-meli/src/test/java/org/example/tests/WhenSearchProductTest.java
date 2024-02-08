package org.example.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenSearchProductTest extends BaseTest{

    /*
    Feature: Searching for a product

    Scenario: Display correct product text on InventoryPage after searching

    Given I am on the HomePage
    When I search for a product
    Then the InventoryPage should display the correct product text
     */

    @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Test
    public void whenSearchingAProductTest() {

        homePage.setBarText("Botella termica");
        homePage.clickOnSearch();

        softAssert.assertEquals(inventoryPage
                .getFooterText(),
                "Botella termica");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }
}
