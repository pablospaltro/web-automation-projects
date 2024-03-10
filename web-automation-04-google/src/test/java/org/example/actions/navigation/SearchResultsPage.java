package org.example.actions.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".LC20lb.MBeuO.DKV0Md:first-child")
    private WebElement title;

    public String getTitle(){
        return this.title.getText();
    }
}
