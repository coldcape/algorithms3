package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static com.company.insertionSort.insertionSort;
import static com.company.mergeSort.mergeSort;
import static com.company.quickSort.quickSort;
import static com.company.radixSort.radixSort;


public class Main {

    public static void main(String[] args) {

        int MAX_SEQUENTIAL = 100000, MAX_N = 100000000;
        int n = 0;
        int[] A;
        long time = 0;
        boolean running = true;
        String sortingMethodName = null;
        double constant;
        double sumConstant = 0;

        Scanner scanner = new Scanner(System.in);

        while (running) {

            System.out.println("Enter the length of list");

            n = scanner.nextInt();
            if (n < 0 || n > MAX_N) {
                System.out.println("Please input a number between 0 and: " + MAX_N);
            }
            A = new int[n];

            System.out.println("Now that you have chosen your number, please chose a sorting method:"
                    + "\nQuicksort: 1"
                    + "\nInsertion: 2"
                    + "\nMerge Sort: 3"
                    + "\nRadix Sort: 4"
            );
            int sortingMethod = scanner.nextInt();

            System.out.println("Sorting method has been chosen, please choose testing method \n"
                    + "Test running time: 1 \n"
                    + "Estimate average constant: 2"
            );
            int testMethod = scanner.nextInt();


            if (testMethod == 1) { // Test running time

                // Randomizing array
                Random R = new Random();
                for (int i = 0; i < n; i++)
                    A[i] = R.nextInt(100000);

                time = System.currentTimeMillis();
                if (sortingMethod == 1) { // Quick Sort
                    sortingMethodName = "Quick Sort";
                    quickSort(A, 0, n - 1);
                } else if (sortingMethod == 2) { // Insertion sort
                    sortingMethodName = "Insertion sort";

                    insertionSort(A);
                } else if (sortingMethod == 3) { // Merge sort
                    sortingMethodName = "Merge sort";

                    mergeSort(A, 0, n - 1);

                } else if (sortingMethod == 4) { // Radix sort
                    sortingMethodName = "Radix sort";

                    radixSort(A, n);

                }
                time = System.currentTimeMillis() - time;
                System.out.println("\nStats: " + time);
            } else if (testMethod == 2) {
                Random R = new Random();
                for (int i = 0; i < n; i++)
                    A[i] = R.nextInt(10);

                for (int i = 0; i < 10; i++) {
                    time = System.currentTimeMillis();
                    if (sortingMethod == 1) { // Quick Sort
                        quickSort(A, 0, n - 1);

                    } else if (sortingMethod == 2) { // Insertion Sort
                        insertionSort(A);
                    } else if (sortingMethod == 3) { // Merge Sort
                        mergeSort(A, 0, n - 1);

                    } else if (sortingMethod == 4) { // Radix
                        radixSort(A, n);
                    }
                    time = System.currentTimeMillis() - time;
                    if (sortingMethod == 1) { // Quick Sort
                        sumConstant += (time / (n * Math.log10(n)));

                    } else if (sortingMethod == 2) { // Insertion Sort
                        sumConstant += (time / (Math.pow(n, 2)));
                    } else if (sortingMethod == 3) { // Merge Sort
                        sumConstant += (time / (n * Math.log10(n)));

                    } else if (sortingMethod == 4) { // Radix
                        sumConstant += (double) (time / n);
                    }


                }
                constant = sumConstant / 10;

                System.out.println("Estimate: " + constant);

            }


            System.out.println("Do you wish to continue Yes: 1/ No: 0");
            int quit = scanner.nextInt();
            if (quit == 0) {
                running = false;
            }

        }


    }
}




