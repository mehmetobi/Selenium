package Weeks.Week03.Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='MAA']")).click();




    }
}
