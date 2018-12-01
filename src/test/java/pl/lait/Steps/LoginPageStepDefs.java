package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pl.lait.pageObjects.LoginPage;
import pl.lait.pageObjects.ReservationPage;
import pl.lait.selenium1.Init;


public class LoginPageStepDefs {

	WebDriver driver = null;
	ReservationPage reservationPage = new ReservationPage();

	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
		driver = Init.getDriver();
	   
	}

	@When("^I fill the login form with login \"([^\"]*)\" and pass \"([^\"]*)\"$")
	public void i_fill_the_login_form_with_login_and_pass(String arg1, String arg2) throws Throwable {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs(arg1, arg2);
	}

	@Then("^I should see the flight reservation form$")
	public void i_should_see_the_flight_reservation_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
	@When("^I click one way button$")
	public void i_click_one_way_button() throws Throwable {
		reservationPage.oneWayRadioClick();
	}
	

	

	@When("^I choose \"([^\"]*)\" passenger$")
	public void i_choose_passenger(String arg1) throws Throwable {
		reservationPage.passengersCount(arg1);
	}

	@When("^I fly from \"([^\"]*)\"$")
	public void i_fly_from(String arg1) throws Throwable {
		reservationPage.fromPort(arg1);
	}

	@When("^I choose day \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_choose_day(String arg1, String arg2) throws Throwable {
		reservationPage.on(arg1, arg2);
	}

	@When("^I fly to \"([^\"]*)\"$")
	public void i_fly_to(String arg1) throws Throwable {
		reservationPage.toPort(arg1);
	}

	@When("^I fly bussines class$")
	public void i_fly_bussines_class() throws Throwable {
		reservationPage.businessClass();

	}

	@When("^I fly with \"([^\"]*)\"$")
	public void i_fly_with(String arg1) throws Throwable {
		reservationPage.airline(arg1);
	}

	@When("^I click button$")
	public void i_click_button() throws Throwable {
		reservationPage.continueBtnClick();
	}

	@Then("^I should see next page$")
	public void i_should_see_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
	
	
	
}


