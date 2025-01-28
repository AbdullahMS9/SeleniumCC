package personal.com.adabny.tests.auth;

import org.testng.Assert;
import org.testng.annotations.Test;
import personal.com.adabny.base.BaseTest;

@Test
public class LoginTests extends BaseTest {

    public void testLoginErrorMessage(){
        var loginPage = homePage.goToLoginPage();
        loginPage.setEmail("joe@email.com");
        loginPage.setPassword("12345");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.equals("Invalid email or password"),
                "Actual Error Message: "+actualMessage);
    }

}
