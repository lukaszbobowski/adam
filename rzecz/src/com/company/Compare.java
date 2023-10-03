package com.company;

public class Compare<T extends Comparable> {
    public Compare() {

    }
    public void compareValues(T a, T b) {
        if(a.compareTo(b) > 0) {
            System.out.println(a + " jest wieksze od " + b);
        } else if(a.compareTo(b) == 0) {
            System.out.println(a + " jest rowne " + b);
        } else System.out.println(a + " jest mniejsze od " + b);
    }
    /*public void compareValues(int a, int b) {
        if(a > b) {
            System.out.println(a + " jest wieksze od " + b);
        } else if(a == b) {
            System.out.println(a + " jest rowne " + b);
        } else System.out.println(a + " jest mniejsze od " + b);
    }
    public void compareValues(float a, float b) {
        if(a > b) {
            System.out.println(a + " jest wieksze od " + b);
        } else if(a == b) {
            System.out.println(a + " jest rowne " + b);
        } else System.out.println(a + " jest mniejsze od " + b);
    }
    public void compareValues(double a, double b) {
        if(a > b) {
            System.out.println(a + " jest wieksze od " + b);
        } else if(a == b) {
            System.out.println(a + " jest rowne " + b);
        } else System.out.println(a + " jest mniejsze od " + b);
    }
    public void compareValues(byte a, byte b) {
        if(a > b) {
            System.out.println(a + " jest wieksze od " + b);
        } else if(a == b) {
            System.out.println(a + " jest rowne " + b);
        } else System.out.println(a + " jest mniejsze od " + b);
    }
    public void compareValues(String a, String b) {
        if(a.compareTo(b) > 0) {
            System.out.println(a + " jest wieksze od " + b);
        } else if(a.compareTo(b) == 0) {
            System.out.println(a + " jest rowne " + b);
        } else System.out.println(a + " jest mniejsze od " + b);
    }*/
}
