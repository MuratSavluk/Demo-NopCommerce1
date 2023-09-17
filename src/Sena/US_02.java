package Sena;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_02 extends BaseDriver {

    @Test
    public void Test2() {
        driver.get("https://demo.nopcommerce.com/");

        WebElement login= driver.findElement(By.linkText("Log in"));
        login.click();


        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("t.thirtheen.techno@gmail.com");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("Techno13");

        WebElement loginButton= driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
        loginButton.click();

        WebElement myAccount1= driver.findElement(By.cssSelector("[class='ico-account']"));

        Assert.assertTrue(myAccount1.getText().equals("My account"),"login işlemi başarısız");


        BekleVeKapat();
    }

}
