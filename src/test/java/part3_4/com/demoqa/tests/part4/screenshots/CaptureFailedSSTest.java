package part3_4.com.demoqa.tests.part4.screenshots;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedSSTest extends BaseTest {

    @Test
    public void testClickingSubmitWithoutJSExecutor(){
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton(); // Test Fail -> Screenshot
    }
}
