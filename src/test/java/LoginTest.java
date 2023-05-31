import Base.BaseTest;
import Pages.AccountPage;
import Pages.HomePage;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {


    @Test(description = "TC0001 PASS- Unsuccessful login scenario- Attempt to sign-in by not registered user")
    public void TC001(){
        HomePage homePage=new HomePage(driver);


        homePage.fillUsername(homePage.getGeneratedText());
        homePage.fillPassword(homePage.getGeneratedPassword());
        homePage.clickLogin();

        AccountPage accountPage=new AccountPage(driver);
        accountPage.checkText("Error!");
    }
//
//    @Test
//    public void TC002(){
//
//    }
//
//    @Test
//    public void TC003(){}



}
