# Java (O(n²)) Time and Space Complexity

## Description

This Java program demonstrates **O(n²) time complexity**, where the number of operations grows quadratically with input size.  
The program finds all pairs of numbers in an array that sum to a given target.

## Complexity Analysis

### **Time Complexity: O(n²)**

- The program uses **two nested loops** to check all possible pairs.
- For an array of size **n**, it performs approximately **(n \* (n - 1)) / 2** operations.
- As **n grows, the execution time increases quadratically**.

### **Example Growth:**

- **n = 10 → 45 operations**
- **n = 100 → 4,950 operations**
- **n = 1,000 → 499,500 operations**

This makes **O(n²) inefficient for large inputs**.

### **Space Complexity: O(1)**

- The program only uses a few integer variables.
- No extra space is used beyond the input array.

### Time and Space Complexity Graph

```ascii
Operations │                           ╱
           │                          ╱
           │                        ╱
     8     │                      ╱
           │                   ╱
     6     │                 ╱
           │             ╱
     4     │         ╱
           │     ╱
     2     │╱
           │
     0     └─────────────────────────────────
           0    10²   10⁴   10⁶   10⁸   Input Size (n)
```
