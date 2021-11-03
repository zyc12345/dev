package com.zyc.design_pattern.Thread;

import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    public static void main(String[] args) {
        ThreadLocal<String> td = new ThreadLocal<>();
        td.set("123");
        // 首先定义无序数组
        int[] arr = {1,10,2};
        // 打印排序前数组
        print(arr);
        insertSortOne(arr);
        print(arr);
    }

    /**
     * 冒泡排序：0 1  1 2  2 3  4 5  5 6 按照此下标挨个对比大小将小的交换到前面
     * 这样一次循环之后最大的值肯定是在数组的最末尾，此时最末尾就不需要加入比较了，所以外层循环每次--，放过最大数
     * 因为每次都是两个数进行比较，所以内层循环从1位置开始和本身数的前一位作比较然后进行交换，循环中止界限为end也就是最大数的前一位
     * @param arr
     */
    public static void bubbleSort(int[] arr){
       int N = arr.length;
        for (int end = N-1; end >=0 ; end--) {
            for (int second =1; second<=end;second++){
                if (arr[second-1]>arr[second]){
                    swap(arr,second-1,second);
                }
            }
        }
    }

    /**
     * 0 ~ n 保证顺序，每次都是一直往前看直到不比前面小，或者最左边。
     * 外层循环从1开始的原因是因为0-0位置天然有序
     * @param arr
     */
    public static void insertSort(int[] arr){
        int N = arr.length;
        for (int i = 1;i<N;i++){
            int j = i;
            while (j-1>0&arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
    }

    public static void insertSortOne(int[] arr){
        int N = arr.length;
        for (int i = 1;i<N;i++){
           for (int pre = i-1;pre>0&arr[pre]>arr[pre+1];pre--){
               swap(arr,pre,pre+1);
           }
        }
    }

    public static void sort(int[] arr){
        // 定义最大值
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for (int j = i+1; j < N; j++) {
                minValueIndex = arr[minValueIndex]<arr[j]?minValueIndex:j;
            }
            // 如果最小值还是i的话就没必要交换了
            if (minValueIndex!=i)
                // 交换
                swap(arr,i,minValueIndex);
        }
    }

    // 交换数值，将小的值向前放（正序）降序反过来就可以了
    public static void swap(int[] arr,int i,int j){
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
