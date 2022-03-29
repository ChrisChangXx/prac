package com.chris.prac.fp;

import java.util.*;
import java.util.stream.Stream;

/**
 * Stream reduce演示
 *
 * 转换操作：map()，filter()，sorted()，distinct()；
 *
 * 合并操作：concat()，flatMap()；
 *
 * 并行处理：parallel()；
 *
 * 聚合操作：reduce()，collect()，count()，max()，min()，sum()，average()；
 *
 * 其他操作：allMatch(), anyMatch(), forEach()。
 *
 * @author zhangh
 * @date 2022/03/29
 */
public class StreamReduceTest {
    public static void main(String[] args) {
        //1.求和
        System.out.println(Stream.of(1, 2, 3).reduce(0, (acc, n) -> acc + n));
        Optional<Integer> optional = Stream.of(1, 2, 3).reduce((acc, n) -> acc + n);
        optional.ifPresent(System.out::println);

        //2.求积
        System.out.println(Stream.of(1, 2, 3, 4, 5).reduce(1, (acc, n) -> acc * n));
    }
}
