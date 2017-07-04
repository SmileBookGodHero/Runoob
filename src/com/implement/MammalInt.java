package com.shrbank.implement;

/**
 * Created by lilei on 2017/7/3.
 */
public class MammalInt {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
