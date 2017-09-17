package ru.antipov.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends BasePage {

    @FindBy(name = "identifier")
    WebElement login;


    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = ".//*[@id='identifierNext']/content/span")
    public WebElement nextBtn1;

    @FindBy(xpath = ".//*[@id='passwordNext']/content/span")
    public WebElement nextBtn2;


    public void fillLogin(String fieldName, String value) {
        switch (fieldName) {
            case "identifier":
                fillField(login, value);
                break;


            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }
    public void clickNext1(String itemName){
        nextBtn1.click();
    }
    public void fillPassword(String fieldName, String value) {
        switch (fieldName) {

            case "password":
                fillField(password, value);
                break;

            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }
    public void clickNext2(String itemName){
        nextBtn2.click();
    }
}
