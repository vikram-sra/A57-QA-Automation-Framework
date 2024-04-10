import org.testng.annotations.Test;
import pom.AllSongsPage;
import pom.LoginPage;

public class AllSongsTest extends BaseTest{

    @Test
    public void createNewPlaylist(){
        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);
        loginPage.login();

    }

}