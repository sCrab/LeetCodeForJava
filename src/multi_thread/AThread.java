package multi_thread;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/2/21 17:57
 * @Modified By:
 */
public class AThread implements Runnable {
    @Override
    public void run() {
        System.out.println("AThread priority:"+ Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Runnable runnable = new AThread();
        Thread t = new Thread(runnable);
        t.start();
    }
}
