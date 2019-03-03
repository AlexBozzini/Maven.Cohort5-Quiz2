package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {
    Map<String, String> router = new TreeMap<>();
    public void add(String path, String controller) {
        router.putIfAbsent(path, controller);
    }

    public Integer size() {

        return router.size();
    }

    public String getController(String path) {

        return router.get(path);
    }

    public void update(String path, String studentController) {
        router.put(path, studentController);
    }

    public void remove(String path) {
        router.remove(path);
    }

    public String toString(){
        String result = "";
        Set<Map.Entry<String, String>> entries = router.entrySet();

        for(Map.Entry<String, String> e : entries){
            String format = e.getKey() + " -> " + e.getValue() + "\n";
            result += format;
        }
        return result;
        }
    }
