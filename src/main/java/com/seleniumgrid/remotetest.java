package com.seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remotetest {

	public static void main(String[] args) throws MalformedURLException {
		System.out.println("Starting");
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");

		DesiredCapabilities dc= DesiredCapabilities.firefox();
		//dc.setBrowserName("chrome");
		//dc.setVersion("65.0.3325.181");
		dc.setPlatform(Platform.WINDOWS);
		System.out.println("Capabilities iniialized");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.2.17:4444/wd/hub"),dc);
		driver.get("http://rediff.com");
		System.out.println("Completed");
	}

}
