package com.qa.examples.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import com.qa.examples.cucumber_base.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CanCalculateAdditionAndSubtraction {
	
	private Calculator calculator;
	private double actualResult;

	@Given("a calculator")
	public void aCalculator() {
		calculator = new Calculator();
	}

	@When("{int} and {int} are added")
	public void andAreAdded(Integer num1, Integer num2) {
		actualResult = calculator.add(num1, num2);
	}
	
	@When("{int} is subtracted from {int}")
	public void isSubtractedFrom(Integer num1, Integer num2) {
	    actualResult = calculator.subtract(num2, num1);
	}
	
	@When("{int} and {int} are multiplied")
	public void andAreMultiplied(Integer num1, Integer num2) {
		actualResult = calculator.multiply(num1, num2);
	}
	
	@When("{int} is divided by {int}")
	public void isDividedBy(Integer num1, Integer num2) {
	    actualResult = calculator.divide(num2, num1);
	}
	
	
	@Then("the result should be {int}")
	public void theResultShouldBe(Integer expectedResult) {
	    assertEquals(expectedResult.doubleValue(), actualResult, 4);
	}
	
}
