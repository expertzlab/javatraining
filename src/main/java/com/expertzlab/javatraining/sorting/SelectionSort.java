package com.expertzlab.javatraining.sorting;

/**
 * Created by gireeshbabu on 07/06/17.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] list = {23, 45, 12, 34, 45};
        int lo = 0;
        int high = 4;
        selectionsort(list, lo, high);
        for (int x : list){
            System.out.println(x+",");
        }

    }

    public static void selectionsort(int[] list, int lo, int hi){
        for(int h = lo; h < hi; h++){
            int s =  getsmallest(list, h, hi);
            swap(list,h,s);
        }
    }

    private static void swap(int[] list, int i, int j) {
        int hold = list[i];
        list[i] = list[j];
        list[j] = hold;
    }

    private static int getsmallest(int[] list, int lo, int hi) {
        int small = lo;
        for(int h=lo + 1; h < hi; h++ ){
            if(list[h] < list[small]){
                small = h;
            }
        }
        return small;
    }
}
