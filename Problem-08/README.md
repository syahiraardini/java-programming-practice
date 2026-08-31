# Problem 08 - Number Analyzer

## Objective
Given:
- int[] numbers = {14,7,22,7,31,10,22,5,18,7};

The program needs to analyze the array and determine:
- the total number of elements in the array
- the total number of even numbers
- the total number of odd numbers
- the total number of numbers greater than 15
- the sum of even numbers

Lastly, the program also needs to find whether a number exists in the array

## My Approach 
1. What methods will I create?
* countEvenNumbers()
* countOddNumbers()
* numGreaterThan15()
* sumOfEvenNumbers()
* searchNumber()
  
2. What parameters does each method need?
* countEvenNumbers() - int[] numbers
* countOddNumbers() - int[] numbers
* numGreaterThan15() - int[] numbers
* sumOfEvenNumbers() - int[] numbers
* searchNumber() - int[] numbers
  
3. What should each method return?
* countEvenNumbers() - int
* countOddNumbers() - int
* numGreaterThan15() - int
* sumOfEvenNumbers() - int
* searchNumber() - boolean
  
4. What is each method responsible for?
* countEvenNumbers() - Count the even numbers in the array
* countOddNumbers() - Count the odd numbers in the array
* numGreaterThanFifteen() - Count the numbers greater than 15
* sumOfEvenNumbers() - Calculates the sum of all the even numbers in the array
* searchNumber() - searches for a specified number in the array and confirm if the number is in the array or not.

## What I Learned
When working on the searchNumber() method, I initially considered using String as the return type because the program needs to display Found if the result is true and Not Found otherwise.

I was confused when trying to implement the method in main(). I wasn't sure how I was supposed to specify which number I wanted to search for. Should I ask for input from the user?

In the end, I found that it was easier to declare a variable for the number I wanted to search for and then create a loop to display the result based on the output of searchNumber(). So I add another parameter to searchNumber() which is int searchNum.

## Status
Completed
