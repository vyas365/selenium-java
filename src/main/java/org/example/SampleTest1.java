package org.example;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest1 extends Main{
    @BeforeTest
    public void initialSetup() {
        setup();
    }
    @Test
    public void selectDropdown() {
        String expectedTitle = "Improve Customer Experience with Sales CRM | SugarCRM";
        initialCheck();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
