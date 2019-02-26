package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.dream11.com/tf/cricket/");
	int number=findFramenumber(driver,By.xpath("//*[@id=\'SignupForm\']/div[3]/p"));
	driver.switchTo().frame(number);
	driver.findElement(By.xpath("//*[@id=\\'SignupForm\\']/div[3]/p")).click();
	driver.switchTo().defaultContent();
	
}
	
	
	
public static int findFramenumber(WebDriver driver,By by)
{
	int i;
	
	int frameCount=driver.findElements(By.tagName("iframe")).size();
	
	
	for (i=0;i<frameCount;i++) {
		driver.switchTo().frame(i);
		int Count=driver.findElements(by).size();
		if(Count>0)
		{
		break;
	}
		else
		{
			System.out.println("Continue looping");	
}	
	
}
driver.switchTo().defaultContent();
return i;



}
}