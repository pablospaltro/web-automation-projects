package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryPage extends BasePage{

    public InventoryPage (WebDriver driver){
        super(driver);
    }

    @FindBy(css=".ui-search-breadcrumb__title")
    private WebElement footerText;

    @FindBy(css=".ui-search-filter-groups .ui-search-filter-dl:nth-child(3)")
    private WebElement searchFilterBtn;

    @FindBy(css=".ui-search-item__promise")
    private List<WebElement> productsShippingTexts;

    public WebElement getFirstProductText() {
        return productsShippingTexts.get(0);
    }

    public String getFooterText(){
        this.isElementDisplayed(this.footerText);
        return this.footerText.getText();
    }

    public void clickOnSearchFilter(){
        this.searchFilterBtn.click();
    }

    public String getFirstProductAvailableShippingText(){
        this.isElementDisplayed(this.getFirstProductText());
        return this.getFirstProductText().getText();
    }


}