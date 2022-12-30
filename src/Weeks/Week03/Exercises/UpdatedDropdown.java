package Weeks.Week03.Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdatedDropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        int i = 1;
        while (i < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


    }
}
