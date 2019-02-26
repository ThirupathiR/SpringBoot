package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saesforceE2E {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
driver.get("http://rediff.com");
	driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hi");
	driver.findElement(By.cssSelector("input#password")).sendKeys("hello");
	
	driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
	

	
	
	
	
	}
	
	

}
