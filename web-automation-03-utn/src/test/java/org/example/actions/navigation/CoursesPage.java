package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursesPage extends BasePage{

    public CoursesPage(WebDriver driver) {
        super(driver);
    }

    /*
    the following css selector looks identical to the one used on CareerPage,
    but for now and in order to keep the pages organized and atomic,
    we'll keep it this way.
     */
    @FindBy(css=".elementor-heading-title.elementor-size-default:first-child")
    private WebElement title;

    public String getHeading(){
        return this.title.getText();
    }
}
