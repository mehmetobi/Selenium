package Weeks.Week01.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("mehmetobi");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("123456");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
