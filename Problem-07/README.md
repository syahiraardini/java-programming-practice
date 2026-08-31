# Problem 07 - Count a String

## Objective
Create a Java program that uses the following String:
- String text = "cybersecurity";

The program must determine:
- How many vowels are in the String
- How many consonants
- How many characters are letters overall

Restrictions:
- Don't use regex
- Don't use a Java library method that directly counts vowels and consonants.

## Concepts Practiced
- String
- Loop
- Char
- if/else
- Methods

## My Approach
1. What needs to be calculated?
* How many vowels are in the String
* How many consonants are in the String
* The total number of characters in the String that are letters

2. What methods will I create?
* countVowels 
* countConsonants
* countCharacter
  
3. What parameters does each method need?
- Each method needs a String parameter
  
4. What should each method return?
- Each method should return an int
  
5. What is each method responsible for?
* countVowels - count vowels in the String
* countConsonants - count consonants in the String
* countCharacter - count the total numbers of characters in the String that are letters

# What I Learned
1. I learned how to convert a String to lowercase to make sure that when the String goes through the if/else control structure, it still produces the correct output.
2. I learned how to use .contains(), which checks whether the assigned variable contains the specified parameter and returns a boolean.
3. I learned how to convert the result of charAt(i) into a String using String.valueOf() to make sure it matches the parameter type required by .contains().
4. I learned how to check if a character in a String is a letter by using Character.isLetter().

# Status
Completed
