package com.company.datastructure;

/**
 * Created by lilei on 2017/7/3.
 * Vector 类实现了一个动态数组。和ArrayList相似，但是两者是不同的：
 * Vector是同步访问的。
 * Vector包含了许多传统的方法，这些方法不属于集合框架。
 * Vector主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况。
 * Vector类主要支持4种构造方法。
 * 第一种构造方法创建一个默认的向量，默认大小为0.
 * Vector()
 * 第二种构造方法创建指定大小的向量。
 * Vector(int size)
 * 第三种构造方法创建指定大小的向量，并且增加用incr指定，增量表示向量每次增加的元素数目。
 * Vector(int size, int incr)
 * 第四种构造方法创建一个包含集合c元素的向量
 * Vector(Collection c)
 *
 * 除了从父类继承的方法外Vector还定义了以下方法
 * void add（int index， Object element) 在此向量的指定位置插入指定的元素。
 * boolean add(Object o)  将指定元素添加到此向量的结尾
 * boolean add(Object o)  将指定Collection中的所有元素添加到此向量的末尾，按照指定collection的迭代器所返回的顺序添加这些元素
 */

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        // initial size is 3, increment is 2
        Vector v = new Vector(3,2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after four additions: " + v.capacity());

        v.addElement(new Double(5.45));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Double(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element: " + (Integer)v.firstElement());
        System.out.println("Last element: " + (Integer)v.lastElement());

        if (v.contains(new Integer(3))){
            System.out.println("Vector contains 3.");
        }

        // enumerate the elements in the vector.
        Enumeration vEnum = v.elements();
        while (vEnum.hasMoreElements()) {
            System.out.println(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
