package io;

import java.io.*;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/2/26 13:05
 * @Modified By:
 */
public class CopyByChar {
    public static void main(String[] args) throws IOException {
//        File file1 = new File("C:\\Users\\crab\\Desktop\\20180726-20190102大学计算机—计算思维导论成绩(全部) (1).xlsx");
        File file1 = new File("C:\\Users\\crab\\Desktop\\a.txt");
        File file2 = new File("C:\\Users\\crab\\Desktop\\b.txt");
        InputStreamReader reader = new InputStreamReader(new FileInputStream(file1));
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file2));

        char[] data = new char[4];
        int len = 0;
        while ((len = reader.read(data)) != -1) {
            System.out.print(len+":");
            for (char c : data) {
                System.out.print(c);
            }
            writer.write(data,0,len);
        }
        System.out.println("copy completed");
        reader.close();
        writer.close();
    }
}
