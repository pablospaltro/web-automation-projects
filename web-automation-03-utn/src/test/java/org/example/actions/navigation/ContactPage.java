package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".elementor-widget-container ul.elementor-icon-list-items li:nth-child(2)")
    private WebElement email;

    @FindBy(css=".elementor-widget-container ul.elementor-icon-list-items li:nth-child(3)")
    private WebElement address;



    public String getEmailContact(){
        return this.email.getText();
    }

    public String getAddress(){
        return this.address.getText();
    }
}
