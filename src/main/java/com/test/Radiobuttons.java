package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
driver.get("http://www.echoecho.com/htmlforms10.htm");
//driver.findElement(By.xpath("//input[@value='Butter']")).click();
int Count =driver.findElements(By.xpath("//input[@name='group1']")).size();
for(int i=0;i<Count;i++)
{
	//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

	String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

	if(text.equals("Cheese"))
	{
		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
	}
}

}




	}


