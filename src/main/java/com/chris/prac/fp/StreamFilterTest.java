package com.chris.prac.fp;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream中filter方法演示
 *
 * @author zhangh
 * @date 2022/03/29
 */
public class StreamFilterTest {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5, 6, 7)
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

        Stream.generate(new LocalDateSupplier())
                .limit(31)
                .filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.SATURDAY || localDate.getDayOfWeek() == DayOfWeek.SUNDAY)
                .forEach(System.out::println);
    }

    static class LocalDateSupplier implements Supplier<LocalDate> {
        LocalDate localDate = LocalDate.of(2022, 3, 1);
        int n = -1;

        @Override
        public LocalDate get() {
            n++;
            return localDate.plusDays(n);
        }
    }
}
