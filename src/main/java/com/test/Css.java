package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
driver.get("https://www.salesforce.com/");

driver.findElement(By.cssSelector("[class='identity first']")).sendKeys("hello");
driver.findElement(By.cssSelector("[input[id='password']")).sendKeys("jkh");

driver.findElement(By.xpath("//button[@id='Login']")).click();

driver.findElement(By.cssSelector("#Login"));
//1.verify before running script
//2.css customized xpath
//3.#idname
//4 .classname
//5 find the unique attribute


	}

			
	}


