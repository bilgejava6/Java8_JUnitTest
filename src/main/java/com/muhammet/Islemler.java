package com.muhammet;

public class Islemler {

    public int topla(int a, int b) {
        return a + b;
    }

    public double bolme(int a, int b) {
        if(b==0)
            throw new ArithmeticException("Bölen 0 olamaz");
        return a / b;
    }

}
