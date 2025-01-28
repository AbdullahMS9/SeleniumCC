package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static util.JavaScriptUtilities.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");
    //private By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");

    public DynamicPropertiesPage clickDynamicProperties() {
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }


}
