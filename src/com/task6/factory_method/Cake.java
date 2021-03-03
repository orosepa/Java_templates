package com.task6.factory_method;

import java.util.ArrayList;
import java.util.List;

abstract class Cake {
    String name;
    List<String> additives = new ArrayList<>();

    @Override
    public String toString() {
        return "Your cake: " + name + ", additives: " + additives ;
    }
}

abstract class CakeFactory {
    public abstract Cake createCake();
}

class CheeseCakeFactory extends CakeFactory {
    public Cake createCake() {
        return new Cheesecake();
    }
}
class ChocolateCakeFactory extends CakeFactory {
    public Cake createCake() {
        return new ChocolateCake();
    }
}
class Cheesecake extends Cake {
    public Cheesecake() {
        name = "Cheesecake";
        additives.add("Strawberry");
        additives.add("Vanilla");
    }
}
class ChocolateCake extends Cake {
    public ChocolateCake() {
        name = "Chocolate Cake";
        additives.add("Cherry");
        additives.add("Cocoa");
    }
}
