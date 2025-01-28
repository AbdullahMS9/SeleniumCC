package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.elements.DynamicPropertiesPage;
import org.openqa.selenium.By;

import static util.JavaScriptUtilities.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");
    //private By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");

    public ProgressBarPage clickProgressBar() {
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }
}
