package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static util.JavaScriptUtilities.*;

public class PracticeFormPage extends FormsPage{

    private By femaleRadioButton = By.id("gender-radio-2");
    private By submitButton = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSubmitButton(){
        click(submitButton);
    }
}
