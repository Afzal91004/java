# Java O(n) Time and Space Complexity Example

## Description

This Java program demonstrates **O(n) time and space complexity**.  
It copies elements from one array to another and prints the new array.

## Complexity Analysis

### **Space Complexity: O(n)**

- The program creates an additional array (`arrNew[]`) of the same size as `arr[]`.
- The loop variables use constant space O(1).
- Total Space Complexity: **O(n) + O(1) + O(1) = O(n)**.

### **Time Complexity: O(n)**

- Copying elements from `arr[]` to `arrNew[]` takes **O(n)** time.
- Printing elements of `arrNew[]` takes **O(n)** time.
- Total Time Complexity: **O(1) + O(n) + O(n) = O(2n) = O(n)**.

### Time and Space Complexity Graph

```ascii
Operations │
           │                              /
     8     │                          /
           │                      /
     6     │                  /
           │              /
     4     │          /
           │      /
     2     │  /
           │/
     0     └─────────────────────────────────
           0    10²   10⁴   10⁶   10⁸   Input Size (n)
```
