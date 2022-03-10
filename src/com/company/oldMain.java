package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static com.company.insertionSort.insertionSort;
import static com.company.mergeSort.mergeSort;
import static com.company.quickSort.quickSort;
import static com.company.radixSort.radixSort;

public class oldMain {


    public static void main(String[] args) {
/*
        int  MAX_SEQUENTIAL = 100000, MAX_N = 100000000;

        int n = 0;
        long time = 0;

        // Choosing
        while (true){

            System.out.println("Welcome to the sorter, which sorter would you like to use?"
                    +"\nQuicksort: 1"
                    +"\nInsertion sort: 2"
                    +"\nMerge sort: 3"
                    +"\nRadix sort: 4");

        }


        // Read number of elements to be sorted from command line
        Scanner nInput = new Scanner(System.in);

        n = nInput.nextInt();

        int[] A = new int[n];
        Random R = new Random();

        for (int i = 0; i < n; i++)
            A[i] = R.nextInt(1000);


        if (n < 0 || n > MAX_N)
        {
            System.out.println("Use  1 <= n <= " + MAX_N);
            System.exit(1);
        }
        A = new int[n];

        sequentialSorting sS = new sequentialSorting();
        logarithmicSorting lS = new logarithmicSorting();

        if (n <= MAX_SEQUENTIAL)
        {
            // Timing of selection sort
            randomize(A);
            time = System.currentTimeMillis();
            sS.selectionSort(A);
            time = System.currentTimeMillis() - time;
            System.out.printf("Selection sort\t: %6.3f s\n", time/1000.0);

            // Timing of insertion sort
            randomize(A);
            time = System.currentTimeMillis();
            sS.insertionSort(A);
            time = System.currentTimeMillis() - time;
            System.out.printf("Insertion sort\t: %6.3f s\n", time/1000.0);

            // Timing of bubble sort
            randomize(A);
            time = System.currentTimeMillis();
            sS.bubbleSort(A);
            time = System.currentTimeMillis() - time;
            System.out.printf("Bubble sort\t: %6.3f s\n", time/1000.0);
        }
        else
            System.out.println("O(n^2) sorting too slow for large n");

        // Timing of shell sort
        randomize(A);
        time = System.currentTimeMillis();
        sS.shellSort(A);
        time = System.currentTimeMillis() - time;
        System.out.printf("Shell sort\t: %6.3f s\n", time/1000.0);

        // Timing of quicksort
        randomize(A);
        time = System.currentTimeMillis();
        lS.quickSort(A, 0, n-1);
        time = System.currentTimeMillis() - time;
        System.out.printf("Quicksort\t: %6.3f s\n", time/1000.0);

        // Timing of merge sort
        randomize(A);
        time = System.currentTimeMillis();
        lS.mergeSort(A, 0, n-1);
        time = System.currentTimeMillis() - time;
        System.out.printf("Merge sort\t: %6.3f s\n", time/1000.0);
    }

    // Fills array with unsorted random numbers
    public static void randomize(int A[])
    {
        Random r = new Random();
        int n =  A.length;
        int n2 = 2 * n;
        for (int i = 0; i < n; i++)
            A[i] = r.nextInt(n2);
    }
*/

    }
}
