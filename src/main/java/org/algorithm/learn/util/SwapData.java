package org.algorithm.learn.util;

/**
 * Created by yuhang.zhang on 2017/10/29.
 */
public class SwapData {

    public static void swapIndex(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println("before :" + arr[0]);
        swapIndex(arr, 0,1);
        System.out.println("after :" + arr[0]);
    }
}
