package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static WebDriver  oBrowser=null;
	public static void main(String[] args) {
		openBrowser();
		navigate();
		openHindisong();
	}
	private static void openBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.youtube.com/");
		}catch(Exception e)
		{
			
		}
	}
	private static void openHindisong()
	{
		try
		{
			oBrowser.findElement(By.name("search_query")).sendKeys("songs");
			oBrowser.findElement(By.xpath("//*[@id='search-icon-legacy']/yt-icon")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
