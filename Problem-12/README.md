# Problem 12 - Failed Login Detector

## Objective

Build a Java program that analyzes login activity and determines whether a specified user has a suspicious number of failed login attempts.

For this exercise, a user is considered **Suspicious** if they have **3 or more failed login attempts**.

The program analyzes the following arrays:
String[] usernames = {
    "alice", "bob", "alice", "admin", "bob",
    "alice", "admin", "admin", "bob", "alice",
    "bob", "admin"
};

int[] loginStatus = {
    1, 0, 1, 0, 0,
    1, 0, 1, 0, 1,
    0, 0
};

- `String[] usernames` — stores the username for each login attempt.
- `int[] loginStatus` — stores the login result, where `1` represents a successful login and `0` represents a failed login.

## Concepts Practiced

- Java arrays
- Multiple related arrays
- Array indexing
- `for` loops
- `if` statements
- Logical AND operator (`&&`)
- `String.equals()`
- Methods
- Parameters
- Return values
- `int` and `String` return types
- Method reuse
- Threshold-based classification
- Basic login log analysis

## My Approach

I reused the `countFailedLogins()` method from the previous Login Log Analyzer problem.

The method searches through the username and login status arrays and increases the counter only when both conditions are satisfied:

1. The username matches the specified user.
2. The login status is `0`, meaning the login failed.

The `failedLoginStatus()` method then uses the result of `countFailedLogins()` to determine whether the user's activity is normal or suspicious.

The threshold used in this exercise is:

```text
3 or more failed logins → Suspicious
Less than 3 failed logins → Normal
```

The overall flow is:

```text
Specified username
        ↓
countFailedLogins()
        ↓
Total failed logins
        ↓
Is total >= 3?
      /     \
    Yes      No
     ↓        ↓
Suspicious  Normal
```

Instead of creating separate methods for each user, the username is passed as a parameter. This makes the methods reusable for different users.

## What I Learned

1. I learned how to filter data using multiple conditions. A login attempt is counted only when both the username and login status match the required criteria.

2. I also practiced reusing one method inside another method. `failedLoginStatus()` calls `countFailedLogins()` instead of repeating the same loop.

3. Another important lesson was the difference between **total failed attempts** and **consecutive failed attempts**. In this exercise, failed attempts do not need to be consecutive to make a user suspicious.

4. I also learned how a numerical result can be converted into a meaningful classification using a threshold:

```text
Failed attempts >= 3 → Suspicious
Failed attempts < 3  → Normal
```

This introduced me to a basic form of log analysis where raw login records are transformed into information that can indicate potentially suspicious activity.

## Status
Completed
