package com.task6.builder;

public class Director {
    public void constructCheeseCake(Builder builder) {
        builder.setCakeType(CakeType.CHEESECAKE);
        builder.setWeight(1);
        builder.setTopping("Strawberry");
    }
    public void constructChocolateCake(Builder builder){
        builder.setCakeType(CakeType.CHOCOLATE_CAKE);
        builder.setWeight(3);
        builder.setTopping("Cocoa");
        builder.setFilling("Cherry");
    }
}
