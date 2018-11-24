package pl.lait.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App 
	
{
	static WebDriver driver;
	
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\LaitProject\\chromedriver.exe");
//    	DesiredCapabilities capabilities= DesiredCapabilities.chrome();
    	driver=new ChromeDriver();
    	driver.get("http:///newtours.demoaut.com");
    	
    	String pageTitle=driver.getTitle();
    	System.out.println(pageTitle);
    	WebElement signOn = driver.findElement(By.linkText("SIGN-ON"));
    	signOn.click();
    	driver.findElement(By.name("userName")).sendKeys("adamdz");
    	driver.findElement(By.name("password")).sendKeys("qwe123");
    	driver.findElement(By.name("login")).submit();

    	
    	
    	
//    	driver.close();
    }
}
