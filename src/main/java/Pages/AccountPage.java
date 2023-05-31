package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends Variables{
    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver=driver;
    }
    public AccountPage checkText(String text){

        String actualText= driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1")).getText();
        Assert.assertEquals(text,actualText);
        return this;
    }

}
