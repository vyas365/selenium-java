package common;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.helpers;

import java.io.IOException;

public class Listeners extends helpers implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("Test Started");
    }
    public void onTestFailure(ITestResult result) {
       System.out.println("Test Failed");
       try {
           getScreenshot();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}
