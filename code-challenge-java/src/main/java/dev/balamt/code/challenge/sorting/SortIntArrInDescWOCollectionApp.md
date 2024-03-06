# Sorting Integer Array in Descending order without Collections

## Requirements
Write program to sort the integer array in descending order.
Note: Do not use Stream, Arrays.sort() or any in-built methods.

## Algorithm in plain English
1. FOR I = 0 to ARR.LENGTH
2. FOR J = I + 1 TO ARR.LENGTH
3. INITIALIZE INT TMP = 0
4. IF ARR[I] < ARR[J] THEN
    1. TMP = ARR[I]
    2. ARR[I] = ARR[J]
    3. ARR[J] = TMP
5. ARR IS SORTED IN DESCENDING
6. PRINT ARR WITH FOR K = 0 TO ARR.LENGTH

## Code
[SortIntArrInDescWOCollectionApp.java](SortIntArrInDescWOCollectionApp.java)


### Other Similar Challenge
| Code                                                                           | Reference (MD file)                           |
|--------------------------------------------------------------------------------|-----------------------------------------------|
| [SortIntArrInDescWOCollectionApp.java](SortIntArrInDescWOCollectionApp.java)   | [Read More](ThirdLargestNoWOCollectionApp.md) |
| [SortIntArrInDescWOCollectionApp.java](SortIntArrInDescWOCollectionApp.java)   | [Read More](ThirdLargestNoWStreamsApp.md)     |
|                                                                                |                                               |
