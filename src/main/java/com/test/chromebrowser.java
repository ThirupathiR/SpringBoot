package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromebrowser {
//static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
driver.get("http://facebook.com");//url in the browser
//driver.findElement(By.className("inputtext")).sendKeys("hi");
/*driver.findElement(By.id("email")).sendKeys("this is my first code");
driver.findElement(By.id("pass")).sendKeys("123456");

driver.findElement(By.linkText("Forgot account?")).click();*/
driver.findElement(By.cssSelector("#email")).sendKeys("emailadress");

driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
driver.findElement(By.xpath("//*[@id=\'login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	


	}

}
