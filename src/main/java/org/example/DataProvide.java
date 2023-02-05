package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
    WebDriver driver = null;
        @DataProvider(name = "dataProvide")
        public Object [][] dataSet() {
            return new Object[][]{
                    {"standard_user","secret_sauce"},
                    {"locked_out_user","secret_sauce"},
                    {"problem_user","secret_sauce"},
                    {"performance_glitch_user", "secret_sauce"}
            };
        }
        @Test(dataProvider = "dataProvide")
        public void multipleLoginTest(String username, String password){
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("login-button")).click();
            driver.close();
        }
    }


