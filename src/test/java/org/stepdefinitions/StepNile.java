package org.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.pages.*;

public class StepNile extends NileAir {
	NileAir n;
	@Given("User on nile airline home page")
	public void user_on_nile_airline_home_page() throws Throwable {
		browserLanuch("chrome");
	    urlLaunch("https://www.nileair.com/#/en/home");
		time(10);
		n=new NileAir();
		jsClick(n.getCookies());
		
	}

	@When("To check the click flight tickets booking")
	public void to_check_the_click_flight_tickets_booking() throws Throwable {
		n=new NileAir();
		jsTrue(n.getOneWay());
		clickTar(n.getOneWay());
		Thread.sleep(3000);
	}

	@When("To check the select a region from and to")
	public void to_check_the_select_a_region_from_and_to() throws Throwable  {
		
		n=new NileAir();
		jsClick(n.getFrom());
	    jsClick(n.getFromRegion());
	    Thread.sleep(3000);
		jsClick(n.getTo());
		jsClick(n.getToArrow());
		jsClick(n.getToELQ());
	}

	@When("To check a date {string}")
	public void to_check_a_date(String date) throws Throwable {
		n=new NileAir();
		jsClick(n.getDepart());
		clearE(n.getDepart());
		sendKeys(n.getDepart(), date);
//		jsSendkeys(date, n.getDepart());
		System.out.println(getAttribute(n.getDepart()));
	}
	@When("To check the adult child and infant and click search")
	public void to_check_the_adult_child_and_infant_and_click_search() throws Throwable {
		n=new NileAir();
		jsClick(n.getAdults());
		selectByIndex(n.getAdults(), 4);
		jsClick(n.getSubmit());
	}
	
	@When("To check Covid alert box and accept")
	public void to_check_Covid_alert_box_and_accept() throws Throwable  {
		n=new NileAir();
		jsClick(n.getAgree());
		jsClick(n.getAccept());
		Thread.sleep(3000);
	}

	@Then("Open flex pricer availability")
	public void open_flex_pricer_availability()  throws Throwable {
		Assert.assertFalse("EMBEDDED_TRANSACTION=FlexPricerAvailability", driver.getCurrentUrl().contentEquals("book.nileair.com"));
		System.out.println("FlexPricerAvailability");
	}

}



//WebDriverWait w = new WebDriverWait(driver, 10);
//w.until(ExpectedConditions.urlContains("EMBEDDED_TRANSACTION=FlexPricerAvailability"));