package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    //Constructer
    public HomePage(WebDriver giveDriver){
        super(giveDriver);
    }

    //Locators
    By userAvatarIcon = By.cssSelector("img.avatar");

    //Methods
    public WebElement getUserAvatar(){
        return findElement(userAvatarIcon);
    }

}
