package org.example.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenLookingForCareerTest extends BaseTest{

    /*
    Feature: Go to the Técnico Universitario en Programación section

    Scenario: Search for a Tecnicatura from the HomePage

    Given I am on the HomePage
    When I search for available Careers
    And I get to the Tecnicaturas section
    And I click on the Tecnico Universitario en Programacion button
    Then the TecnicaturaPage should display the correct title text
    */

    @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Test
    public void whenLookingForCareer(){
        search.forTecnicatura();
        softAssert.assertEquals(carrerasPage.getHeading(),
                "TÉCNICO UNIVERSITARIO EN PROGRAMACIÓN");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }

}
