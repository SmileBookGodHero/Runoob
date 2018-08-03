package com.lilei1998.virtual;

/**
 * Created by lilei on 2017/6/30.
 *
 * 继承Employee类
 */
public class Salary extends Employee {
    private double salary;
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
//        System.out.println("Salary 类的 mailCheck 方法 ");
        System.out.println("邮寄支票给：" +getName() + ", 地址为：" + getAddress() + ", 数字为：" + getNumber()+ ", 工资为：" + salary );
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

//    public double computePay() {
//        System.out.println("计算工资，付给：" + getName());
//        return salary/52;
//    }
}
