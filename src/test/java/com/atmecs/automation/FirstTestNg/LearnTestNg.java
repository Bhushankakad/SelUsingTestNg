package com.atmecs.automation.FirstTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTestNg {

	WebDriver driver;

	@Test
	public void testTitle() {
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);

		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";

		if (actualTitle != expectedTitle) {
			System.out.println("TestPassed");
			assertEquals(actualTitle, expectedTitle);
		} else {
			System.out.println("TestFailed");
			assertEquals(actualTitle, expectedTitle);
		}
	}
	
	@Test
	public void testCurrentUrl(){
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.google.com/";
		
		if(actualURL!=expectedURL){
			System.out.println("Url doent match");
			assertEquals(actualURL, expectedURL);
		}else{
			System.out.println("url matched");
			assertEquals(actualURL, expectedURL);
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
