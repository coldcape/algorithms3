package com.company;

import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;

public class radixSort {

    void sort(int a[], int maksAntSiffer) {
        // Radixsortering av en array a med desimale heltall
        // maksAntSiffer: Maksimalt antall siffer i tallene

        int ti_i_m = 1; // Lagrer 10^m
        int n = a.length;

        // Oppretter 10 tomme kÃ¸er
        Queue<Integer>[] Q = (Queue<Integer>[]) (new Queue[10]);

        for (int i = 0; i < 10; i++)
            Q[i] = new LinkedList();

        // Sorterer pÃ¥ et og et siffer, fra hÃ¸yre mot venstre

        for (int m = 0; m < maksAntSiffer; m++) {
            // Fordeler tallene i 10 kÃ¸er
            for (int i = 0; i < n; i++) {
                int siffer = (a[i] / ti_i_m) % 10;
                Q[siffer].add(a[i]);
            }

            // TÃ¸mmer kÃ¸ene og legger tallene fortlÃ¸pende tilbake i a
            int j = 0;
            for (int i = 0; i < 10; i++)
                while (!Q[i].isEmpty())
                    a[j++] = (int) Q[i].remove();

            // Beregner 10^m for neste iterasjon
            ti_i_m *= 10;
        }
    }

    public static void radixSort(int[] a, int maksAntSiffer) {
        // Leser antall tall og antall siffer fra kommandolinja
        int n = a.length;
        int m = maksAntSiffer;

        // Beregner maks.verdi for tallene som skal sorteres
        int ti_i_m = (int) java.lang.Math.pow(10, m);


        // Sorterer
        radixSort rS = new radixSort();
        rS.sort(a, m);

        // Skriver ut sortert array formatert i kolonner
        int linjebredde = 80;
        int tall_pr_linje = linjebredde / (m + 1);
      /*  for (int i = 0; i < n; i++)
        {
            String format = "%" + m + "d ";
            System.out.printf(format, a[i]);
            if (((i+1) % tall_pr_linje == 0) || (i == n - 1))
                 System.out.println();
        }*/
    }

}
