package org.example;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);
            sort(left);
            sort(right);
            merge(left, right, arr);
        }
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < nR) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}