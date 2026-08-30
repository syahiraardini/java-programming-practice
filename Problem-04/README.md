# Problem 04 - Find the Maximum

## Objective
The program needs to determine the biggest value in following array:
- int[] numbers = {12,-5,0,7,-3,8,0,15,-10,4};

Don't use Arrays.sort() or Math.max() to solve it.

## Concepts Practiced
- Array
- for/while loop
- if/else
- Comparison

## My Approach
To find the biggest number in the array, I first declare a variable and set its value to 0. Then, I create a loop using the same iteration concept as in the previous problem and nest an if/else control structure inside the loop. 

The condition checks whether the number at the current index is bigger than the current value of biggestNumber. If it is, the program assigns the current number as the new value of biggestNumber.

## What I learned
After my first attempt at running the program, I realized that setting the biggestNumber to 0 wasn't the best because the array may contain negative numbers. 

Because the program compares numbers by index, I learned that setting the variable to numbers[0] is more flexible because it allows the program to compare all the number in the array and find the biggest number, even when all the numbers are negative.

## Status
Completed
