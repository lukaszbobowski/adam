package com.company;

public class GenericHolder<T> {
    private T a;

    public GenericHolder(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}
