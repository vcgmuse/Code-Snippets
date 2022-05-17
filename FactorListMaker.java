package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorListMaker {
    public static int totalCount = 0;

    public static int getFactor(int value) {
        int factor = 5;
        while (factor == 4 || value % factor != 0) {
            factor--;
        }
        return factor;
    }

    public static List<Integer> returnListOfInteractions(int totalCountOfLockers) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= totalCountOfLockers; i++) {
            int factor = getFactor(i);
            answer.add(getFactorList(i, factor).size());
        }
        return answer;
    }

    public static List<Integer> returnListOfInteractions(List<Integer> integerList) {
        List<Integer> answer = new ArrayList<>();
        for (Integer num : integerList) {
            int factor = getFactor(num);
            answer.add(getFactorList(num, factor).size());
        }
        return answer;
    }

    private static List<Integer> getFactorList(int value, int factor) {
        List<Integer> tempList = new ArrayList<>();
        int counter = 1;
        if (factor == 1) {
            counter++;
            if (!tempList.contains(value)) {
                tempList.add(value);
                if (!tempList.contains(factor)) {
                    tempList.add(factor);
                }
            }
//            System.out.println(counter);
            return tempList;
        }
        for (int i = factor; i <= value && i <= value / 2; i += factor) {
            counter++;
            if (value % i == 0) {
                if (!tempList.contains(i)) {
                    tempList.add(i);
                }
                if (!tempList.contains(value / i)) {
                    tempList.add(value / i);
                }
            }
        }
        if (!tempList.contains(1)) {
            tempList.add(1);
        }
        if (!tempList.contains(value)) {
            tempList.add(value);
        }
//        System.out.println("Number of Iterations: " + counter);
        Collections.sort(tempList);
//        System.out.println(tempList);
        totalCount += counter;
        return tempList;
    }
}
