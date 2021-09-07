package com.company.utils;

/**
 * @author lilei
 * @date 2021-06-19 上午9:51
 * @apiNote
 */

public class SleepUtil {

    public static void sleepSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
