package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest {
    WebDriver driver=null;
    @Test
    public void test1(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Test1 execution1 " +Thread.currentThread().threadId());
    }
    @Test
    public void test2(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Test1 execution2 " +Thread.currentThread().threadId());
    }
    @AfterTest
            public void end(){
             driver.quit();
    }
}
