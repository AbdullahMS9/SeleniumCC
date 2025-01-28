package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static util.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlert();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\nActual and expected messages do not match\n");
        acceptAlert();
    }

    public void testConfirmationAlert() {
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlert();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        String expectedConfirmationResult = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "\n You Did Not Select Cancel \n");
    }

}
