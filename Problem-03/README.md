# Problem 03 - Array Analysis

## Objective
Write a Java program that has the following array:
- int[] numbers = {12,-5,0,7,-3,8,0,15,-10,4};

Program must determine:
- How many numbers are positive
- How many numbers are negative
- How many numbers are zero
- Total of all numbers

Create without Arrays utility methods and without sorting.

## Concepts Practiced
- Array
- if/else
- for/while loop
- Accumulator
- Counter

## My Approach
I use the same approach as in the previous problem, but for the iteration, I use the length of the array to determine how many times the loop should iterate. 

To calculate the total of the array, I set up an accumulator after the if/else control structure to make sure the program adds each number to the total after determining whether the number is a positive, negative or zero.

## What I Learned
It is important to understand the difference between the length and the index of an array. The length starts counting from 1, while the array index starts from 0. 

When I use the array's length for iteration, I set i=0 to ensure that the number at index 0 is not excluded from the program.

## Status
Completed
