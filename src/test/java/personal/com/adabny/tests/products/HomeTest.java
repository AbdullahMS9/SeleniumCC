package personal.com.adabny.tests.products;

import org.testng.Assert;
import org.testng.annotations.Test;
import personal.com.adabny.base.BaseTest;

public class HomeTest extends BaseTest {

    @Test
    public void testGoToProductPage(){
        var productPage = homePage.goToProductPagePoloBlue();
        String actualName = productPage.getProductName();
        Assert.assertTrue(actualName.toLowerCase().contains("polo blue"));
    }
}
