package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[i + array1.length] = array2[i];
        }
        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer counter = 0;
        while (counter <= index) {

        }
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] mergedArray = merge(array1, array2);
        Integer counter = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (mergedArray[i] == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Integer count = 1, tempCount;
        Integer mode = array[0];
        Integer temp;
        for (int i = 0; i < array.length - 1; i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++) {
                if (temp == array[j]) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                mode = temp;
                count = tempCount;
            }
        }
        return mode;
    }
}
