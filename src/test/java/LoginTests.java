import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginValidEmailPassword() throws InterruptedException {
        //navigateToPage();
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickLoginBtn();
        Thread.sleep(6000); // Sleep or pause for 2 seconds (adjust as needed)
        WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar']"));
        // Expected Result
        Assert.assertTrue(avatarIcon.isDisplayed());
    }

   /* @Test
    public void loginInvalidEmailValidPassword() throws InterruptedException {
        //navigateToPage();
        provideEmail("demo@class.com");
        providePassword("invalid");
        clickLoginBtn();
        Thread.sleep(2000); // Sleep or pause for 2 seconds (adjust as needed)
        // Expected Result
        String url = "//https://qa.koel.app/";
        Assert.assertEquals(driver.getCurrentUrl(), url); // https://qa.koel.app/
    }*/

    /*@Test
    public void loginValidEmailEmptyPassword() throws InterruptedException {
        //steps
        //navigateToPage();
        provideEmail("demo@class.com");
        providePassword("");
        clickLoginBtn();
        Thread.sleep(2000); // Sleep or pause for 2 seconds (adjust as needed)
        // Expected Result
        String url = "//https://qa.koel.app/";
        Assert.assertEquals(driver.getCurrentUrl(), url);
        System.out.println("Just Testing console");
    }*/


    //@Test(dataProvider = "NegativeLoginTestData", dataProviderClass = TestDataProvider.class)
    public void negativeLoginTest(String email, String password) throws InterruptedException {
        //steps
        //navigateToPage();
        provideEmail(email);
        providePassword(password);
        clickLoginBtn();
        Thread.sleep(2000); // Sleep or pause for 2 seconds (adjust as needed)
        // Expected Result
        String expectedUrl = "//https://qa.koel.app/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        System.out.println("Just Testing console");
    }

}