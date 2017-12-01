package automationtestproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public String take(WebDriver webDriver, String fileName) throws IOException {
		File screenshotFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		String pathName = System.getProperty("user.dir") + File.separatorChar + fileName + ".jpg";
		FileUtils.copyFile(screenshotFile, new File(pathName));
		System.out.println("File saved at: " + pathName);
		
		return pathName;
	}
	

}