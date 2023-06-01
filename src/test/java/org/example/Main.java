package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://duotify.us-east-2.elasticbeanstalk.com/register.php");

        String expected1 = "Welcome to Duotify!";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expected1);

        driver.findElement(By.id("hideLogin")).click();

        driver.findElement(By.id("username")).sendKeys("mu"+Math.random()*10);
        Thread.sleep(500);
        driver.findElement(By.id("firstName")).sendKeys("mu"+Math.random()*10);
        Thread.sleep(500);
        driver.findElement(By.id("lastName")).sendKeys("to"+Math.random()*10);
        Thread.sleep(500);
        driver.findElement(By.id("email")).sendKeys("mu"+Math.random()*10+"@gmail.com");
         Thread.sleep(500);
         driver.findElement(By.id("email2")).sendKeys("muzzszd@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("mu"+Math.random()*10+"123");
        Thread.sleep(500);
        driver.findElement(By.id("password2")).sendKeys("muzzszd123");

        Thread.sleep(500);
//        driver.findElement(By.tagName("button")).click();
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.name("registerButton")).click();


        String expected = "http://duotify.us-east-2.elasticbeanstalk.com/browse.php?";
          Thread.sleep(500);
          String actualUrl = driver.getCurrentUrl();
          Thread.sleep(500);
          Assert.assertEquals(actualUrl,expected);


//        Thread.sleep(1000);
//          driver.navigate().back();

        String expected2 = "nameFirstAndLast";
        Thread.sleep(500);
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(expected2));


         Thread.sleep(500);
        driver.findElement(By.id("nameFirstAndLast")).click();

        Thread.sleep(500);
        driver.findElement(By.id("rafael")).click();


        Thread.sleep(500);
        String expected3 = "http://duotify.us-east-2.elasticbeanstalk.com/register.php";
          Thread.sleep(500);
          String actuaLUrl = driver.getCurrentUrl();
          Thread.sleep(500);
          Assert.assertEquals(actuaLUrl,expected3);


        Thread.sleep(500);
        driver.findElement(By.id("loginUsername")).sendKeys("muzzzd@gmail.com");

        Thread.sleep(500);
        driver.findElement(By.id("loginPassword")).sendKeys("muzzzd123");

        Thread.sleep(500);
        driver.findElement(By.tagName("button")).click();


        String expected4 = "You Might Also Like";
        Thread.sleep(500);
        String pageSourced = driver.getPageSource();
        Assert.assertTrue(pageSourced.contains(expected4));


        Thread.sleep(500);
        driver.findElement(By.id("rafael")).click();


        Thread.sleep(500);
        String expected5 = "http://duotify.us-east-2.elasticbeanstalk.com/register.php";
          Thread.sleep(500);
          String actuaLUrld = driver.getCurrentUrl();
          Thread.sleep(500);
          Assert.assertEquals(actuaLUrld,expected5);





    }
}