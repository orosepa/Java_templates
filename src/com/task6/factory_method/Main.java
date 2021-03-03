package com.task6.factory_method;

public class Main {
    public static void main(String[] args) {
        CakeFactory myCheesecakeFactory = new CheeseCakeFactory();
        CakeFactory myChocolateCakeFactory = new ChocolateCakeFactory();

        Cake myCheesecake = myCheesecakeFactory.createCake();
        Cake myChocolateCake = myChocolateCakeFactory.createCake();

        System.out.println(myCheesecake);
        System.out.println(myChocolateCake);
    }
}
