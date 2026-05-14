package com.example.sorting;

import java.util.Arrays;
import java.util.List;

public class SortingUtility {

    /**
     * Sorts an array in-place using Gnome Sort.
     *
     * @param a the array of Comparable objects to sort
     * @param <T> the Comparable element type
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] a) {

        int pos = 0;

        while (pos < a.length) {
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                pos = pos + 1;
            } else {
                swap(a, pos, pos - 1);
                pos = pos - 1;
            }
        }
    }

    /**
     * Sorts an array in-place using Cocktail Shaker Sort.
     * This is a bidirectional bubble sort variant.
     *
     * @param a the array of Comparable objects to sort
     * @param <T> the Comparable element type
     */
    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {

        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;

            for (int i = a.length - 2; i >= 0; i--) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

        } while (swapped);
    }

    /**
     * Sorts an array in-place using Shell Sort with the Ciura gap sequence.
     *
     * @param a the array of Comparable objects to sort
     * @param <T> the Comparable element type
     */
    public static <T extends Comparable<T>> void shellSort(T[] a) {

        List<Integer> gaps = Arrays.asList(701, 301, 132, 57, 23, 10, 4, 1);
        int n = a.length;

        for (int gap : gaps) {
            for (int i = gap; i < n; i += 1) {
                T temp = a[i];
                int j;

                for (j = i; (j >= gap) && (a[j - gap].compareTo(temp) > 0); j -= gap) {
                    a[j] = a[j - gap];
                }

                a[j] = temp;
            }
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}
