package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a number to determine the factors.");
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);
        arrayList.add(6);
        arrayList.add(2350);
        arrayList.add(2349);
        arrayList.add(2348);
        arrayList.add(2347);
        arrayList.add(872324);
        FactorListMaker.returnListOfInteractions(arrayList);
    }
}

