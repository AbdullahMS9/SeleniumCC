package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static util.GetUtility.getText;
import static util.JavaScriptUtilities.scrollToElementJS;
import static util.WaitUtility.*;

public class ProgressBarPage extends WidgetsPage{
    private By startStopButton = By.id("startStopButton");
    private By progressPercent = By.xpath("//*[@id='progressBar']/div[@aria-valuenow='100']");

    public void clickStartStopButton(){
        scrollToElementJS(startStopButton);
        click(startStopButton);
    }

    public String getProgressValue(){
        fluentWaitUntilVisible(30, progressPercent);
        return getText(progressPercent);
    }

}
