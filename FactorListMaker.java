package com.company;

import java.util.ArrayList;
import java.util.List;

public class FactorListMaker {

    public static List<Integer> determineInteractions(List<Integer> integerList) {
        List<Integer> answer = new ArrayList<>();
        for (Integer num : integerList) {
            int factor = 5;
            while (factor == 4 || num % factor != 0)
                factor--;
            System.out.println(getFactorList(num, factor));
            System.out.println(getFactorList(num, factor).size());
            answer.add(getFactorList(num, factor).size());
        }
        System.out.println(answer);
        return answer;
    }

    private static List<Integer> getFactorList(int value, int factor) {
        List<Integer> tempList = new ArrayList<>();
        if (factor == 1) {
            tempList.add(factor);
            tempList.add(value);
            return tempList;
        }

        for (int i = factor; i <= value && i <= value/2; i += factor) {
            if (value % i == 0) {
                if (!tempList.contains(i)) {
                    tempList.add(i);
                }
                if (!tempList.contains(value / i)) {
                    tempList.add(value / i);
                }
            }
        }
        if (!tempList.contains(1))
            tempList.add(1);
        if (!tempList.contains(value))
            tempList.add(value);
        return tempList;
    }
}
