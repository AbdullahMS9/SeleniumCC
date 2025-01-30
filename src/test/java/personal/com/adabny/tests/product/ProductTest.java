package personal.com.adabny.tests.product;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import personal.com.adabny.base.BaseTest;

@Test
public class ProductTest extends BaseTest {
    public void testGoToProductPage(){
        var productPage = homePage.goToProductPagePoloBlue();
        String actualName = productPage.getProductName();
        Assert.assertTrue(actualName.toLowerCase().contains("polo blue"));
    }

    public void testEmptyReview() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        var loginPage = homePage.goToLoginPage();
        var homePage= loginPage.logIntoApplication("joe@email.com", "123456");
        var productPage = homePage.goToProductPagePoloBlue();
        productPage.submitReview();
        String actualErr = productPage.getAlertText();

        softAssert.assertTrue(actualErr.toLowerCase().contains("required"),
                "\nExpected Error to contain: required" +
                        "\nActual Error Message: "+ actualErr);

        Thread.sleep(9000);

        productPage.writeComment("Good Stuff");
        productPage.submitReview();
        String actualAlert = productPage.getAlertText();
        softAssert.assertTrue(actualAlert.equals("Review successfully submitted"),
                "\nExpected Alert: Review successfully submitted" +
                        "\nActual Alert Message: "+ actualAlert);

        Thread.sleep(9000);

        productPage.submitReview();
        actualErr = productPage.getAlertText();
        softAssert.assertTrue(actualErr.equals("Product already reviewed"),
                "\nExpected Error: Product already reviewed" +
                        "\nActual Alert Message: "+ actualErr);

        softAssert.assertAll();
    }
}
