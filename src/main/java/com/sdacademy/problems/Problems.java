package com.sdacademy.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problems {

    public static String last(List<String> list) {
       return list.get(list.size()-1);
    }

    public static Integer secondLast(List<Integer> numbers) {
        return numbers.get(numbers.size()-2);
    }

    public static int length(List<Object> objects) {
        return objects.size();
    }

    public static List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reverse = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            reverse.add(numbers.get(numbers.size()-i-1));
            }
        return reverse;
    }

    public static List<String> duplicate(List<String> list) {
        List<String> duplicate = new ArrayList<>(list);
            for (int i = 0; i < duplicate.size(); i+=2) {
            duplicate.add(i+1, duplicate.get(i));
        }
        return duplicate;
    }


//    public static List<String> randomSelect(List<String> list, int i) {
//        List<String> duplicate = new ArrayList<>();
//        Random randomNumber = new Random();
//        for (int i = 0; i < duplicate.size(); i+=2) {
//            duplicate.add(i+1, duplicate.get(i));
//        }
//        return duplicate;
//    }
}
