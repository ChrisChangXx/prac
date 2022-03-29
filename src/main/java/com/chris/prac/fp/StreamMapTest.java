package com.chris.prac.fp;

import java.util.ArrayList;

/**
 * Stream中map方法演示
 *
 * @author zhangh
 * @date 2022/03/29
 */
public class StreamMapTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("  Apple ");
        list.add(" pear ");
        list.add(" ORANGE");
        list.add(" BaNaNa ");
        list.stream().map(String::trim).map(String::toLowerCase).forEach(System.out::println);
    }
}
