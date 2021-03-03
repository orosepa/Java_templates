package com.task6.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CakeBuilder builder = new CakeBuilder();

        director.constructCheeseCake(builder);

        Cake cake = builder.getResult();
        System.out.println(cake.toString());

    }
}
