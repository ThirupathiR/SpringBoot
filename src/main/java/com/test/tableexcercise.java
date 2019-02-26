package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableexcercise {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/20126/slw-vs-pakw-3rd-t20i-pakistan-women-tour-of-sri-lanka-2018");
WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

	int rowcount=table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-items")).size();
	int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-items'] div:nth-child(3")).size();
	for(int i=0;i<count;i++)
	{
	
	String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-items'] div:nth-child(3")).get(i).getText();
	
	int valueinteger= Integer.parseInt(value);
sum=sum+valueinteger;
			//System.out.println(sum);
	}
	String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int extrasValue=Integer.parseInt(Extras);
	int  TotalSumValue=sum+extrasValue;
	System.out.println(TotalSumValue);
	String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	int ActualTotalVaue=Integer.parseInt(ActualTotal);
	if(ActualTotalVaue==TotalSumValue)
	{
		System.out.println("Count Matches");
	}
	else
	{
		System.out.println("Count Fails");
		
	}
		
		
	}}
