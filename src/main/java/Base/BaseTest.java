package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver;


    @BeforeTest
    public void setUp() {
/*      String browser = System.getProperty("browser");
        String osName = System.getProperty("os.name");

        if (browser == null) {
            browser = "Chrome";
        }
        System.out.println(osName);
        System.out.println(browser);*/
        System.setProperty("Webdriver.geck.driver","drivers/geckdriver");
//      ChromeOptions co=new ChromeOptions();
//      co.addArguments("--remote-allow-origins=*");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");


//        if (browser=="Chrome"){
//            if(osName.equals("Mac OS X")){
//                System.setProperty("Webdriver.chrome.drive","drivers/chromedrive");
//                ChromeOptions co=new ChromeOptions();
//                co.addArguments("--remote-allow-origins=*");
//                driver=new ChromeDriver();
//            }
//            else{
//                System.setProperty("Webdriver.chrome.driver..exe","drivers/chromedriver");
//                ChromeOptions co=new ChromeOptions();
//                co.addArguments("--remote-allow-origins=*");
//                driver=new ChromeDriver(co);
//            }
//               }
//        else {
//            if (osName.equals("Windows 11")){
//            System.setProperty("Webdriver.geck.driver","drivers/geckdriver");
//             } else {
//            System.setProperty("Webdriver.gecko.driver","drivers/geckodriver");
//           }
//               driver=new FirefoxDriver();
//
//        }
//
//        driver.manage().window().maximize();
//        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
   @AfterTest
    public void after(){

        driver.quit();
    }


}
