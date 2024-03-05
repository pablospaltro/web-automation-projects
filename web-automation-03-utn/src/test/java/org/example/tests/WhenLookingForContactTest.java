package org.example.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenLookingForContactTest extends BaseTest{

    /*
    Feature: Go to the Contact section

    Scenario: Search for Contact from the HomePage and get the proper email contact

    Given I am on the HomePage
    When I search for Contact
    And I get to the ContactPage section
    Then the ContactPage should display the correct email and address text
    */

    @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Test
    public void whenLookingForEmail(){
        search.forContact();
        softAssert.assertEquals(contactPage.getEmailContact(),
                "informes@mdp.utn.edu.ar");
    }

    @Test
    public void whenLookingForAddress(){
        search.forContact();
        softAssert.assertEquals(contactPage.getAddress(),
                "Buque Pesquero Dorrego N° 281");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }


}
