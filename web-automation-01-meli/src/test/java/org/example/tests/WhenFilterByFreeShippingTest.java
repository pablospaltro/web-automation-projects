package org.example.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenFilterByFreeShippingTest extends BaseTest {

    /*
    Feature: Filter the inventory by free shipping

    Scenario: Display correct message text on product specs

    Given I am on the InventoryPage
    When I click on FreeShipping search filter
    Then the first product available should display the correct text
     */

    @BeforeMethod
    public void setUp() {
        super.setUp();
        getHomePage().setBarText("Botella termica");
        getHomePage().clickOnSearch();
    }

    @Test
    public void whenFilterByFreeShippingTest() {

        inventoryPage.clickOnSearchFilter();
        softAssert.assertEquals(inventoryPage
                .getFirstProductAvailableShippingText(),
                "Llega gratis mañana");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }
}
