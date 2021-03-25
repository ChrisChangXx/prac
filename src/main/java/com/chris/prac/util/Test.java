package com.chris.prac.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("z");
        user1.setPass("h");
        User user2 = new User();
        user1.setName("h");
        user1.setPass("x");

        //事实证明System.identityHashCode得到的值和对象的hashCode方法得到的值相同
        System.out.println(System.identityHashCode(user1));
        System.out.println(System.identityHashCode(user2));
        System.out.println(user1.hashCode() == System.identityHashCode(user1));
        System.out.println(user2.hashCode() == System.identityHashCode(user2));

        //如果没有重写的话：equals和==相同，比较的都是对象的地址
        System.out.println(user1.equals(user2));
        System.out.println(user1 == user2);

        //重写equals方法的同时务必重写hashCode方法（一般情况下重写是因为要使用hashmap、hashtable、hashset等数据结构存放对象）
        //因为：如果只重写了equals方法没有重写hashCode方法的话，equals相等但是因为hashCode不等则会出现用户根据自定义相等的对象但是会在hashSet中放两份
        Set<User> set = new HashSet<>();
        set.add(user1);
        set.add(user1);
        System.out.println(set.size());
    }
}
