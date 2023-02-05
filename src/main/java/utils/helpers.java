package utils;

import org.example.DataProvide;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.util.Date;

public class helpers extends DataProvide {

    public void getScreenshot() throws IOException {
        Date currentDate = new Date();
        String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+ screenshotFileName + ".png"));

    }
}
