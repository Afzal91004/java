class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray(2);

        // Insert elements
        array.insert(1);
        array.insert(2);
        array.insert(123);
        array.insert(50);
        array.insert(30);
        array.insert(10);

        // Print original array
        System.out.println("Original Array:");
        System.out.println(array);

        // Print the array again
        System.out.println("\nArray Printed Again:");
        System.out.println(array);

        // Find and print max value
        System.out.println("\nMaximum Value in the Array:");
        System.out.println(array.max());

        // Find and print min value
        System.out.println("\nMinimum Value in the Array:");
        System.out.println(array.min());

        // Reverse and print new reversed array
        System.out.println("\nReversed Array:");
        array.reverse();
        System.out.println(array);
    }
}
