package com.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class Main {
    private static final Semaphore semaphore = new Semaphore(1);
    static void addInt(Integer i, Set<Integer> integerSet) {
        try {
            semaphore.acquire();
            integerSet.add(i);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized static void addInt(Integer i, List<Integer> integerList) {
        integerList.add(i);
    }

    public static void main(String[] args) throws Exception {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        Thread one = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                addInt(i, set);
                addInt(i, list);
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                addInt(i, set);
                addInt(i, list);
            }
        });

        one.start();
        two.start();

        Thread.sleep(3000);

        System.out.println(set.size());
        System.out.println(list.size());
    }
}
