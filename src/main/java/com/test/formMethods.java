package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //is displayed is used with particular object is in code base but it is in visible mode or not
driver.get("https://www.makemytrip.com/");
System.out.println("Before clicking on Multi city Radio button");
System.out.println(driver.findElement(By.xpath(".//*[@id=\'hp-widget__return\']")).isDisplayed());

driver.findElement(By.xpath(".//*[@id=\'multicity\']/label")).click();
System.out.println("After clicking on multi city Radio button");

System.out.println(driver.findElement(By.xpath(".//*[@id=\'hp-widget__return\']")).isDisplayed());
Thread.sleep(3000L);
System.out.println(driver.findElement(By.xpath(".//*[@id=\'fd-wrap']/div[2]/h2")).getText());

//if you want to validate object which is present in web page or code base
int Count=driver.findElements(By.xpath(".//*[@id=\'multicity\']/label")).size();
if (Count==0){
}
System.out.println("verified");

	}
	

}

