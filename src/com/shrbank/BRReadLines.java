package com.shrbank;

/**
 * Created by lilei on 2017/6/29.
 */
import java.io.*;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        String s;
        // 使用System.in 创建BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit!");

        do {
            s = br.readLine();
            System.out.println(s);
        } while (!s.equals("end"));
    }
}
