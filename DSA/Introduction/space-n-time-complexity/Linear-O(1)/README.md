# Java O(1) Time and Space Complexity Example

## Description

This Java program demonstrates an **O(1) time and space complexity** operation.  
It initializes an array, increments the first element by 10, and prints the result.

## Complexity Analysis

- **Time Complexity:** O(1) → The operation is performed on a single element,  
  so it takes constant time regardless of the array size.
- **Space Complexity:** O(1) → The program uses a fixed amount of space (4 bytes for `num`),  
  independent of the input size.

### Explanation

- Even if the array contains **1 million elements**, only the **first indexed element** is accessed.
- The variable `num` always takes the same amount of space (4 bytes for an integer).
- This ensures **constant time and space complexity**.
