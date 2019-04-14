package 剑指offer;

/**
 * @Author: Fly
 * @Description: Singleton1适合单线程使用
 * @Date: 2019/4/14 10:16
 * @Modified By:
 */
public class Singleton_1 {
    private static Singleton_1 Instance = null;

    private Singleton_1() {
    }

    public static Singleton_1 getInstance() {
        if (Instance==null) Instance = new Singleton_1();
        return Instance;
    }
}
