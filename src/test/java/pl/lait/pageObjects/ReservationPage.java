package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

public class ReservationPage {

	WebDriver driver;
	
	
	@FindBy(xpath="html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement oneWayRadio;
	
	@FindBy(xpath="html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")
	WebElement roundTripRadio;
	
	@FindBy(name="passCount")
	WebElement passCount;
	
	@FindBy(name="fromPort")
	WebElement fromPort;
	
	@FindBy(name="fromMonth")
	WebElement fromMonth;
	
	@FindBy(name="fromDay")
	WebElement fromDay;
	
	@FindBy(name="toPort")
	WebElement toPort;
	
	@FindBy(name="toMonth")
	WebElement toMonth;
	
	@FindBy(name="toDay")
	WebElement toDay;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement servClass;
	
	@FindBy(name="airline")
	WebElement airline;
	
	@FindBy(name="findFlights")
	WebElement findFlights;
	
	public ReservationPage() {
		driver =Init.getDriver();
		PageFactory.initElements(driver, this);
				
	}
	
	public void oneWayRadioClick() {
		oneWayRadio.click();
	}
	
	public void roundTripRadioClick() {
		roundTripRadio.click();
	}
	public void passengersCount(String count) {
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue(count);
	}
	
	public void selectFromPort(String port) {
		Select fromPortSelect=new Select(fromPort); 
			fromPortSelect.selectByValue(port);
	}
	
	public void selectFromMonth(String month) {
		Select fromMonthSelect=new Select(fromMonth);
		fromMonthSelect.selectByValue(month);
	}
	
	public void selectFromDay(String day) {
		Select fromDaySelect=new Select(fromDay);
		fromDaySelect.selectByValue(day);
	}
	
	public void selectToPort(String port) {
		Select toPortSelect=new Select(toPort); 
			toPortSelect.selectByValue(port);
	}

	public void selectToMonth(String month) {
		Select toMonthSelect=new Select(toMonth);
		toMonthSelect.selectByValue(month);
	}
	
	public void selectToDay(String day) {
		Select toDaySelect=new Select(toDay);
		toDaySelect.selectByValue(day);
	}
	
	public void serviceClass() {
		servClass.click();
	}
	
	public void selectAirline(String airLine) {
		Select airlineSelect=new Select(airline);
		airlineSelect.selectByValue(airLine);
	}
	
	public void 
	
	
}
