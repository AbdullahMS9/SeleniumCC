package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderResult(){
        var sliderPage = homePage.goToWidgets().clickSlider();
        int x = 180, y = 0;
        sliderPage.moveSlider(x,y);
        int actualValue = Integer.parseInt(sliderPage.getSliderValue());
        int expectedValue = 85;
        //Assert.assertEquals(actualValue, expectedValue, "Actual Value is: "+actualValue);
        Assert.assertTrue(Math.abs(actualValue-expectedValue) < 2,
                "The actual value does not differ less than 2 and is: "+ actualValue);
    }
}
