package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static util.JavaScriptUtilities.scrollToElementJS;

public class Alert_Frames_WindowsPage extends HomePage {
    private By modalsDialogueMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");

    public AlertsPage clickAlert(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }

    public ModalsDialoguePage clickModalDialogue(){
        scrollToElementJS(modalsDialogueMenuItem);
        click(modalsDialogueMenuItem);
        return new ModalsDialoguePage();
    }
}
