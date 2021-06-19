package com.company.aaa;

/**
 * @author lilei
 * @date 2020-12-27 下午4:37
 * @apiNote
 */

public class Demo02 {

    public static void main(String[] args) {
        // java 没出现过，相等
        String string1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(string1.intern() == string1);

        // java 已经出现过，不相等
        String string2 = new StringBuilder("ja").append("va").toString();
        System.out.println(string2.intern() == string2);
    }
}
