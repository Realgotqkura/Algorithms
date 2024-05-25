package Algorithms.Sorting;

import java.util.Arrays;

public class InsertionSort {


    public static int[] insertionSortInt(int[] arr){
      for(int i = 1; i < arr.length; i++){
          int iter = 0;
          for(int j = i - 1; j >= 0; j--){
              //System.out.println("Before State: [index: " + i + ", index + iter: " + (i-iter) + ", index2: " + j + "]: " + Arrays.toString(sortedArr));
              if(arr[i - iter] < arr[j]){
                  int pastNum = arr[j];
                  arr[j] = arr[i - iter];
                  arr[i - iter] = pastNum;

                  if(i - (iter+1) >= 0){
                      iter++;
                  }
              }
              //System.out.println("Current State: [index: " + i + ", index + iter: " + (i-iter) + ", index2: " + j + "]: " + Arrays.toString(sortedArr));
          }
      }
      return arr;
    }

    public static int[] InsertionSortIntDebug(int[] arr){
        int totalOperations = 0;
        long time0 = System.currentTimeMillis();
        long nanoTime0 = System.nanoTime();
        for(int i = 1; i < arr.length; i++){

            int iter = 0;
            for(int j = i - 1; j >= 0; j--){
                totalOperations++;
                //System.out.println("Before State: [index: " + i + ", index + iter: " + (i-iter) + ", index2: " + j + "]: " + Arrays.toString(sortedArr));
                if(arr[i - iter] < arr[j]){
                    int pastNum = arr[j];
                    arr[j] = arr[i - iter];
                    arr[i - iter] = pastNum;

                    if(i - (iter+1) >= 0){
                        iter++;
                    }
                }
                //System.out.println("Current State: [index: " + i + ", index + iter: " + (i-iter) + ", index2: " + j + "]: " + Arrays.toString(sortedArr));
            }
        }
        long time1 = System.currentTimeMillis();
        long nanoTime1 = System.nanoTime();


        System.out.println("----------------Debug--------------");
        System.out.println("Total Operations: " + totalOperations);
        System.out.println("Total Elements: " + arr.length);
        System.out.println("Time Elapsed (Milliseconds): " + (time1 - time0) + "ms");
        System.out.println("Time Elapsed (Nanoseconds): " + (nanoTime1 - nanoTime0) + "ns");
        System.out.println("");
        return arr;
    }
}
