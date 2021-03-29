/*
This program creates a few methods that manupulate arrays and print a certain desiered output.
The methods display the number in order they appear in the array, the numbers in revere order, 
the sum of the numbers, the number that are lower than an entered value, and the numbers that 
are over the average of the array. 
*/
import java.util.*;
public class ArrayMethodDemo {
    public static void main (String args[]) {
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7};
        int limit = 12;
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);
    }
    public static void display(int[] numbers) {
        int length = numbers.length;
        System.out.print("display passes: " + numbers[0]);
        for(int i=1; i<length; ++i) 
            System.out.print(" " + numbers[i]);
        System.out.print("\n");
    }
    public static void displayReverse(int[] numbers) {
        int length = numbers.length;
        System.out.print("display reverse passes: " + numbers[length-1]);
        for(int i=length-2; i>=0; --i) 
            System.out.print(" " + numbers[i]);
        System.out.print("\n");
    }
    public static void displaySum(int[] numbers) {
        int length = numbers.length;
        int sum = 0;
        for(int i=0; i<length; ++i) 
            sum += numbers[i];
        System.out.print("display sum passes: " + sum + "\n");
    }
    public static void displayLessThan(int[] numbers, int limit) {
        int length = numbers.length;
        System.out.print("display less than passes:");
        for(int i=0; i<length; ++i) 
            if (numbers[i] < limit)
                System.out.print(" " + numbers[i]);
        System.out.print("\n");

    }
    public static void displayHigherThanAverage(int[] numbers) {
        int length = numbers.length;
        int sum = 0;
        
        System.out.print("display higher than average passes:");
        for(int i=0; i<length; ++i) 
            sum += numbers[i];
        int average = sum / length;
        for(int i=0; i<length; ++i)
            if (numbers[i] > average)
                System.out.print(" " + numbers[i]);
        System.out.print("\n"); 
    }
}
