package com.sparta.jk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FactorFinder factorFinder = new FactorFinder();
        System.out.println(factorFinder.findFactorsAsString(100)); //prints factors of number provided
        System.out.println(Arrays.toString(factorFinder.findFactorsAsArray(100))); //prints individual factors of number provided
    }
}
