package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TecnicaturaPage extends BasePage{

    public TecnicaturaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".elementor-heading-title.elementor-size-default:first-child")
    private WebElement title;

    public String getHeading(){
        return this.title.getText();
    }
}
