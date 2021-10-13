package com.handen.wt2.domain;

public class Teapot extends Appliance {
    private int power;

    public Teapot(int power, int price) {
        super(price);
        this.power = power;
    }

    public Teapot() {

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
