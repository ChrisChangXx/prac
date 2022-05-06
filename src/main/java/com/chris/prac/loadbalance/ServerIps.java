package com.chris.prac.leetcode.loadbalance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServerIps {
    public static final List<String> LIST = new ArrayList<>();

    static {
        LIST.add("192.168.1.1");
        LIST.add("192.168.1.2");
        LIST.add("192.168.1.3");
        LIST.add("192.168.1.4");
        LIST.add("192.168.1.5");
        LIST.add("192.168.1.6");
        LIST.add("192.168.1.7");
        LIST.add("192.168.1.8");
        LIST.add("192.168.1.9");
        LIST.add("192.168.1.10");
    }

    public static final Map<String, Integer> WEIGHT_LIST = new HashMap<>();

    static {
        WEIGHT_LIST.put("192.168.1.1", 2);
        WEIGHT_LIST.put("192.168.1.2", 8);
        WEIGHT_LIST.put("192.168.1.3", 1);
        WEIGHT_LIST.put("192.168.1.4", 9);
        WEIGHT_LIST.put("192.168.1.5", 3);
        WEIGHT_LIST.put("192.168.1.6", 7);
        WEIGHT_LIST.put("192.168.1.7", 4);
        WEIGHT_LIST.put("192.168.1.8", 6);
        WEIGHT_LIST.put("192.168.1.9", 2);
        WEIGHT_LIST.put("192.168.1.10", 8);
    }
}
