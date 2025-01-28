package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static util.JavaScriptUtilities.scrollToElementJS;

public class AlertsPage extends Alert_Frames_WindowsPage{

    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");

    public void clickInformationAlertButton(){
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton() {
        scrollToElementJS(confirmationAlertButton);
        click(confirmationAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }
}
