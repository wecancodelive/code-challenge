#Third Largest No In Array - Without Collection

## Requirements

 Write program to find the 3rd largest number from the given integer array.
 Note: do not use any inbuilt methods or collections or streams.
 

## Algorithm in plain English
1. FOR I = 0 to ARR.LENGTH
2. FOR J = I + 1 TO ARR.LENGTH
3. INITIALIZE INT TMP = 0
4. IF ARR[I] < ARR[J] THEN 
   1. TMP = ARR[I]
   2. ARR[I] = ARR[J]
   3. ARR[J] = TMP
5. ARR IS SORTED IN DESCENDING
6. PRINT ARR[2] // Where 2 is the index position of the 3rd item in the arr.


## Code
[ThirdLargestNoWOCollectionApp.java](ThirdLargestNoWOCollectionApp.java)


### Other Similar Challenge

| Code | Reference (MD file)                           |
|------|-----------------------------------------------|
| [ThirdLargestNoWStreamsApp.java](ThirdLargestNoWStreamsApp.java) | [Read More](ThirdLargestNoWStreamsApp.md) |
|      |                                               |
