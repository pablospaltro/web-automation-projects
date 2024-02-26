package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrerasPage extends BasePage{

    public CarrerasPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".elementor-heading-title.elementor-size-default:first-child")
    private WebElement title;

    public String getHeading(){
        return this.title.getText();
    }
}
