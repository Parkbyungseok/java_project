package com.grepp.oop.d_inheritance.c_before;

public class Desktop {

    private String brand;
    private String name;
    private int price;
    private String cpu;
    private boolean allInone;

    public Desktop(String brand, String name, int price, String cpu, boolean allInone) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.cpu = cpu;
        this.allInone = allInone;
    }

    public void on(){
        System.out.println(name + " 켰습니다.");
    }

    @Override
    public String toString() {
        return "Desktop{" +
            "brand='" + brand + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", cpu='" + cpu + '\'' +
            ", allInone=" + allInone +
            '}';
    }
}
