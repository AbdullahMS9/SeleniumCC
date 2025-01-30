package com.adabny.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static util.WaitUtility.explicitWaitUntilVisible;
import static util.WaitUtility.fluentWaitUntilVisible;

public class LoginPage extends BasePage {

    private By emailField= By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//main//button[@type='submit']");
    private By errorMessage = By.xpath("//div[text()='Invalid email or password']");
    private By usernameCard = By.xpath("//a[@id='username']");

    public void setEmail(String email){
        set(emailField, email);
    }
    public void setPassword(String password){
        set(passwordField, password);
    }
    public HomePage clickLoginButton(){
        click(loginButton);
        return new HomePage();
    }

    public HomePage logIntoApplication(String email, String password){
        setEmail(email);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){
        fluentWaitUntilVisible(30, errorMessage);
        return find(errorMessage).getText();
    }

}
