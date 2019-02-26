package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
driver.get("http://facebook.com");//url in the browser
//tagName[@attribute='value']-xpath
/*driver.findElement(By.xpath("//*[@type='email']")).sendKeys("my own xpath");

driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
driver.findElement(By.xpath("//input[@value='Log In']")).click();*/

//tagName[attribute='vavue']-css syntax OR      tagName#id(if its id only it will work)
driver.findElement(By.cssSelector("*[name='email']")).sendKeys("my css");
driver.findElement(By.cssSelector("input#pass")).sendKeys("hello");

	}

}
