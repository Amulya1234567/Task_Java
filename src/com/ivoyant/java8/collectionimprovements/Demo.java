package com.ivoyant.java8.collectionimprovements;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> goalsList = new ArrayList<>(Arrays.asList(5,7,2,3,4));

        Map<String,Integer> map=new HashMap<>();
        map.put("Amulya",24);
        map.put("Dishware",23);
        map.put("Abi",18);
        map.put("Arjun",24);
        map.put("Manse",24);
        map.put("deeps",22);

        goalsList.forEach(goal-> System.out.println(goal));

        map.forEach((key,value)-> System.out.println(key));

        Integer goalsByDeeps = map.getOrDefault("deeps", 25);
        System.out.println(goalsByDeeps);

        goalsList.removeIf(goal -> goal < 5);
        System.out.println("Goals >= 5: " + goalsList);

        goalsList.sort(Comparator.reverseOrder());
        System.out.println("Sorted (Descending) Goals: " + goalsList);

        map.putIfAbsent("Varshini",23);
        System.out.println(map);

        goalsList.sort((s1, s2) -> s1.compareTo(s2)); // or simply
        goalsList.sort(Comparator.naturalOrder());
        System.out.println(goalsList);

    }
}
