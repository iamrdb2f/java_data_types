package com.lafed.org;

public class DataTypes {

    public static void main(String[] args) {
        // Primitive Data Types
        int number = 10; // Integer
        double decimal = 20.5; // Double
        char letter = 'A'; // Character
        boolean isTrue = true; // Boolean
        byte smallNumber = 100; // Byte
        short shortNumber = 30000; // Short
        long largeNumber = 100000L; // Long
        float floatNumber = 10.5f; // Float

        // Non-Primitive Data Types
        String text = "Hello, World!"; // String
        int[] numbersArray = {1, 2, 3, 4, 5}; // Array
        String[] stringArray = {"Java", "Python", "C++"}; // Array of Strings

        // Displaying the values
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        System.out.println("Character: " + letter);
        System.out.println("Boolean: " + isTrue);
        System.out.println("String: " + text);
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + floatNumber);

        System.out.print("Array of Integers: ");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }

        System.out.print("\nArray of Strings: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
    }
}
