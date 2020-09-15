package com.company.abc;

import java.io.*;

/**
 * @author lilei
 */
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
