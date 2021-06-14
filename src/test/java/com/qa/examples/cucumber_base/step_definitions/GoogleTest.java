package com.qa.examples.cucumber_base.step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class GoogleTest {

	
 static WebDriver driver;

	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));

	}

	@Before
	public void setup() {

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.get(HomePage.getUrl());

		try {
			driver.get(HomePage.getUrl());
		} catch (TimeoutException e) {

		}
	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException {
		HomePage nav = PageFactory.initElements(driver, HomePage.class);
		
     nav.newSearch();
	Thread.sleep(10000);
	
   nav.getHomepage();
	Thread.sleep(10000);
		
	}
}
