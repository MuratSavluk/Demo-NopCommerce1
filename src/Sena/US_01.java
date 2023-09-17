package Sena;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_01 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demo.nopcommerce.com/");

        WebElement register = driver.findElement(By.cssSelector("[class='ico-register']"));
        register.click();

        wait.until(ExpectedConditions.urlContains("register"));

        WebElement gender = driver.findElement(By.id("gender-female"));
        gender.click();

        WebElement first_name= driver.findElement(By.id("FirstName"));
        first_name.sendKeys("Team thirteen");

        WebElement second_name= driver.findElement(By.id("LastName"));
        second_name.sendKeys("TechnoStudy");



       WebElement dayWebMenu=driver.findElement(By.name("DateOfBirthDay"));
        Select dayMenu= new Select(dayWebMenu);
        dayMenu.selectByValue("5");

        WebElement monthWebMenu= driver.findElement(By.name("DateOfBirthMonth"));
        Select monthMenu= new Select(monthWebMenu);
        monthMenu.selectByVisibleText("May");

        WebElement yearWebMenu= driver.findElement(By.name("DateOfBirthYear"));
        Select yearMenu= new Select(yearWebMenu);
        yearMenu.selectByVisibleText("2005");



        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("t.thirtheen.techno1@gmail.com");

        WebElement company= driver.findElement(By.cssSelector("[for='Company']+input"));
        company.sendKeys("Team-13 Company");

        //WebElement newsletter= driver.findElement(By.xpath("//span[@data-valmsg-for='Newsletter']/../input"));


        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("Techno13");

        WebElement confirm_password= driver.findElement(By.id("ConfirmPassword"));
        confirm_password.sendKeys("Techno13");

        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click(); // visibilityOfTheElement
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='result']")));

        WebElement cont= driver.findElement(By.linkText("CONTINUE"));
        cont.click();
        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/"));

        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"),"Ana sayfaya yönlendirilmedi register başarısız");



        BekleVeKapat();






    }


}
