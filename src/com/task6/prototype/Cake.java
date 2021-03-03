package com.task6.prototype;


public abstract class Cake {
    public boolean delivery;
    public int weight;

    public Cake() {}

    public Cake(Cake target) {
        if (target != null) {
            this.delivery = target.delivery;
            this.weight = target.weight;
        }
    }
    public abstract Cake clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cake))
            return false;
        Cake cake2 = (Cake) obj;
        return cake2.delivery == delivery && cake2.weight == weight;
    }
}
