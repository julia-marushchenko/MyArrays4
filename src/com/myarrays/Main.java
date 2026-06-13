/**
 *  Java program to find the maximum value in array.
 */

package com.myarrays;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array with longs.
        long[] longArray = {2L, 5L, -9L, 8L, 11L, 1L, 2L};

        /**
         * Finding the maximum.
         */
        // Creating a value with long minimum.
        long maxValue = Long.MIN_VALUE;

        // Comparing elements of array with minimum value.
        for (int i = 0; i < longArray.length; i++) {

            // Condition.
            if (maxValue < longArray[i]) {
                maxValue = longArray[i];
            }
        }

        // Printing the result to console.
        System.out.println("Maximum value of array is " + maxValue);

    }
}