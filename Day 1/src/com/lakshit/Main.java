package com.lakshit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while(n > 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
    }

}
