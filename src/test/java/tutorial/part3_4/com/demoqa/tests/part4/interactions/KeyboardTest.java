package tutorial.part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import tutorial.part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {
    @Test
    public void testAppUsingKeyboard(){
        var textBoxPage = homePage.goToElements().clickTextBox();
        String name = "Bob Alice";
        String email = "bob@alice.com";
        String address = "1 Home Ave";

        textBoxPage.setFullName(name);
        textBoxPage.setEmail(email);
        textBoxPage.setCurrentAddress(address);
        textBoxPage.clickSubmitButton();

        //String resultAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue((
                textBoxPage.getName().equals("Name:"+name)
                        && textBoxPage.getEmail().equals("Email:"+email)
                        && textBoxPage.getCurrentAddress().equals("Current Address :"+address))
                , "\nExpected Name/Email/CA: "+"Bob Alice/bob@alice.com/1 Home Ave"
                +"\nActual Name/Email/CA: "
                        + textBoxPage.getName()+"/"+textBoxPage.getEmail()+"/"+textBoxPage.getCurrentAddress());
    }
}
