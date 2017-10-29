package org.algorithm.learn;

import org.algorithm.learn.util.SwapData;

/**
 * Created by yuhang.zhang on 2017/10/29.
 *
 * 冒泡排序:
 * 内层循环相邻两元素比较大小，前一个元素大则交换位置
 * 外层循环表示冒泡次数
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {3,5,2,1,4};

        for (int i = 0; i < arr.length-1; i++){
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    SwapData.swapIndex(arr, j, j+1);
                    flag = false;
                }
            }
            //未发生交换，表明已有序
            if (flag){
                break;
            }
        }

        for (int a : arr){
            System.out.print(a + "\t");
        }

    }
}
