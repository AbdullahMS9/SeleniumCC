package tutorial.part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import tutorial.part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModal(){
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialoguePage = afwPage.clickModalDialogue();
        modalDialoguePage.clickSmallModalButton();
        String actualText = modalDialoguePage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"),
                "\nMessage does not contain small modal\n");
        modalDialoguePage.clickCloseButton();
    }
}
