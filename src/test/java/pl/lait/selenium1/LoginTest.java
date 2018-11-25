package pl.lait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // alfabetycznie wykonywane metody
public class LoginTest {
	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}

	@Test

	public void clickOnMenuItems() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click();

	}

	@Ignore

	@Test

	public void login() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("adamdz");
		driver.findElement(By.name("password")).sendKeys("qwe123");
		driver.findElement(By.name("login")).submit();

		String roundTrip = "html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]";
		String oneWay = "html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
//		String oneWay= "//actor[last()]";
		driver.findElement(By.xpath(roundTrip)).click();
		driver.findElement(By.xpath(oneWay)).click();
		Select pass_count = new Select(driver.findElement(By.name("passCount")));
		pass_count.selectByValue("2");
		Init.sleep(5000);
	}

	@After

	public void close() {
		Init.endTest();
	}

}
