package org.example.tests;

import org.example.actions.login.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenAddProductToCartTest extends BaseTest {

    /*
    Feature: Product Purchase Verification

    Scenario: Verify Correct Product Addition in CartPage

    Given I am on the HomePage
    When I log in with valid credentials
    And I add a product to the cart
    Then the added product should be displayed correctly in the CartPage
     */

    @BeforeMethod
    public void setUp() {
        super.setUp();
        login.as(User.STANDARD_USER);
    }

    @Test
    public void whenAddProductToCart(){
        purchase.addProductToCart();
        softAssert.assertEquals(cartPage.getProductNameFromCart(),
                "Sauce Labs Backpack");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }
}
