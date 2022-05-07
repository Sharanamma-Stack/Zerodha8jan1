package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser4 {
	public static WebDriver openbrowser2(String url) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Zerodha8jan\\src\\main\\resources\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	
	}
}
