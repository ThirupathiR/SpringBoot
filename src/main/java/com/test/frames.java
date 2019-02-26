package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://jqueryui.com/droppable/");
		 
		 
		 
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		 driver.findElement(By.id("draggable")).click();
		 Actions a=new Actions(driver);
		 WebElement Source=driver.findElement(By.id("draggable"));
		 WebElement target=driver.findElement(By.id("droppable"));
		 
		 a.dragAndDrop(Source, target).build().perform();
		 
		 
		 
		 
	}

}
