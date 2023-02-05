package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
    public static WebDriver driver= null;
    @BeforeSuite
    public void launchBrowser(){
        driver = new ChromeDriver();
    }

    @DataProvider(name = "dataProvide")
    public Object[][] dataSet() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}
        };
    }

    @Test(dataProvider = "dataProvide", enabled = false)
    public void multipleLoginTest(String username, String password) {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    public void login() {
        driver.get("https://www.google.com");
        Assert.assertTrue(false);
    }

    @AfterTest
    public void cleanup() {
        driver.quit();
    }
}


