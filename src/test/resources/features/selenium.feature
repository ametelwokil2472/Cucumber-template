#Author: your.email@your.domain.com

As a user I want to  navigate on google page 
I want to search a page 


@tag
Feature: Can search and and display a page
  I want to use this template for my feature file

  @tag1
  Given I am on the Google search page
   When I search for "American Airlines"
   Then the page title should start with "American Airlines"
    

  @tag2
  Scenario Outline: Searching for American Airlines
    Given Search result
    When I click American Airlines home page
    Then I get the home page

    