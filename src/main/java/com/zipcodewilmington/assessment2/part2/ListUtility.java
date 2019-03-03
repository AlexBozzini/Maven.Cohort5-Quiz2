package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ListUtility {
    private ArrayList<Integer> list = new ArrayList<>();
    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        HashSet<Integer> set = new HashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);
        return uniqueList;
    }

    public String join() {
        String joinedList = "";
        if (list.size() == 1) {
            joinedList += list.get(0);
            return joinedList;
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                joinedList += list.get(i) + ", ";

            }
            joinedList += list.get(list.size() - 1);
            return joinedList;
        }
    }

    public Integer mostCommon() {
        Integer common = list.get(0);
        int commonCount = countOccurrence(common);

        for (Integer currentNumber : list){
            int currentCount = countOccurrence(currentNumber);
            if (currentCount > commonCount){
                common = currentNumber;
                commonCount = currentCount;
            }
        }
        return common;
    }

    private int countOccurrence(Integer valueToCount){
        int count = 0;

        for (Integer currentValue : list){
            if (currentValue == valueToCount){
                count++;
            }
        }
        return count;
    }


    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
