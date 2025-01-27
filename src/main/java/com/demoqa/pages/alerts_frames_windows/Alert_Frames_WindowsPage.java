package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static util.JavaScriptUtilities.scrollToElementJS;

public class Alert_Frames_WindowsPage extends HomePage {
    private By modalsDialogueMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");

    public ModalsDialoguePage clickModalDialogue(){
        scrollToElementJS(modalsDialogueMenuItem);
        click(modalsDialogueMenuItem);
        return new ModalsDialoguePage();
    }
}
