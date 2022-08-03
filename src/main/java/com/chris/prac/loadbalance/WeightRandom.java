package com.chris.prac.loadbalance;

import java.util.ArrayList;
import java.util.List;

public class WeightRandom {
    public static String getServer() {
        List<String> list = new ArrayList<>();
        for (String s : ServerIps.WEIGHT_LIST.keySet()) {
            Integer integer = ServerIps.WEIGHT_LIST.get(s);
            for (Integer i = 0; i < integer; i++) {
                list.add(s);
            }
        }
        java.util.Random random = new java.util.Random();
        int pos = random.nextInt(list.size());
        return list.get(pos);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getServer());
        }
    }
}
