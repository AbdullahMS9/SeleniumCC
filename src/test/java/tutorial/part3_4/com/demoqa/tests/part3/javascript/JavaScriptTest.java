package tutorial.part3_4.com.demoqa.tests.part3.javascript;

import org.testng.annotations.Test;
import tutorial.part3_4.com.demoqa.base.BaseTest;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollingToElement(){
        homePage.goToForms();
    }
}
