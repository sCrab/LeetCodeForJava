package multi_thread;

/**
 * @Author: Fly
 * @Description:
 * @Date: 2019/2/21 17:29
 * @Modified By:
 */
public class MyThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
            count--;
            System.out.println("Calculate by:" + MyThread.currentThread().getName() + " count=" + count);
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
