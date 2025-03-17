package com.grepp.oop.c_encapsulation.method;

import javax.swing.Spring;

public class Run {

    public static void main(String[] args) {
        SpringConcert springconcert = new SpringConcert();
        SummerConcert summerconcert = new SummerConcert();
        WinterConcert winterconcert = new WinterConcert();

        springconcert.startConcert();

        System.out.println("===========================");

        summerconcert.startConcert();

        System.out.println("===========================");

        winterconcert.startConcert();
    }

}
