package part3_4.com.demoqa.tests.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import static org.testng.Assert.assertEquals;

@Test
public class DynamicWaitTests extends BaseTest {
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        assertEquals(actualText, expectedText,
                "\n Actual & Expected Text Do Not Match \n");
    }
}
