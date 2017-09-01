package com.shrbank;

/**
 * Created by lilei on 2017/6/30.
 * <p>
 * 多态的实例
 */

abstract class AnimalBehavior {
    abstract void eat();

}

class Cat extends AnimalBehavior {
    public void eat() {
        System.out.println("eat fish");
    }

    public void work() {
        System.out.println("catch mouse");
    }
}

class DogBehavior extends AnimalBehavior {
    public void eat() {
        System.out.println("eat bone");
    }

    public void work() {
        System.out.println("watch home");
    }
}

public class Test {

    public static void main(String[] args) {
        show(new Cat());
        show(new DogBehavior());

//        AnimalBehavior a = new Cat();
//        a.eat();
//        Cat c = (Cat)a;
//        c.work();

    }

    public static void show(AnimalBehavior a) {
        a.eat();

        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof DogBehavior) {
            DogBehavior c = (DogBehavior) a;
            c.work();
        }
    }
}
