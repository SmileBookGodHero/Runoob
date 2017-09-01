package com.shrbank.virtual;

/**
 * Created by lilei on 2017/6/30.
 *
 * main函数
 */
public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Sansa", "Winterfell", 3, 30000.00);
        Employee e = new Employee("Arya", "winterfell", 2);

//        System.out.println("使用 Salary 的引用调用 mailCheck ");
        s.mailCheck();

//        System.out.println("\n使用 Employee 的引用调用 mailCheck ");
        e.mailCheck();
    }
}
