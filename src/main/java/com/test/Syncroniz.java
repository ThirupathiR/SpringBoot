package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncroniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels");
driver.findElement(By.id("H-destination")).sendKeys("nyc");
driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);

driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
WebDriverWait d=new WebDriverWait(driver,20);
//d.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id=\'14789']/div[2]/div/a")));
		

	//driver.findElement(By.xpath(".//*[@id=\'14789']/div[2]/div/a")).click();


	}

}
