package pl.lait.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init {

	static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\LaitProject\\chromedriver.exe");
    	DesiredCapabilities capabilities= DesiredCapabilities.chrome();
    	driver=new ChromeDriver();
    	driver.get("http:///newtours.demoaut.com");
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		sleep(1000);
		return driver;
	}
	
	public static void endTest() {
		driver.quit();
	}
	
	
	public static void sleep(int mSeconds) {
		try {
			Thread.sleep(mSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
