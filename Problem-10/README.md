# Problem 10 - Login Attempt Analyzer

## Objective
Build a Java program that analyzes a sequence of login attempts and generates a simple security report. Use the following array:
- int[] loginAttempts = {1, 0, 1, 1, 0, 0, 1, 1, 1, 0};

Each login attempt is represented by:

* 1 — Successful login
* 0 — Failed login

The program should:
- count the total number of attempts
- count successful and failed logins attempts
- calculate the failure rate.
- detect possible brute-force activity when 3 or more failed login attempts occur consecutively
- determine the maximum number of consecutive failed attempts in the record.

## My Approach
1. What needs to be analyzed?
- How many attempts were made?
- The total of successful logins which are represented by 1
- The total of failed logins which are represented by 0
- The failure rate
- The maximum number of consecutive failures
- The brute-force pattern which is defined as 3 or more consecutive failures

2. What methods will I create?
- countSuccessfulAttempts()
- countFailedAttempts()
- calculateFailureRate()
- maxConsecutiveFailures()
- bruteForcePattern()

3. What parameters does each method need?
- Each method needs int[] loginAttempts as parameter

4. What should each method return?
- countSuccessfulAttempts() - int
- countFailedAttempts() - int
- calculateFailureRate() - double
- maxConsecutiveFailures() - int
- bruteForcePattern() - boolean

5. What is each method responsible for?
- countSuccessfulAttempts() - counts the total number of successful login attempts
- countFailedAttempts() - counts the total number of failed login attempts
- calculateFailureRate() - calculates the failure rate of login attempts
- maxConsecutiveFailures() - determines the maximum numbers of consecutive failed login attempts
- bruteForcePattern() - detects a possible brute-force pattern

## What I Learned
I learned to write pseudocode for the maxConsecutiveFailures() method before writing the code in VS Code. I also learned how to format the failure rate to two decimal places using printf.

## Status
Completed
