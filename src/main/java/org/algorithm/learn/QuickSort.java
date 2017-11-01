package org.algorithm.learn;

import org.algorithm.learn.util.SwapData;

/**
 * Created by yuhang.zhang on 2017/10/29.
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {2,5,1,3,6,8,4};
        quickSort(arr, 0 , arr.length-1);

        for (int a : arr){
            System.out.print(a + "\t");
        }

    }

    private static void quickSort(int[] arr, int left, int right){

        if (left < right) {

            int base = arr[left];
            int i = left;
            int j = right;

            while (i < j) {

                while (arr[j] >= base && i < j) j--;
                if (i < j) arr[i++] = arr[j];

                while (arr[i] < base && i < j) i++;
                if (i < j) arr[j--] = arr[i];

            }

            arr[i] = base;

            quickSort(arr, left, i-1);
            quickSort(arr, i+1, right);
        }
    }
}
