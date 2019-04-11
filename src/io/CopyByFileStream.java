package io;

import java.io.*;

/**
 * @Author: Fly
 * @Description: Use fileStream to copy files
 * @Date: 2019/2/25 16:01
 * @Modified By:
 */
public class CopyByFileStream {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\crab\\Desktop\\20180726-20190102大学计算机—计算思维导论成绩(全部) (1).xlsx");
        File file2 = new File("C:\\Users\\crab\\Desktop\\b.xlsx");
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        byte[] bytes = new byte[1024];
        int i = 0;
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            ++i;
            fos.write(bytes);
        }
        System.out.println("复制完毕"+i);
        fis.close();
        fos.close();

    }
}
