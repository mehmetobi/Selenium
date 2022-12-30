package Weeks.Week03.Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_03 {
    public static void main(String[] args) {
        // Sibling-Child to Parent traverse
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")));
    }



}