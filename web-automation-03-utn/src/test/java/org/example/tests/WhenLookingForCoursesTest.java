package org.example.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenLookingForCoursesTest extends BaseTest{

    /*
    Feature: Go to the Courses section

    Scenario: Search for Courses from the HomePage

    Given I am on the HomePage
    When I search for available Courses
    And I get to the Courses section
    And I click on the Courses button
    Then the CoursesPage should display the correct title text
    */

    @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Test
    public void whenLookingForCourses(){
        search.forCourses();
        softAssert.assertEquals(coursesPage.getHeading(),
                "CURSOS");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }
}
