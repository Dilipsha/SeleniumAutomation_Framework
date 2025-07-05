package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

	public static void takeScreenshot(WebDriver driver,String testName) {
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File folder = new File("screenshots");
	    if (!folder.exists()) {
	        folder.mkdir();
	    }
		String screenshotPath = "screenshots/" + testName + "_"+timestamp + ".png";
		
		try {
			FileUtils.copyFile(srcFile, new File(screenshotPath));
			  System.out.println("✅ Screenshot saved: " + screenshotPath);
        } catch (IOException e) {
            System.out.println("❌ Error saving screenshot: " + e.getMessage());
        }
	}
}
