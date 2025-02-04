package tutorial.part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import tutorial.part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        Assert.assertTrue(formsPage.isFemaleSelected(), "\nFemale Radio Button is NOT selected\n");
    }
}
