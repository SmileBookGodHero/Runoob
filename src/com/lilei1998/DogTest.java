package com.lilei1998;

/**
 * Created by lilei on 2017/6/27.
 */

class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal{
    public void move(){
        super.move(); // 应用super类的方法
        System.out.println("狗可以跑和走");
    }
}

public class DogTest {
    public static void main(String args[]){

        Animal b = new Dog(); // Dog 对象
        b.move(); //执行 Dog类的方法

    }
}
