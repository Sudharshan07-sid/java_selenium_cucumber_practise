package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverSetup {
	private static WebDriver driver;
	
	public  static WebDriver  getDriver() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 
		return driver=new ChromeDriver(options);
	}

}
