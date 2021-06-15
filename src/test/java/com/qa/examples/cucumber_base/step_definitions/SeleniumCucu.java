package com.qa.examples.cucumber_base.step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumCucu {
	
	
	
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
    
    @Given("I am on the Google search page")
    public void I_visit_google() {
        driver.get("https://www.google.com");
    }

    @When("I search for {American Airlines}")
    public void search_for(String query) {
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys("American Airlines");
        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();
   }

   @Then("the page title should start with {American Airlines}")
   public void checkTitle(String titleStartsWith) {
       // Google's search is rendered dynamically with JavaScript
       // Wait for the page to load timeout after ten seconds
       new WebDriverWait(driver,10L).until(new ExpectedCondition<Boolean>() {
           public Boolean apply(WebDriver d) {
               return d.getTitle().toLowerCase().startsWith("American Airlines");
           }
       });
   }

   @After()
   public void closeBrowser() {
       driver.quit();
   }
}

