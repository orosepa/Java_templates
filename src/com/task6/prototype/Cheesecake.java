package com.task6.prototype;

import java.util.Objects;

public class Cheesecake extends Cake {
    public String topping;

    public Cheesecake() {}

    public Cheesecake(Cheesecake target) {
        super(target);
        if (target != null)
            this.topping = target.topping;
    }

    @Override
    public Cake clone() {
        return new Cheesecake(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cheesecake) || !super.equals(obj))
            return false;
        Cheesecake cake2 = (Cheesecake) obj;
        return Objects.equals(cake2.topping, topping);
    }

    @Override
    public String toString() {
        return "Cheesecake{" +
                "topping='" + topping + '\'' +
                ", delivery=" + delivery +
                ", weight=" + weight +
                '}';
    }
}

