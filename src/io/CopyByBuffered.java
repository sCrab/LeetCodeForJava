package io;

import java.io.*;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/2/25 17:36
 * @Modified By:
 */
public class CopyByBuffered{
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\crab\\Desktop\\20180726-20190102大学计算机—计算思维导论成绩(全部) (1).xlsx");
        File file2 = new File("C:\\Users\\crab\\Desktop\\b.xlsx");
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int d = 0;
        while ((d = bis.read()) != -1) {
            bos.write(d);
        }
        bis.close();
        bos.close();
        fis.close();
        fos.close();
    }

}
