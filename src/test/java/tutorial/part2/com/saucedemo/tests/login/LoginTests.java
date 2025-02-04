package tutorial.part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import tutorial.part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz300");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.toLowerCase().contains("epic sadface"));
    }
}
