# Problem 06 - Student Score Analyzer

## Objective
Build a small program to analyze student scores. Use the following array:
- int[] scores= {78,92,65,88,55,91,73,84,60,97};

The program must determine:
- The highest score
- The lowest score
- The average score
- The number of students who passed
- The number of students who failed

Use the following passing conditions:
- score >= 60 → Pass
- score < 60  → Fail

The program should be broken down into methods.

## Concepts Practiced
- Methods

## My Approach
1. List what the program needs to calculate. 
- Calculate the highest score
- Calculate the lowest score
- Calculate the average score
- Determine the number of students who passed
- Determine the number of student who failed

2. Decide which tasks deserve their own methods. 
- Highest score
- Lowest score
- Average score
- Student passed
- Student failed
	
3. Decide what information each method needs. 
- Each method needs the student scores.
- The methods for determining passed and failed students also need the passing conditions.

4. Decide what each method should return. 
- Each method should return int except, for averageScore, which should return double.

## What I Learned
First, I learned that instance methods need an object to be called, whereas static methods don't require an object and can be called directly using the class name.

Second, I learned that I need to explicitly cast the type when calculating the average to get the correct result when working with integer values.

## Status 
Completed
