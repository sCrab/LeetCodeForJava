package 剑指offer;

/**
 * @Author: Fly
 * @Description: 使用静态变量只有一个的特性,不过在最开始就创建了这个静态实例，占内存
 * @Date: 2019/4/14 10:29
 * @Modified By:
 */
public class Singleton_3 {
    private static Singleton_3 instance = new Singleton_3();
    private Singleton_3() {

    }
    public static Singleton_3 getInstance() {
        return instance;
    }
}
