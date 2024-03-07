# Sum of Digits in a Number using Recursion

## Requirements
Write program to sum the digits in a number n.
Note: Use method recursion.

## Algorithm in plain English
1. INIT N = 1234
2. INIT ANSWER = CALL SUM_OF_DIGITS (0, N)
3. METHOD SUM_OF_DIGITS: SUM, N
   1. IF N <= 0 :
   2. RETURN O
   3. SUM = SUM + (N%10)
   4. RETURN CALL SUM_OF_DIGITS (SUM, (N/10))
4. PRINT ANSWER

## Code
[SumOfDigitsUsingRecursionApp.java](SumOfDigitsUsingRecursionApp.java)


### Other Similar Challenge
| Code                                                                   | Reference (MD file)                           |
|------------------------------------------------------------------------|-----------------------------------------------|
| [SumOfDigitsUsingWhileLoopApp.java](SumOfDigitsUsingWhileLoopApp.java) | [Read More](SumOfDigitsUsingWhileLoopApp.md)  |
| [SumOfDigitsUsingStreamsApp.java](SumOfDigitsUsingStreamsApp.java)     | [Read More](SumOfDigitsUsingStreamsApp.md)    |
|                                                                        |                                               |
