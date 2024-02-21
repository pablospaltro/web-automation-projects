package org.example.tests;

import org.example.actions.login.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenLogIn extends BaseTest {

    /*
    Feature: Login with credentials

    Scenario: Correct login with username and password in HomePage

    Given I am on the HomePage
    When I log in as username and password
    Then the InventoryPage should display the correct title text
     */

    @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Test
    public void whenLogIn(){
        login.as(User.STANDARD_USER);
        softAssert.assertEquals(inventoryPage.getHeading(),
                "Products");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }

}
