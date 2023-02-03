package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    WebDriver driver;
    By cookies = By.id("CybotCookiebotDialogBodyLevelButtonCustomize");
    By rejectCookies = By.id("CybotCookiebotDialogBodyButtonDecline");

    By dropDown = By.cssSelector("#field26 > div > select");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void setRejectCookies(){
        driver.findElement(cookies).click();
        driver.findElement(rejectCookies).click();
    }
    public void selectDropDown(){
        Select selectDropDown = new Select(driver.findElement(dropDown));
        selectDropDown.selectByIndex(5);
    }
}
