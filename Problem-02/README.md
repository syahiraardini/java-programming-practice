# Problem 02 - Ten Integers Checker

## Objective
Write a Java program that asks user to enter 10 integers.
The program must determine:
- How many numbers are positive
- How many numbers are negative
- How many numbers are zero

## Concepts Practiced
- Scanner
- if/else-if/else
- for loop

## My Approach
First, I create counter variables for positive numbers, negative numbers and zeros, as well as a Scanner variable. 

Second, I create a loop that iterates 10 times and nest an if/else-if/else control structure inside the loop. In each iteration, the program asks user to enter an integer, and then the input goes through the control structure. If the integer is less than 0, the negative counter increases. If the integer is greater than 0, the positive counter increases. Otherwise, the zero counter increases.

Lastly, the program displays the total count of each category.

## What I learned
If I set i=1, I could use i<11 get 10 iteration. However, using 1<=10 is more practical and readable in programming.

