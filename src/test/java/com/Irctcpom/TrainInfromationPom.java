package com.Irctcpom;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import utility.DriverSetup;

public class TrainInfromationPom {
	private WebDriver driver;
	By clickonfrom=By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]");
	By from=By.xpath("//span[contains(text(),\" HYDERABAD DECAN - HYB \")]");
	By clickonto=By.xpath("(//input[contains(@type,'text') and contains(@role,'searchbox')])[2]");
	By to=By.xpath("//*[@id=\"destination\"]/span/div");
	By selecttrainname=By.xpath("//strong[contains(text(),' GARIBRATH EXP (12735)')]");
	By refresh=By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[2]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td/div/div[2]");
	By date=By.xpath("//strong[contains(text(),'Wed, 07 Feb')]");
	By bookbutton=By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[2]/div[1]/app-train-avl-enq/div[2]/div/span/span[1]/button");
	By alertprompt=By.xpath("//*[@id=\"divMain\"]/div/app-train-list/p-confirmdialog[2]/div/div/div[3]/button[1]");
	public TrainInfromationPom() {
		this.driver=DriverSetup.getDriver();
		
	}
	
	public void open(String str) {
		driver.get(str);
		driver.manage().window().maximize();
	}

	public void from(String str) throws InterruptedException {
		System.out.println(str);
		WebElement text1=driver.findElement(clickonfrom);
		text1.click();
		text1.sendKeys(str);
		Thread.sleep(1000);
		WebElement place=driver.findElement(from);
		place.click();
	}
	
	public void to(String str) throws InterruptedException {
		WebElement text2=driver.findElement(clickonto);
		text2.click();
		text2.sendKeys("Anantapur");
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement tostation=wait.until(ExpectedConditions.elementToBeClickable(to));
		tostation.click();
		
	}
	
	public void date(String str) throws InterruptedException {
		String[] split=str.split(" ");
		String month=split[0];
		String year=split[1];
		WebElement calender=driver.findElement(By.xpath("//p-calendar[contains(@aria-label,'Enter Journey Date. Formate D.D./.M.M./.Y.Y.Y.Y. Input is Mandatory.')]"));
		calender.click();
		boolean z=true;
		while(z) {
			String currentmonth=driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/div/span[1]")).getText();
			String currentyear=driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/div/span[2]")).getText();
			if((currentmonth.equals(month)) && (currentyear.equals(year))){
				System.out.println(currentmonth);
				z=false;
				break;
			}
			else {
				
				driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]")).click();
			}
		}
		driver.findElement(By.xpath("//a[text()='7']")).click();
		
	}
	
	
	public void click() {
		driver.findElement(By.xpath("//button[@class=\"search_btn train_Search\"]")).click();
	}
	
	public void relevantDetails(String string) throws InterruptedException {
		if(driver.getPageSource().contains("Please submit correct input")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			System.out.println(driver.getTitle());
			Assert.assertEquals(string, driver.getTitle());
		}
		Thread.sleep(3000);
	}
	
	
	public void selectTrainName(String str) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement trainname=wait.until(ExpectedConditions.elementToBeClickable(selecttrainname));
		WebElement scrollto=(trainname);
		System.out.println(scrollto);
		js.executeScript("arguments[0].scrollIntoView();", scrollto);
	}
	
	public void clickonRefresh() throws InterruptedException {
		driver.findElement(refresh).click();
		Thread.sleep(3000);
	}
	
	public void trainDate(String str) {
		driver.findElement(date).click();
		
	}
	public void clickonBook() throws InterruptedException {
		driver.findElement(bookbutton).click();
		Thread.sleep(3000);
	}
	public void conformation() throws InterruptedException {
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement alertclick=wait.until(ExpectedConditions.elementToBeClickable(alertprompt));
		alertclick.click();
	}
	public void close() {
		driver.close();
	}





	
	
	

}
