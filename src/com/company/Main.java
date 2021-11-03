package com.company;

public class Main {

    public static void main(String[] args) {
        double cathetus1, cathetus2, hypot;

        cathetus1 = 5;
        cathetus2 = 9;

        hypot = Math.sqrt((cathetus1 * cathetus1) + (cathetus2 * cathetus2));

        System.out.println("Длинна гипотенузы равна " + hypot);
    }
}
