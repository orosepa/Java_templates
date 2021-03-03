package com.task6.abstract_factory;

public class Main {
    public static void main(String[] args) {
        CakeFactory factory;
        factory = new CheeseCakeFactory();
        factory.createOnePiece();
    }
}
