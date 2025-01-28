package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static util.ActionsUtility.sendKeys;
import static util.GetUtility.getText;
import static util.JavaScriptUtilities.scrollToElementJS;
import static util.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{
    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult =By.xpath("//p[@id='currentAddress']");
    private By nameResult =By.xpath("//p[@id='name']");
    private By emailResult =By.xpath("//p[@id='email']");

    public String getCurrentAddress() {
        explicitWaitUntilVisible(5, currentAddressResult);
        return getText(currentAddressResult);
    }
    public String getName() {
        explicitWaitUntilVisible(5, nameResult);
        return getText(nameResult);
    }
    public String getEmail() {
        explicitWaitUntilVisible(5, emailResult);
        return getText(emailResult);
    }

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public void setCurrentAddress(String address) {
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void setFullName(String name) {
        //delay(1000);
        scrollToElementJS(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }

}
