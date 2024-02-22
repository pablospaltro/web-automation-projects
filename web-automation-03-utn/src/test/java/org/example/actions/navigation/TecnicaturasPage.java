package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TecnicaturasPage extends BasePage{

    public TecnicaturasPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".title")
    private WebElement title;

    public String getHeading(){
        return this.title.getText();
    }
}
