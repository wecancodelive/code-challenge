# Print Fibonacci Using Recursion


## Requirements
Write program to print fibonacci until n.
where n is the count of fibonacci numbers we wanted.
Note: Use method recursion

## Algorithm in plain English
1. INIT N = 20
2. static INIT START = 0
3. static INIT FIRST = 1
4. static INIT TEMP
5. PRINT START
6. PRINT FIRST
7. CALL PRINTFIBONACCINUMBER WITH N - 2
8. METHOD PRINTFIBONACCINUMBER:
   1. IF N > 0
   2. TEMP = START + FIRST
   3. START = FIRST
   4. FIRST = TEMP
   5. PRINT TEMP
   6. CALL PRINTFIBONACCINUMBER WITH N - 1

## Code
[FibonacciUsingForLoopApp.java](FibonacciUsingForLoopApp.java)


### Other Similar Challenge
| Code                                                            | Reference (MD file)                        |
|-----------------------------------------------------------------|--------------------------------------------|
| [FibonacciUsingForLoopApp.java](FibonacciUsingForLoopApp.java)  | [Read More](FibonacciUsingForLoopApp.md)   |
| [FibonacciUsingStreamsApp.java](FibonacciUsingStreamsApp.java)  | [Read More](FibonacciUsingStreamsApp.md)   |
|                                                                 |                                            |
