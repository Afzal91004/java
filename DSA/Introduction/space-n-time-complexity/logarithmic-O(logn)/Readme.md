## Description

This Java program demonstrates an **O(log n) time complexity** operation.  
It searches for an element in a sorted array using an approach that reduces the search space by half in each step.

## Complexity Analysis

### **Time Complexity: O(log n)**

- The number of operations performed grows **logarithmically** with the input size.
- At each step, the problem size is divided by 2.
- If the input size is **n**, the number of steps taken is approximately **log₂(n)**.

### **Why Logarithmic?**

- Instead of iterating through every element **O(n)**, the algorithm eliminates **half** of the remaining elements in each step.
- For an array of size:
  - **8 elements → max 3 steps (log₂(8) = 3)**
  - **16 elements → max 4 steps (log₂(16) = 4)**
  - **1,000,000 elements → max 20 steps (log₂(1,000,000) ≈ 20)**

This makes logarithmic complexity much faster than linear complexity for large inputs.

## Space Complexity: O(1)

- The program uses a **constant** amount of extra space.
- It only requires a few integer variables, **not dependent** on input size.

## How the Code Works

1. The program takes a sorted array.
2. It asks the user to input a number to search.
3. It applies **Binary Search**:
   - Checks the middle element.
   - If the number is smaller, it searches the left half.
   - If the number is larger, it searches the right half.
   - It repeats until the number is found or the search space is empty.
4. If the number is found, it prints its index.
5. If not found, it prints `"Element not found in the array."`

### Time and Space Complexity Graph

```ascii
Operations │
           │
     4     │     ╭──────────────────────────
           │    ╭
     3     │   ╭
           │  ╭
     2     │ ╭
           │╭
     1     │
           │
     0     └─────────────────────────────────
           0    10²   10⁴   10⁶   10⁸   Input Size (n)
```
