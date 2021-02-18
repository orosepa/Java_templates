package com.temp;

import java.util.Scanner;
import java.lang.String;


public class Main {
    @FunctionalInterface
    public interface Comparator<T> {
        int compare(T o1, T o2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Comparator <String> comparator = (s1, s2) -> {
            int sum1 = 0, sum2 = 0;
            String[] s1_num = s1.split(" ");
            String[] s2_num = s2.split(" ");

            for (String s : s1_num)
                sum1 += Integer.parseInt(s);
            for (String s : s2_num)
                sum2 += Integer.parseInt(s);

            return Math.max(sum1, sum2);
        };

        System.out.println(comparator.compare(sc.nextLine(), sc.nextLine()));
    }

}
