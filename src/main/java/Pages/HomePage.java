package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Variables {
    public WebDriver driver;




    public  HomePage(WebDriver driver){

        this.driver=driver;}

    @Step("Fill the Username by generated text on this method")
    public HomePage fillUsername(String text){
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys(text);
        return this;
    }

    @Step("Fill the Password by generated text on  this method")
    public HomePage fillPassword(String password){
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys(password);
        return this;
    }
    @Step("Click on the login button by this method")
    public HomePage clickLogin(){
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        return this;
    }


}
