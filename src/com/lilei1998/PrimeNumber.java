package com.lilei1998;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lilei on 2017/6/22.
 *
 * 输出100以内的素数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(getPrimeNumber(n));
    }

    /**
     * 把100以内的素数存到一个ArrayList集合
     *
     * 统计个数
     * */
    private static List<Integer> getPrimeNumber(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (numberIsPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * 判断一个数是不是能被1和它本身之外的数整除
     *
     * 循环条件从2开始，到这个数的开方
     * */
    private static boolean numberIsPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
