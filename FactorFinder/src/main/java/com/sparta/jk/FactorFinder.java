package com.sparta.jk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
- prints factors (numbers that multiply into x) of the number provided in constructor
 */
public class FactorFinder {
    public String findFactorsAsString(int number) { //returns all factors in a readable String format
        String str = "";
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                if (i * j == number){
                    str = str + " " + i + " and " + j + ",";
                }
            }
        }
        return str;
    }

    public int[] findFactorsAsArray(int number){ //returns factors in an array
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                if (i * j == number){
                    arrayList.add((int)i);
                }
            }
        }
        int[] returnableArray = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            returnableArray[i] = arrayList.get(i);
        }
        return returnableArray;
    }
}
