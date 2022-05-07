package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
	public static void scrshot(WebDriver driver,String filename ) throws IOException {
		TakesScreenshot  screenshot=(TakesScreenshot)driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("C:\\Users\\Admin\\eclipse-workspace\\Zerodha8jan\\screenshots"+filename+".png");
		File destination=new File(path);
		FileHandler.copy(source, destination);
	}

	

	
	
}
