package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {

  @Test
  public void newTest1() {

	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http:\\google.com");
	 System.out.println(driver.getTitle());
	 //for internet Explorer code
// System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Drivers\\MicrosoftwebDriver.exe");
//	 WebDriver driver = new InternetExplorer Driver();
//	 driver.get("http:\\google.com");
	// System.out.println(driver.getTitle());
  }
}
