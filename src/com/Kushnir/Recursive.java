package com.Kushnir;

public class Recursive {
    public static int factorialRecursive(int n){

        if (n < 0) {
            return 0;
        }
        int result = 1;
        if (n == 0 || n == 1) {
            return result;
        }
        return n * factorialRecursive(n - 1);

    }
}

