package com.handen.wt2.domain;

public class Freezer extends Appliance {
    private int volume;

    public Freezer(int volume, int price) {
        super(price);
        this.volume = volume;
    }

    public Freezer() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
