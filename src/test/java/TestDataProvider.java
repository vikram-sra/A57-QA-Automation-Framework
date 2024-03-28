import org.testng.annotations.DataProvider;

public class TestDataProvider{

    @DataProvider(name="NegativeLoginTestData")
    public static Object[][] getDataFromDataProvider(){
        return new Object[][]{
                {"invalidEmail@class.com","invalid"},
                {"demo@class.com","invalid"},
                {"",""},
                {"invalidEmail@class.com","te$t$tudent"},
        };
    }

}
