package com.handen.wt2.domain;

public class Laptop extends Appliance{
    private String manufacturer;

    public Laptop(String manufacturer, int price) {
        super(price);
        this.manufacturer = manufacturer;
    }

    public Laptop() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
