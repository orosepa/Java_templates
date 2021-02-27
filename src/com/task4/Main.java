package com.task4;

public class Main {
    public static void main(String [] args) {
        ExecutorServiceExample ese = new ExecutorServiceExample(5);
        ese.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 5; i > 0 ; i--) {
                System.out.println(i);
            }
        });
        ese.submit(() -> {
            for (int i = 10; i > 5 ; i--) {
                System.out.println(i);
            }
        });
        ese.shutdown();
    }
}
