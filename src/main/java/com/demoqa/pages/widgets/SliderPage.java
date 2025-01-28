package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static util.ActionsUtility.dragAndDropBy;
import static util.GetUtility.getDomAttribute;

public class SliderPage extends WidgetsPage{
    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");

    public String getSliderValue() {
        return getDomAttribute(sliderValue, "value");
    }

    public void moveSlider(int x, int y) {
        //Actions act = new Actions(driver);
        //act.dragAndDropBy(find(slider), x, y).perform();
        dragAndDropBy(find(slider), x, y);
    }

}
