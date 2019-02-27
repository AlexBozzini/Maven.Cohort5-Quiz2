package com.zipcodewilmington.assessment2.part2;

import java.util.List;

public class ListUtility {
    public Boolean add(int i) {
        ListUtility listToAdd = new ListUtility();
        listToAdd.add(i);
        if (listToAdd.contains(i)) {
            return true;
        } else {
            return false;
        }
    }

    public Integer size() {
    ListUtility listSize = new ListUtility();
        return listSize.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {

        return null;
    }

    public Integer mostCommon() {

        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return null;
    }
}
