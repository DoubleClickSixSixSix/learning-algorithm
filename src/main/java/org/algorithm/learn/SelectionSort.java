package org.algorithm.learn;

import org.algorithm.learn.util.SwapData;

/**
 * Created by yuhang.zhang on 2017/10/29.
 *
 * 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {3,5,2,1,4};

        for (int i = 0; i < arr.length-1; i++){
            //取第i个元素为最小
            int min = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            //如果min发生变化则交换
            if (min != i){
                SwapData.swapIndex(arr,min,i);
            }
        }

        for (int a :
             arr) {
            System.out.print(a + "\t");
        }

    }
}
