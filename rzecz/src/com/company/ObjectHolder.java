package com.company;

public class ObjectHolder<Object> {
    private Object a;

    public ObjectHolder(Object a) {
        this.a = a;
    }

    public Object getA() {
        return a;
    }

    public void setA(Object a) {
        this.a = a;
    }
}