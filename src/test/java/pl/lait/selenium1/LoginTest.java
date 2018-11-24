package pl.lait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {
	WebDriver driver=null;
	@Before
	public void openPage() {
		driver=Init.getDriver();
	}
	
	@Test
	
	public void clickOnMenuItems() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("SIGN-ON")).click();
		
    	driver.findElement(By.name("userName")).sendKeys("adamdz");
    	driver.findElement(By.name("password")).sendKeys("qwe123");
    	driver.findElement(By.name("login")).submit();

	}
	@After
	
	public void close() {
		Init.endTest();
	}
	
	
		
	
}
