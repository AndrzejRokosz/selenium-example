package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium1.Init;

public class LoginPage {

	// tutaj klikamy po stronie
	WebDriver driver;
	// przyciski na gorze klasy
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;

	@FindBy(name = "userName")
	WebElement loginInput;

	@FindBy(name = "password")
	WebElement passInput;

	@FindBy(name = "login")
	WebElement loginBtn;

	public LoginPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void goToLoginPage() {
		signOnLink.click();
	}

	/**
	 * 
	 * loguje sie jako uzytkownik z danymi przekazanymi w parametrach
	 * 
	 * @param login
	 * @param pass
	 */
	public void loginAs(String login, String pass) {
		loginInput.sendKeys(login);
		passInput.sendKeys(pass);
		loginBtn.click();
	}

}
