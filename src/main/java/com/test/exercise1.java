package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		 //count of the links in the entire page
		 System.out.println("Links in the page");
		 System.out.println(driver.findElements(By.tagName("a")).size());
		 //count of the links in the footer section of the page
		WebElement footer=driver.findElement(By.xpath("//*[@id=\'hlGlobalFooter\']"));
		 System.out.println("Links in the footer section page");
		 System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col= driver.findElement(By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[2]/ul"));
		System.out.println("Link in the 2nd column of the section");;
		
		 System.out.println(col.findElements(By.tagName("a")).size());
		 String Beforeclicking = null;
		 String Afterclicking;
		
		 for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
		 {

		 
		//System.out.println( col.findElements(By.tagName("a")).get(i).getText());
		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			 Beforeclicking = driver.getTitle();
		col.findElements(By.tagName("a")).get(i).click();
		break;
		
			
		
	}
		 Afterclicking = driver.getTitle();
		 if(Beforeclicking!=Afterclicking)
		 {
if(driver.getPageSource().contains("Site map"));
			
		System.out.println("PASS");
	}
		 else
		 {
			 System.out.println("FAIL"); 
		 }
	}
}
}
