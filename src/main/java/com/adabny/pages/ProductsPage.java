package com.adabny.pages;

import org.openqa.selenium.By;

import static util.JavaScriptUtilities.scrollToElementJS;
import static util.WaitUtility.fluentWaitUntilVisible;

public class ProductsPage extends HomePage{

    private By logoutButton = By.xpath("//a[text()='Logout']");
    private By usernameCard = By.xpath("//a[@id='username']");

    public String getLogOutButtonText(){
        fluentWaitUntilVisible(30, usernameCard);
        scrollToElementJS(usernameCard);
        click(usernameCard);
        return find(logoutButton).getText();
    }

    public String getUsername(){
        return find(usernameCard).getText();
    }
}
