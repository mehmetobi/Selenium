package Weeks.Week03.Exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();





    }

}
