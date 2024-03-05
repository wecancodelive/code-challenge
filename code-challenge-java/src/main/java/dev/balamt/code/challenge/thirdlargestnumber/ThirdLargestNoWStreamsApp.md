#Third Largest No In Array - With Streams

## Requirements

 Write program to find the 3rd largest number from the given integer array.
 Note: Use java streams.
 

## Algorithm in plain English
1. CONVERT ARR TO STREAMS
2. SORT THE STREAM IN ASCENDING
3. MAP TO OBJECT using String::valueOf // Convert int to String
4. LIST OF STRING SORTED_LIST = COLLECT - COLLECTORS.TO-LIST
5. PRINT SORTED_LIST[ARR.LENGTH - 3]


## Code
[ThirdLargestNoWStreamsApp.java](ThirdLargestNoWStreamsApp.java)


### Other Similar Challenge

| Code | Reference (MD file)                           |
|------|-----------------------------------------------|
| [ThirdLargestNoWOCollectionApp.java](ThirdLargestNoWOCollectionApp.java) | [Read More](ThirdLargestNoWOCollectionApp.md) |
|      |                                               |
