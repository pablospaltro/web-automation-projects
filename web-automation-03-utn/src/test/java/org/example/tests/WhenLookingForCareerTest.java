package org.example.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenLookingForCareerTest extends BaseTest{

    /*
    Feature: Search a specific career

    Scenario: Search for a specific Tecnicatura

    Given I am on the HomePage
    When I search for available Tecnicaturas in Careers
    Then the TecnicaturasPage should display the correct title text
    And I should see a list of Tecnicaturas related to my search
    And each Tecnicatura listed should contain relevant information such as description, duration, and requirements
    And I should be able to click on a Tecnicatura to view more details
    */

    @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Test
    public void whenLogIn(){
        search.forTecnicaturas();
        softAssert.assertEquals(tecnicaturasPage.getHeading(),
                "TECNICATURAS");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }

}
