package com.sgtesting.testAssignment1.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		Login();
		Minimixe();
		Createuser();
		Logout();
	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Minimixe()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).sendKeys("Akshatha");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ambadi");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='email']")).sendKeys("akshatha1312@gmail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("Akshh");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
