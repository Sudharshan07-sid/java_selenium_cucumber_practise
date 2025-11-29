//package com.Irctcpom;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import utility.DriverSetup;
//
//
//
//
//
//
//
//public class BookingTicketsPom {
//	
//	
//	private WebDriver driver;
//	
//	public BookingTicketsPom() {
//		this.driver=DriverSetup.getDriver();
//	}
//	
//	By selecttrainname=By.xpath("//strong[contains(text(),' GARIBRATH EXP (12735)')]");
//	By refresh=By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[2]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td/div/div[2]");
//	By date=By.xpath("//strong[contains(text(),'Wed, 07 Feb')]");
//	By bookbutton=By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[2]/div[1]/app-train-avl-enq/div[2]/div/span/span[1]/button");
//	
//	public void selectTrainName(String str) {
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		WebElement scrollto=driver.findElement(selecttrainname);
//		System.out.println(scrollto);
//		js.executeScript("argument[0].scrollIntoView();", scrollto);
//	}
//	
//	public void clickonRefresh() {
//		driver.findElement(refresh).click();
//	}
//	
//	public void trainDate(String str) {
//		driver.findElement(date).click();
//		
//	}
//	public void clickonBook() {
//		driver.findElement(bookbutton);
//	}
//	public void conformation() {
//		
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert);
//		alert.accept();
//	}
//	public void close() {
//		driver.close();
//	}
//}
