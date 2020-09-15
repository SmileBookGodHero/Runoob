package com.company.abc;

/**
 * Created by lilei on 2017/6/29.
 */

import java.io.*;

public class FileStreamTest2 {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(f);
        // 构建FileOutputStream对象， 文件不存在会自动创建

        OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
        // 构建OutputStreamWriter对象，参数可以指定编码，默认为操作系统默认编码

        writer.append("中文输入");
        // 写入到缓存区

        writer.append("\r\n");
        // 换行

        writer.append("English");
        // 刷新缓冲区，写入到文件

        writer.close();
        // 关闭写入流，同时把缓冲区内容写入文件

        fos.close();
        // 关闭输出流，释放系统资源

        FileInputStream fis = new FileInputStream(f);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
        // 构建InputStreamReader对象

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }

        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流

        fis.close();
        // 关闭输入流，释放系统资源
    }
}
