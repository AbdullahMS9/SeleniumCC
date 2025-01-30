package com.adabny.pages;

import com.base.BasePage;
import com.adabny.pages.LoginPage;
import org.openqa.selenium.By;

import static util.JavaScriptUtilities.clickJS;
import static util.JavaScriptUtilities.scrollToElementJS;
import static util.WaitUtility.fluentWaitUntilVisible;

public class HomePage extends BasePage {
    private By logoutButton = By.xpath("//a[text()='Logout']");
    private By usernameCard = By.xpath("//a[@id='username']");

    private By poloBlueCard = By.xpath("//img[@src='/uploads/image-1722259007240.jpg']");
    //a[@href='/product/66a7961108b9b1d2071634b4']

    private By loginPageButton = By.xpath("//a[@href='/login']");

    public LoginPage goToLoginPage(){
        click(loginPageButton);
        return new LoginPage();
    }

    public String getLogOutButtonText(){
        fluentWaitUntilVisible(30, usernameCard);
        click(usernameCard);
        return find(logoutButton).getText();
    }

    public ProductPage goToProductPagePoloBlue(){
        fluentWaitUntilVisible(30, poloBlueCard);
        scrollToElementJS(poloBlueCard);
        clickJS(poloBlueCard);
        return new ProductPage();
    }

    public String getUsername(){
        return find(usernameCard).getText();
    }
}
