package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeDriverTest1 {
	@Test
	public void newTest1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http:\\google.com");//hit url on the browser
		System.out.println(driver.getTitle());//validate if your page title is correct
		System.out.println(driver.getCurrentUrl());//validate you are landed on correct url
		//System.out.println(driver.getPageSource());//print page source
		driver.get("http:\\yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();//it closes currrent browser
		//driver.quit();//it closes all the browsers opened by selenium script
		
		
		
		
	}
}
