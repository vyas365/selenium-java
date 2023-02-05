package org.example;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
public class Main {
    WebDriver driver;
    ChromeOptions options = new ChromeOptions().addArguments("--headless","--disable-gpu","--no-sandbox","--window-size=1280,800");
    HomePage homePage;

    public void setup() {
        driver = new ChromeDriver(options);
        driver.get("https://www.sugarcrm.com/cx/preferred-sales-crm/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void initialCheck() {
        homePage = new HomePage(driver);
        homePage.setRejectCookies();
        homePage.selectDropDown();
    }
}