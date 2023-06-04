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
        int num =(int)( Math.random()*10000);
        int num2 =(int)( Math.random()*10000);
        int num3 =(int)( Math.random()*10000);


        driver.findElement(By.id("username")).sendKeys("mu"+num);
        driver.findElement(By.id("firstName")).sendKeys("mu"+num);
        driver.findElement(By.id("lastName")).sendKeys("to"+num);
        driver.findElement(By.id("email")).sendKeys("mu"+num2+"@gmail.com");
        driver.findElement(By.id("email2")).sendKeys("mu"+num2+"@gmail.com");
        driver.findElement(By.id("password")).sendKeys("mu"+num3+"123");
        driver.findElement(By.id("password2")).sendKeys("mu"+num3+"123");


//        driver.findElement(By.tagName("button")).click();
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.name("registerButton")).click();


        String expected = "http://duotify.us-east-2.elasticbeanstalk.com/browse.php?";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expected);



//          driver.navigate().back();

        String expected2 = "nameFirstAndLast";
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(expected2));


        driver.findElement(By.id("nameFirstAndLast")).click();
        Thread.sleep(500);
        driver.findElement(By.id("rafael")).click();


        Thread.sleep(500);
        String expected3 = "http://duotify.us-east-2.elasticbeanstalk.com/register.php";
        String actuaLUrl = driver.getCurrentUrl();
        Thread.sleep(500);
        Assert.assertEquals(actuaLUrl,expected3);



        driver.findElement(By.id("loginUsername")).sendKeys("mu"+num);
        driver.findElement(By.id("loginPassword")).sendKeys("mu"+num3+"123");
        Thread.sleep(500);
        driver.findElement(By.tagName("button")).click();

         Thread.sleep(500);
        String expected4 = "You Might Also Like";
        String pageSourced = driver.getPageSource();
        Assert.assertTrue(pageSourced.contains(expected4));

        driver.findElement(By.id("nameFirstAndLast")).click();


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