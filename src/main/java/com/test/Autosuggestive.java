package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//enter tje letter BENG
//verify if Airport option is displayed in the Suggestive box

public class Autosuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("BENG");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.xpath("//*[@id='fromPlaceName']")).getText());
		
		//java script Dom can extract hidden elements
		//because selenium can not identify hideeen elements.(Ajax implementation)
		//investigate the properties of object if have any hidden text
		//javascript Executor
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String)js.executeScript(script);
		System.out.println(text);
		//BENGULURU INTERNATION AIPORT
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
			

			{
			driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			
	}

}
}