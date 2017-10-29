package org.algorithm.learn;

import org.algorithm.learn.util.SwapData;

/**
 * Created by yuhang.zhang on 2017/10/29.
 *
 * 插入排序:
 * 取出数组元素，比较，若小插入前面
 * 与排好的各个元素比较并插入
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {3,5,2,1,4};

        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    SwapData.swapIndex(arr,j,j-1);
                }
            }
        }

        for (int a : arr) {
            System.out.print(a + "\t");
        }
    }

}
