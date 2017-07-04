package com.shrbank.datastructure;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by lilei on 2017/7/4.
 * 栈是Vector的一个子类，它实现了一个标准的后进先出的栈
 * 堆栈只定义了默认构造函数，用来创建一个空栈。
 * 堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。
 */
public class StackDemo {
    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
//        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
