package com.chris.prac.fp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 流
 *
 * @author zhangh
 * @date 2022/03/29
 */
public class StreamTest {
    public static void main(String[] args) throws IOException {
        //1.使用Stream.of创建Stream
        Stream<String> stream = Stream.of("A", "B", "C", "D");
        // forEach()方法相当于内部循环调用，
        // 可传入符合Consumer接口的void accept(T t)的方法引用：
        stream.forEach(System.out::println);

        //2.基于数组创建Stream
        Stream<String> stream1 = Arrays.stream(new String[]{"A", "B", "C"});
        stream1.forEach(System.out::println);

        //3.基于Collection创建Stream
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        Stream<String> stream2 = strings.stream();
        stream2.forEach(System.out::println);

        //4.基于Supplier创建Stream
        Stream<Integer> stream3 = Stream.generate(new NatualSupplier());
        // 注意：无限序列必须先变成有限序列再打印:
        stream3.limit(10).forEach(System.out::println);

        //5.基于其余API
        Stream<String> lines = Files.lines(Paths.get("D:\\study\\jdk-api\\docs\\index.html"));
        lines.forEach(System.out::println);

        @SuppressWarnings("AlibabaAvoidPatternCompileInMethod")
        Pattern p = Pattern.compile("\\s+");
        Stream<String> s = p.splitAsStream("The quick brown fox jumps over the lazy dog");
        s.forEach(System.out::println);

        //基本数据类型（泛型不支持基本数据类型，所以java提供了IntStream、LongStream和DoubleStream）
        IntStream stream4 = Arrays.stream(new int[]{1, 2, 3});
        stream4.forEach(System.out::println);

        Stream<Integer> stream5 = Stream.generate(new FibonacciSupplier());
        stream5.limit(10).forEach(System.out::println);
    }

    static class NatualSupplier implements Supplier<Integer> {
        int n = 0;

        @Override
        public Integer get() {
            n++;
            return n;
        }
    }

    /**
     * 斐波那契数列
     *
     * @author zhangh
     * @date 2022/03/29
     */
    static class FibonacciSupplier implements Supplier<Integer> {
        int a = 0;
        int b = 0;
        int c = 1;

        @Override
        public Integer get() {
            a = b;
            b = c;
            c = a + b;
            return b;
        }
    }
}
