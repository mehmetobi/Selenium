package Weeks.Week01.Sel_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));




        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("mehmet");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mehmet");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("obi@gmail");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("obi@gmail");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("5553332211");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        driver.findElement(By.className("go-to-login-btn")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        // driver.findElement(By.className("submit")).click();
        driver.findElement(By.xpath("//button[@class,'submit')]")).click();

        // driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();



    }
}
