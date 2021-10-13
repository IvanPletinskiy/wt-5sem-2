package com.handen.wt2.domain;

public abstract class Appliance {
    int price;

    public Appliance(int price) {
        this.price = price;
    }

    public Appliance() {}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
