package com.task5;


class Singleton_1 {
    private static Singleton_1 instance;

    private Singleton_1() { }

    public static Singleton_1 getInstance() {
        if (instance == null)
            instance = new Singleton_1();
        return instance;
    }
}

class Singleton_2 {
    private static Singleton_2 instance = new Singleton_2();

    private Singleton_2() { }

    public static Singleton_2 getInstance() {
        return instance;
    }
}
class Singleton_3 {
    private Singleton_3() { }

    private static class SingletonHolder {
        private final static Singleton_3 instance = new Singleton_3();
    }
    public static Singleton_3 getInstance() {
        return SingletonHolder.instance;
    }
}
class Singleton_4 {
    private static Singleton_4 instance;

    private Singleton_4() { }

    public static synchronized Singleton_4 getInstance() {
        if (instance == null)
            instance = new Singleton_4();
        return instance;
    }
}
class Singleton_5 {
    private static volatile Singleton_5 instance;

    private Singleton_5() { }

    public static Singleton_5 getInstance() {
        if (instance == null)
            synchronized (Singleton_5.class) {
            if (instance == null)
                instance = new Singleton_5();
            }
        return instance;
    }
}

public class Main {
    public static boolean checkInstance(Object o1, Object o2) {
        return o1 == o2;
    }

    public static void main(String [] args) {
        Singleton_1 s11 = Singleton_1.getInstance();
        Singleton_1 s12 = Singleton_1.getInstance();

        Singleton_2 s21 = Singleton_2.getInstance();
        Singleton_2 s22 = Singleton_2.getInstance();

        Singleton_3 s31 = Singleton_3.getInstance();
        Singleton_3 s32 = Singleton_3.getInstance();

        Singleton_4 s41 = Singleton_4.getInstance();
        Singleton_4 s42 = Singleton_4.getInstance();

        Singleton_5 s51 = Singleton_5.getInstance();
        Singleton_5 s52 = Singleton_5.getInstance();


        System.out.println("St_1\tSt_2\tSt_3\tSt_4\tSt_5");
        System.out.print(checkInstance(s11, s12) + "\t" + checkInstance(s21, s22) + "\t" + checkInstance(s31, s32) + "\t" +
                checkInstance(s41, s42) + "\t" + checkInstance(s51, s52) + "\t");

    }
}
