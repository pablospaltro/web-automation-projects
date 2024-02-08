package org.example.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenClickOnSellTest extends BaseTest{

    /*
    Feature: Clicking on sell button

    Scenario: Display correct message text on SellStepOnePage after clicking

    Given I am on the HomePage
    When I click on Sell
    Then the SellStepOnePage should display the correct login text
     */

    @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Test
    public void whenClickOnSellTest() {

        homePage.clickOnSell();
        softAssert.assertEquals(sellStepOnePage
                .getFooterText(),
                "¡Hola! Para vender, ingresá a tu cuenta");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }
}
