package com.task6.prototype;

import java.util.Objects;

public class ChocolateCake extends Cake {
    public String filling;

    public ChocolateCake() {}

    public ChocolateCake(ChocolateCake target) {
        super(target);
        if (target != null)
            this.filling = target.filling;
    }

    @Override
    public Cake clone() {
        return new ChocolateCake(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ChocolateCake) || !super.equals(obj))
            return false;
        ChocolateCake cake2 = (ChocolateCake) obj;
        return Objects.equals(filling, cake2.filling);
    }

    @Override
    public String toString() {
        return "ChocolateCake{" +
                "filling='" + filling + '\'' +
                ", delivery=" + delivery +
                ", weight=" + weight +
                '}';
    }
}
