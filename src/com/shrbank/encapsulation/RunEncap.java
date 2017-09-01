package com.shrbank.encapsulation;

/**
 * Created by lilei on 2017/7/3.
 */
public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Jon");
        encap.setIdNum("Night's Watch");
        encap.setAge(18);

        System.out.println("Name:" + encap.getName() + " IdNum: " + encap.getIdNum() + " Age: " + encap.getAge());
    }
}
