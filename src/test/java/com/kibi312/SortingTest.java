package com.kibi312;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortingTest {

    @Test
    public void testNullCase() {
        try {
            int[] arr = null;
            Sorting.bubbleSort(arr);
        } catch (IllegalArgumentException e) {
            assertEquals("Null array on input", e.getMessage());
        }
    }

    @Test
    public void testEmptyCase(){
        int[] arr = {};
        int[] exp = {};
        Sorting.bubbleSort(arr);
        assertArrayEquals(exp, arr);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] arr = {1};
        int[] exp = {1};
        Sorting.bubbleSort(arr);
        assertArrayEquals(exp, arr);
    }

    @Test
    public void testSortedArraysCase() {
        int[] arr = {1,2,3,4};
        int[] exp = {1,2,3,4};
        Sorting.bubbleSort(arr);
        assertArrayEquals(exp, arr);
    }

}
