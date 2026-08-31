# Problem 09 - Password Strength Analyzer

## Objective
A program is given a String password, for example:
- String password = "Cyber123!"

The program must determine:
- Password length
- Whether the password has an uppercase letter?
- Whether the password has an lowercase letter?
- Whether the password has a digit?
- Whether the password has a special character?

Then, the program determines the strength of the password:
- Strong
- Medium
- Weak

Use the following rules:
1. Weak
  - length is less than 8
2. Medium
  - length is at least 8
  - has at least 1 uppercase letter
  - has at least 1 lowercase letter
  - does not have both a digit and a special character
3. Strong
  - length is at least 8
  - has at least 1 uppercase letter
  - has at least 1 lowercase letter
  - has digit AND a special character

## My Approach
1. What needs to be analyzed?
- The password length.
- Whether the password has an uppercase letter, lowercase letter, digit, and special character.
- If the password has a length of at least 8, at least 1 uppercase letter, at least 1 lowercase letter, and does not have both a digit and a special character, it is medium.
- If the password has a length of at least 8, an uppercase letter, a lowercase letter, a digit, AND a special character, it is strong.
Otherwise, it is weak.

3. What methods will I create?
* hasUppercase()
* hasLowercase()
* hasDigit()
* hasSpecialCharacter()
* determineStrength()

3. What parameters does each method need?
* hasUppercase() - String password
* hasLowercase() - String password
* hasDigit() - String password
* hasSpecialCharacter() - String password
* determineStrength() - String password

4. What should each method return?
* hasUppercase() - boolean
* hasLowercase() - boolean
* hasDigit() -boolean
* hasSpecialCharacter() - boolean
* determineStrength() - String 

5. What is each method responsible for?
* hasUppercase() - determines whether the password has an uppercase letter
* hasLowercase()  determines whether the password has a lowercase letter
* hasDigit() -  determines whether the password has a digit
* hasSpecialCharacter() -  determines whether the password has a special character
* determineStrength() - determines whether the password is weak, medium or strong

## What I Learned
In this problem, I learned how to call methods inside another method and use their return values as conditions inside a loop.

## Status
Completed
