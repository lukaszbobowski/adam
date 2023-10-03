package com.company;

public class Main {

    public static void main(String[] args) {
       /* LiczbaHolder lh1 = new LiczbaHolder();
        LiczbaHolder lh2 = new LiczbaHolder();
        System.out.println(lh1.getA());
        lh1.setA(10);
        System.out.println(lh1.getA());
        ///////////////
        GenericHolder gh1 = new GenericHolder(123);
        System.out.println(gh1.getA());
        gh1.setA(321);
        System.out.println(gh1.getA());
        ///////////////
        GenericHolder oh1 = new GenericHolder(123);
        System.out.println(oh1.getA());
        gh1.setA(333);
        System.out.println(oh1.getA()); */
        Car car1 = new Car("BMW", 22, 22, 22);
        Car car2 = new Car("AUDISZ", 33, 33, 33);


        Compare a = new Compare();
        a.compareValues("aaa", "aa");
        a.compareValues(3232, 333);
        a.compareValues(1.1d, 2.1d);
        a.compareValues(car1, car2);
    }
}
