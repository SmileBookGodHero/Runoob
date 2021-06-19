package com.company.aaa;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lilei
 * @date 2020-12-27 下午4:34
 * @apiNote
 */

public class Demo01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i).intern());
        }
    }
}
