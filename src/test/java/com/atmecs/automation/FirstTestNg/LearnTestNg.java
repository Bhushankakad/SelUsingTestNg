package com.atmecs.automation.FirstTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTestNg {

	WebDriver driver;

	@Test
	public void f() {
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);

		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";

		if (actualTitle != expectedTitle) {
			System.out.println("TestPassed");
		} else {
			System.out.println("TestFailed");
		}
	}

	@BeforeMethod
	public void beforeMethod() {

		
		System.setProperty("webdriver.chrome.driver","D:\\CromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
