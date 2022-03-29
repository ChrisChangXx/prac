package com.chris.prac.fp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 参考地址：https://www.liaoxuefeng.com/wiki/1252599548343744/1305158055100449
 *
 * 通过Arrays.sort函数学习
 * 函数式编程、lambda表达式、方法引用
 *
 * FunctionalInterface允许传入：
 *
 * 1.接口的实现类（传统写法，代码较繁琐）；
 * 2.Lambda表达式（只需列出参数名，由编译器推断类型）；
 * 3.符合方法签名的静态方法；
 * 4.符合方法签名的实例方法（实例类型被看做第一个参数类型）；
 * 5.符合方法签名的构造方法（实例类型被看做返回类型）。
 *
 * @author zhangh
 * @date 2022/03/29
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] arrays = new String[]{
                "Apple", "Orange", "Banana", "Lemon"
        };

        //1.实现Comparator（单方法接口）接口
        Arrays.sort(arrays, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //2.用Lambda表达式替换单方法接口
        //接收FunctionalInterface作为参数的时候，可以把实例化的匿名类改写为Lambda表达式
        Arrays.sort(arrays, (s1, s2) -> {
            return s1.compareTo(s2);
        });

        //3.方法引用1（静态方法引用）
        Arrays.sort(arrays, LambdaTest::compare);

        //4.方法引用2（实例方法有一个隐含的this参数）
        Arrays.sort(arrays, String::compareTo);

        System.out.println(String.join(", ", arrays));

        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Tim");
        //普通new对象
        List<Person> persons1 = new ArrayList<>();
        for (String name : names) {
            persons1.add(new Person(name));
        }

        //5.方法引用3（构造方法引用）
        List<Person> persons2 = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons2);
    }

    private static int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

    static class Person {
        String name;
        public Person(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Person:" + this.name;
        }
    }
}
