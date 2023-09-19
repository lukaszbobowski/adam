package com.company;

public class Main {

    public static void main(String[] args) {
        LiczbaHolder lh1 = new LiczbaHolder();
        LiczbaHolder lh2 = new LiczbaHolder();
        System.out.println(lh1.getA());
        lh1.setA(10);
        System.out.println(lh1.getA());
        ///////////////
        GenericHolder gh1 = new GenericHolder(123);
        System.out.println(gh1.getA());
        gh1.setA(321);
        System.out.println(gh1.getA());
    }
}
