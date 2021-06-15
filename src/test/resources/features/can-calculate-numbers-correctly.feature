#Author: mwalsh@qa.com

Feature: Can calculate numbers correctly?
  To test whether addition, subtraction, multiplication and division return the correct
  results.
  
  Todo:
  
  - Implement subtraction
  - Implement division
  - Implement multiplication

  Scenario Outline: <left_operand> add <right_operand> is <expected_result>
    Given a calculator
    When <left_operand> and <right_operand> are added
    Then the result should be <expected_result>
    
    Examples:
    | left_operand | right_operand | expected_result |
    | 3.0 				 | 4.0           | 7.0             |
    | 89.0 				 | 9.0           | 98.0            |
    | 9.0          | 89.0          | 98.0            |
    | 0.0          | 3.0           | 3.0             |
    | 0.0          | -3.0          | -3.0            |
    | 2.5          | 2.5           | 5.00            |
    
Scenario Outline: <left_operand> subtract <right_operand> is <expected_result>
    Given a calculator
    When <left_operand> is subtract <right_operand>
    Then the result should be <expected_result>
    
    Examples:
    | left_operand | right_operand | expected_result |
    | 10.0 				 | 5.0           | 5.0             |
    | 89.0 				 | 9.0           | 80.0            |
    | 9.0          | 8.0           |  1.0            |
    | 3.0          | 3.0           |  0.0            |
    | 7.0          | -3.0          |  10.0           |
    | 2.5          |  0.5          |  2.0            |
    
    Scenario Outline: <left_operand> multiply <right_operand> is <expected_result>
    Given a calculator
    When <left_operand> and <right_operand> are multiplied
    Then the result should be <expected_result>
    
    Examples:
    | left_operand | right_operand | expected_result |
    | 10.0 				 | 5.0           | 50.0            |
    | 8.0 				 | 9.0           | 72.0            |
    | 9.0          | 3.0           | 27.0            |
    | 3.0          | 3.0           |  9.0            |
    | 7.0          | -3.0          | -21.0           |
    | 2.5          |  2.0          |  5.0            |
    
    
     Scenario Outline: <left_operand> divide <right_operand> is <expected_result>
    Given a calculator
    When <left_operand> divided by <right_operand> 
    Then the result should be <expected_result>
    
    Examples:
    | left_operand | right_operand | expected_result|
    | 10.0 				 | 2.0           | 5.0            |
    | 8.0 				 | 2.0           | 4.0            |
    | 9.0          | 3.0           | 3.0            |
    | 3.0          | 3.0           |  1.0           |
    | 27.0         | 3.0           |  9.0           |
    | 25.0         | 5.0           |  5.0           |
    
    
    