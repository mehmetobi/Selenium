package Weeks.Week01.Sel_Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_driver {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "/home/ubuntu/Downloads/geckodriver.tar.gz/");
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
    }
}
