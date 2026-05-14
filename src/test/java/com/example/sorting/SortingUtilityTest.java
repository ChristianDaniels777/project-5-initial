package com.example.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingUtilityTest {

    @Test
    @DisplayName("Gnome Sort handles an empty array")
    void gnomeSort_emptyArray_sortsInPlace() {
        Integer[] a = {};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new Integer[]{}, a);
    }

    @Test
    @DisplayName("Gnome Sort handles a single element array")
    void gnomeSort_singleElement_sortsInPlace() {
        Integer[] a = {5};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    @DisplayName("Gnome Sort leaves an already sorted array sorted")
    void gnomeSort_alreadySorted_sortsInPlace() {
        Integer[] a = {1, 2, 3, 4, 5};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    @DisplayName("Gnome Sort sorts a reverse sorted array")
    void gnomeSort_reverseSorted_sortsInPlace() {
        Integer[] a = {5, 4, 3, 2, 1};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    @DisplayName("Gnome Sort sorts an array with duplicates")
    void gnomeSort_duplicates_sortsInPlace() {
        Integer[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, a);
    }

    @Test
    @DisplayName("Gnome Sort handles all same elements")
    void gnomeSort_allSameElements_sortsInPlace() {
        Integer[] a = {5, 5, 5, 5, 5};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, a);
    }

    @Test
    @DisplayName("Gnome Sort sorts two swapped elements")
    void gnomeSort_twoElementsSwapped_sortsInPlace() {
        Integer[] a = {2, 1};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    @DisplayName("Gnome Sort handles two sorted elements")
    void gnomeSort_twoElementsSorted_sortsInPlace() {
        Integer[] a = {1, 2};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    @DisplayName("Gnome Sort sorts random ordered integers")
    void gnomeSort_randomOrder_sortsInPlace() {
        Integer[] a = {64, 34, 25, 12, 22, 11, 90};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, a);
    }

    @Test
    @DisplayName("Gnome Sort works with String Comparable objects")
    void gnomeSort_stringArray_sortsInPlace() {
        String[] a = {"zebra", "apple", "mango", "banana"};

        SortingUtility.gnomeSort(a);

        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort handles an empty array")
    void cocktailShakerSort_emptyArray_sortsInPlace() {
        Integer[] a = {};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new Integer[]{}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort handles a single element array")
    void cocktailShakerSort_singleElement_sortsInPlace() {
        Integer[] a = {5};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort leaves an already sorted array sorted")
    void cocktailShakerSort_alreadySorted_sortsInPlace() {
        Integer[] a = {1, 2, 3, 4, 5};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort sorts a reverse sorted array")
    void cocktailShakerSort_reverseSorted_sortsInPlace() {
        Integer[] a = {5, 4, 3, 2, 1};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort sorts an array with duplicates")
    void cocktailShakerSort_duplicates_sortsInPlace() {
        Integer[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort handles all same elements")
    void cocktailShakerSort_allSameElements_sortsInPlace() {
        Integer[] a = {5, 5, 5, 5, 5};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort sorts two swapped elements")
    void cocktailShakerSort_twoElementsSwapped_sortsInPlace() {
        Integer[] a = {2, 1};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort handles two sorted elements")
    void cocktailShakerSort_twoElementsSorted_sortsInPlace() {
        Integer[] a = {1, 2};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort sorts random ordered integers")
    void cocktailShakerSort_randomOrder_sortsInPlace() {
        Integer[] a = {64, 34, 25, 12, 22, 11, 90};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, a);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort works with String Comparable objects")
    void cocktailShakerSort_stringArray_sortsInPlace() {
        String[] a = {"zebra", "apple", "mango", "banana"};

        SortingUtility.cocktailShakerSort(a);

        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, a);
    }

    @Test
    @DisplayName("Shell Sort handles an empty array")
    void shellSort_emptyArray_sortsInPlace() {
        Integer[] a = {};

        SortingUtility.shellSort(a);

        assertArrayEquals(new Integer[]{}, a);
    }

    @Test
    @DisplayName("Shell Sort handles a single element array")
    void shellSort_singleElement_sortsInPlace() {
        Integer[] a = {5};

        SortingUtility.shellSort(a);

        assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    @DisplayName("Shell Sort sorts reverse sorted integers")
    void shellSort_reverseSorted_sortsInPlace() {
        Integer[] a = {5, 4, 3, 2, 1};

        SortingUtility.shellSort(a);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    @DisplayName("Shell Sort sorts duplicate integers")
    void shellSort_duplicates_sortsInPlace() {
        Integer[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        SortingUtility.shellSort(a);

        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, a);
    }

    @Test
    @DisplayName("Shell Sort works with String Comparable objects")
    void shellSort_stringArray_sortsInPlace() {
        String[] a = {"zebra", "apple", "mango", "banana"};

        SortingUtility.shellSort(a);

        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, a);
    }
}
