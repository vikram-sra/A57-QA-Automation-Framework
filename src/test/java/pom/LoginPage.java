package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.FormSubmitEvent;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver givenDriver){
        super(givenDriver);
    }

    //Locator for Login Page Web Elements
    By emailField = By.cssSelector("input[type='email']");
    By passwordField = By.cssSelector("input[type='password']");
    By submitBtn = By.cssSelector("button[type='submit']");

    //______________//
    // PAGE Factory //
    //______________//

    @FindBy(css = "input[type='email']")
    WebElement emailFieldLocator;

    @FindBy(css = "input[type='password']")
    WebElement passwordFieldLocator;
    @FindBy(css = "button[type='submit']")
    WebElement submitBtnLocator;

    //Methods
    public void provideEmail(String email){
        findElement(emailField).sendKeys(email);
    }

    public void providePassword(String password){
        findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit(){
        findElement(submitBtn).click();
    }

    public void login(){
        provideEmail("vikramjit@testpro.io");
        providePassword("Vv3ZKxcI");
        clickSubmit();
    }

    //Methods using Page Factory Elemets
    public LoginPage clickSubmitBtn(){
        submitBtnLocator.click();
        return this;
    }

    public LoginPage provideEmailToLogin(String email){
        emailFieldLocator.clear();
        emailFieldLocator.sendKeys(email);
        return this;
    }

    public LoginPage providePasswordToLogin(String password){
        passwordFieldLocator.clear();
        passwordFieldLocator.sendKeys(password);
        return this;
    }

}
