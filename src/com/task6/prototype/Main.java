package com.task6.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cake> cakes = new ArrayList<>();

        Cheesecake cheesecake = new Cheesecake();
        cheesecake.delivery = true;
        cheesecake.topping = "Strawberry";
        cheesecake.weight = 1;
        cakes.add(cheesecake);
        
        Cheesecake cheesecakeCopy = (Cheesecake) cheesecake.clone();
        cakes.add(cheesecakeCopy);
        
        ChocolateCake chocolateCake = new ChocolateCake();
        chocolateCake.delivery = false;
        chocolateCake.weight = 2;
        chocolateCake.filling = "Cherry";
        cakes.add(chocolateCake);

        for (Cake cake : cakes) {
            System.out.println(cake + " Hash: " + Integer.toHexString(cake.hashCode()));
        }
    }
}
