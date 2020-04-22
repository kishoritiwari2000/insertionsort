package main;

import insertionsortrecursion.InsertionSortClass;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the array?: ");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        //generating random numbers in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("UNSORTED ARRAY");
        System.out.println(Arrays.toString(array));

        InsertionSortClass.insertionSortMethod(array);
        System.out.println("ARRAY SORTED AFTER INSERTION SORT RECURSIVELY");
        System.out.println(Arrays.toString(array));
    }
}
