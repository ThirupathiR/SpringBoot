package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
driver.get("http://spicejet.com/");
Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
s.selectByValue("2");
s.selectByIndex(6);
//s.selectByVisibleText("5 Adults");

//departure and arrivals
driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='GOI']")).click();

driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();

//check box code
driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());


	}

}
