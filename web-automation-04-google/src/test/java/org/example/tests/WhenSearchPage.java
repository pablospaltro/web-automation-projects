package org.example.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenSearchPage extends BaseTest {

    /*
    Feature: Find correct result

    Scenario: Find correct page on the ResultsPage

    Given I am on the HomePage
    When I search for Wikipedia
    Then the ResultsPage should display the correct Wikipedia title
     */

    @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Test
    public void whenSearchPage(){
        search.forWikipedia();
        softAssert.assertEquals(searchResultsPage.getTitle(),
                "Wikipedia");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        softAssert.assertAll();
    }
}
