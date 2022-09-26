package com.lakshit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] arr) {
//        int[] sum = new int[]{arr.length};
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}
