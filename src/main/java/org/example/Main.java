package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static WebDriver driver;
    public static void main(String[] args) {

        driver = new EdgeDriver();
        driver.get("https://www.google.com");
    }
}