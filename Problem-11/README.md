# Login Log Analyzer

## Objective

Build a Java program that analyzes login activity for a specified user.

The program uses two related arrays:

- `String[] usernames` — stores the username for each login attempt.
- `int[] loginStatus` — stores the login result, where `1` represents a successful login and `0` represents a failed login.

The program allows the user to enter a username and determines whether that username exists in the login log. If the user exists, the program calculates the number of successful and failed login attempts for that user.

## Concepts Practiced

- Java arrays
- Multiple related arrays
- Array indexing
- `for` loops
- `if` statements
- Boolean conditions
- Logical AND operator (`&&`)
- `String.equals()`
- Methods
- Parameters
- Return values
- `boolean` return type
- Early return
- `Scanner` for user input
- Method reuse
- Basic login log analysis

## My Approach

I first separated the login data into two arrays. The same index in both arrays represents the same login attempt. I created a `countSuccessfulLogins()` method that searches through the arrays and counts an attempt only when both conditions are true. I then created `countFailedLogins()` using the same approach, except that the login status must be `0`. To avoid analyzing a username that does not exist in the log, I created a `containsUser()` method. This method searches the username array and returns `true` as soon as the specified username is found. If the entire array is searched without finding it, the method returns `false`. The `main()` method then uses `containsUser()` before calling the login analysis methods.

## What I Learned

1. I learned how two arrays can work together as related data by using the same index.
  
3. I also learned that `String` values should be compared using `.equals()` when comparing their contents rather than using `==`.
4. Another important lesson was method decomposition. Instead of putting all the logic inside `main()`, I separated the program into smaller methods, each with a specific responsibility.
5. I learned that a method should receive the parameters it actually needs and return a value that matches its responsibility.
6. I also practiced early return. In `containsUser()`, the method immediately returns `true` when the username is found instead of continuing to scan the rest of the array.
7. Finally, I learned an important principle about log analysis: if a username is not present in the available login log, the correct conclusion is that there is no recorded login activity for that username in this dataset. It does not necessarily prove that the user never attempted to log in outside the available data.

## Status
Completed
