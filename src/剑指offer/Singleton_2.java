package 剑指offer;

/**
 * @Author: Fly
 * @Description: 单例模式终极解法
 * 定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。而类型为SingletonHolder的类，
 * 只有在Singleton.getInstance()中调用，由于私有的属性，他人无法使用SingleHolder，不调用
 * Singleton.getInstance()就不会创建实例。实现LazyLoad解法
 * @Date: 2019/4/14 10:21
 * @Modified By:
 */
public class Singleton_2 {
    private Singleton_2() {
    }
    private static class SingletonHolder{
        private final static Singleton_2 Instance = getInstance();
    }

    private static Singleton_2 getInstance() {
        return SingletonHolder.Instance;
    }
}
