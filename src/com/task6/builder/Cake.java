package com.task6.builder;

public class Cake {
    private final CakeType type;
    private final int weight;
    private final String topping;
    private final String filling;

    public Cake(CakeType type, int weight, String topping, String filling) {
        this.type = type;
        this.weight = weight;
        this.topping = topping;
        this.filling = filling;
    }

    public CakeType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String getTopping() {
        return topping;
    }

    public String getFilling() {
        return filling;
    }

    @Override
    public String toString() {
        return "Cake type is " + type +
                ", weight is " + weight +
                " kg, topping is " + topping +
                ", filling is " + filling;
    }
}
enum CakeType {
    CHEESECAKE,
    CHOCOLATE_CAKE
}
interface Builder {
    void setCakeType(CakeType type);
    void setWeight(int weight);
    void setTopping(String topping);
    void setFilling(String filling);
}

class CakeBuilder implements Builder {

    private CakeType type;
    private int weight;
    private String topping;
    private String filling;

    @Override
    public void setCakeType(CakeType type) {
        this.type = type;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public void setFilling(String filling) {
        this.filling = filling;
    }

    public Cake getResult() {
        return new Cake(type, weight, topping, filling);
    }
}