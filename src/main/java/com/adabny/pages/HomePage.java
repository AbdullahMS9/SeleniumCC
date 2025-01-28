package com.adabny.pages;

import com.base.BasePage;
import com.adabny.pages.LoginPage;
import org.openqa.selenium.By;

import static util.JavaScriptUtilities.scrollToElementJS;

public class HomePage extends BasePage {
    private By loginPageButton = By.xpath("//a[@href='/login']");

    public LoginPage goToLoginPage(){
        scrollToElementJS(loginPageButton);
        click(loginPageButton);
        return new LoginPage();
    }
}
