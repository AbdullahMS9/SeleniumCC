package personal.com.adabny.tests.auth;

import org.testng.Assert;
import org.testng.annotations.Test;
import personal.com.adabny.base.BaseTest;

@Test
public class LoginTests extends BaseTest {

    public void testLoginErrorMessage(){
        var loginPage = homePage.goToLoginPage();
        String email = "joe@email.com";
        String password= "12345";
        loginPage.logIntoApplication(email, password);
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.equals("Invalid email or password"),
                "Actual Error Message: "+actualMessage);
    }

    public void testLoginFunctionality(){
        var loginPage = homePage.goToLoginPage();
        var productsPage= loginPage.logIntoApplication("joe@email.com", "123456");
        String actualValue = productsPage.getLogOutButtonText();
        Assert.assertTrue(actualValue.equals("Logout"),
                "\nExpected Val: Logout" +
                        "\nActual Value: "+ actualValue);
    }

}
