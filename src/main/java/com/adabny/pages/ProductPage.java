package com.adabny.pages;

import com.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static util.DropDownUtility.*;
import static util.ActionsUtility.sendKeys;
import static util.JavaScriptUtilities.clickJS;
import static util.JavaScriptUtilities.scrollToElementJS;
import static util.WaitUtility.fluentWaitUntilVisible;

public class ProductPage extends BasePage {

    private By productName = By.xpath("//div[@class='list-group-item']/h3");
    private By priceVal = By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[1]/div/div[2]/strong/text()[2]");

    private By vial3mL = By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[3]/div[2]/div/div/div[1]");
    private By vial5mLClear = By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[3]/div[2]/div/div/div[2]");
    private By vial5mL = By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[3]/div[2]/div/div/div[3]");
    private By vial8mL = By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[3]/div[2]/div/div/div[4]");
    private By vial10mL = By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[3]/div[2]/div/div/div[5]");

    private By qtyVal = By.tagName("Select");
    //private Select qtySelect = new Select(find(qtyVal));
    private By addToCartButton =  By.xpath("//button[text()='Add to Cart']");

    private By rating = By.xpath("//*[@id=\"rating\"]");
    //private Select ratingSelect = new Select(find(rating));
    private By commentBox = By.tagName("textarea");
    private By submitReviewButton = By.xpath("//main//form/button");

    private By alertCard = By.xpath("//div[@role='alert']/div[2]");
    //private By reviewSuccessAlert = By.xpath("//div[text()='Review successfully submitted']");
    //private By alreadyReviewedAlert = By.xpath("//div[text()='Product already reviewed']");
    //private String emptyCommentAlert = "Product validation failed: reviews.1.comment: Path `comment` is required";

    //methods
    public String getProductName(){
        fluentWaitUntilVisible(9, productName);
        return find(productName).getText();
    }

    public String getPrice(){
        return find(priceVal).getText();
    }

    public void clickVial(int mL){
        if(mL == 3){
            click(vial3mL);
        } else if(mL == 8){
            click(vial8mL);
        } else if(mL == 10){
            click(vial10mL);
        } else if(mL == 5){
            click(vial5mL);
        } else { //chose anything else for clear bottle
            click(vial5mLClear);
        }
    }

    public void selectQty(int quantity){
        //qtySelect.selectByIndex(quantity);
        selectByIndex(qtyVal, quantity);
    }

    public void addToCart(){
        click(addToCartButton);
    }

    public void selectRating(int ratingVal){
        //ratingSelect.selectByIndex(rating);
        selectByIndex(this.rating, ratingVal);
    }

    public void writeComment(String comment){
        scrollToElementJS(commentBox);
        sendKeys(find(commentBox), comment);
    }

    public void submitReview(){
        fluentWaitUntilVisible(9, submitReviewButton);
        scrollToElementJS(submitReviewButton);
        clickJS(submitReviewButton);
    }

    public String getAlertText(){
        fluentWaitUntilVisible(9, alertCard);
        return find(alertCard).getText();
    }


}
