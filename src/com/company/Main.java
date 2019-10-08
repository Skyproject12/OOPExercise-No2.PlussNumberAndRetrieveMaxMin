package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static Integer setMin(List<Integer> list) {

        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }

    public static int setMax(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listSum = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum = 0;
        for (int k = 0; k < list.size(); k++) {
            sum = 0;
            for (int i = 0; i < list.size(); i++) {
                ArrayList<Integer> maxlist = new ArrayList<>();
                int index = 0;
                index = random.nextInt(list.get(i));
                sum += list.get(index);
                System.out.print(list.get(index));
                System.out.print(",");
            }
            //ArrayList<Integer> listSum = new ArrayList<>();
            System.out.println("hasil" + sum);
            listSum.add(sum);
        }
        System.out.println("min value" + setMin(listSum));
        System.out.println("max value" + setMax(listSum));
    }

}
