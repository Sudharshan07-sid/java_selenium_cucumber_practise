package com.stepdefenation;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import com.Irctcpom.TrainInfromationPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utility.DriverSetup;
public class TrainInfromation {
	
	private WebDriver driver;
	private TrainInfromationPom tf;
	
	public TrainInfromation() {
//		this.driver=DriverSetup.getDriver();
//		if(this.driver==null) {
//			System.out.println("webdriver is null");
//		}
		this. tf=new TrainInfromationPom();
		
		if(this.tf==null) {
			System.out.println("traininfromation is null");
		}
	}
	@Given("User Launch browser")
	public void user_launch_browser() {
		
			
	}	
	@Given("Open URL {string}")
	public void open_url(String string) {
		tf.open(string);
	}	
	@When("the user select the train boarding station as {string}")
	public void the_user_select_the_train_boarding_station_as(String string) throws InterruptedException {
		
		tf.from(string);
	}

	@When("the user enter the departure station as {string}")
	public void the_user_enter_the_departure_station_as(String string) throws InterruptedException {
		
		tf.to(string);
	}

	@When("the user select the travel date as {string}")
	public void the_user_select_the_travel_date_as(String string) throws InterruptedException {
		tf.date(string);
	}
	@When("user click on the search button")
	public void user_click_on_the_search_button() {
		tf.click();
	}

	@Then("the system should display relevant travel details {string}")
	public void the_system_should_display_relevant_travel_details(String string) throws InterruptedException {
		
		tf.relevantDetails(string);
	    
	}
	@Then("user enter the website and scroll near to train name {string}")
	public void user_enter_the_website_and_scroll_near_to_train_name(String string) {
		
		
		tf.selectTrainName(string);
	}

	@Then("click on  refresh on the specific class")
	public void click_on_refresh_on_the_specific_class() throws InterruptedException {
		tf.clickonRefresh();
	}

	@Then("select the date of the train {string}")
	public void select_the_date_of_the_train(String string) {
		tf.trainDate(string);
	    
	}

	@Then("click on book now")
	public void click_on_book_now() throws InterruptedException {
		tf.clickonBook();
	}

	@Then("select the yes in the popup")
	public void select_the_yes_in_the_popup() throws InterruptedException {
		tf.conformation();
	}

	@Then("close browser")
	public void close_browser() {
		tf.close();
	}

	
	
	

}
