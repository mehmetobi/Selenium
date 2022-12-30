package Weeks.Week01.Sel_Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_introduction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/chromedriver_linux64/");
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();
    }
}
