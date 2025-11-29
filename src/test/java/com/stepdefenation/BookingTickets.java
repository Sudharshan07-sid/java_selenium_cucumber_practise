//package com.stepdefenation;
//
//import org.openqa.selenium.WebDriver;
//
//import com.Irctcpom.BookingTicketsPom;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class BookingTickets {
//	
//	private WebDriver driver;
//	private BookingTicketsPom bt;
//	
//	
//	public BookingTickets() {
//		
//		this.bt =new BookingTicketsPom();
//	}

//	@Given("user enter the website and scroll near to train name {string}")
//	public void user_enter_the_website_and_scroll_near_to_train_name(String string) {
//		
//		
//		bt.selectTrainName(string);
//	}
//
//	@Given("click on  refresh on the specific class")
//	public void click_on_refresh_on_the_specific_class() {
//		bt.clickonRefresh();
//	}
//
//	@Given("select the date of the train {string}")
//	public void select_the_date_of_the_train(String string) {
//		bt.trainDate(string);
//	    
//	}
//
//	@Then("click on book now")
//	public void click_on_book_now() {
//		bt.clickonBook();
//	}
//
//	@Then("select the yes in the popup")
//	public void select_the_yes_in_the_popup() {
//		bt.conformation();
//	}
//
//	@Then("close browser")
//	public void close_browser() {
//		bt.close();
//	}

//}
