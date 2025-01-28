package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.elements.DynamicPropertiesPage;
import org.openqa.selenium.By;

import static util.JavaScriptUtilities.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']/span[text()='Slider']");

    public SliderPage clickSlider(){
        scrollToElementJS(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderPage();
    }

    public ProgressBarPage clickProgressBar() {
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }
}
