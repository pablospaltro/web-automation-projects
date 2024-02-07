package org.example.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MeliTest extends BaseTest {

    private SoftAssert softAssert;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        softAssert = new SoftAssert();
    }

    @Test
    public void whenSearchingAProductTest() {

        getHomePage().setBarText("Botella termica");
        getHomePage().clickOnSearch();

        softAssert.assertEquals(getInventoryPage().getFooterText(), "Botella termica");
    }

    @Test
    public void whenClickOnSellTest() {

        homePage.clickOnSell();
        softAssert.assertEquals(sellStepOnePage.getFooterText(), "¡Hola! Para vender, ingresá a tu cuenta");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }
}

