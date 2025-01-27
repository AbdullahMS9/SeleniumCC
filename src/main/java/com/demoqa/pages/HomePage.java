package com.demoqa.pages;

import com.demoqa.pages.alerts_frames_windows.Alert_Frames_WindowsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;
import static util.JavaScriptUtilities.*;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By alertFrameWindowsCard = By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public Alert_Frames_WindowsPage goToAlertsFramesWindowsCard(){
        scrollToElementJS(alertFrameWindowsCard);
        click(alertFrameWindowsCard);
        return new Alert_Frames_WindowsPage();
    }

}
