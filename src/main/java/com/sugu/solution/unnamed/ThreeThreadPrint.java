package com.sugu.solution.unnamed;

/**
 * @author: create by sugu
 * @date:2019/7/27
 * @link:
 */
public class ThreeThreadPrint {
    public static void main(String[] args) {
        Object lock = new Object();

        MyThread a = new MyThread(lock, "A", 1);
        MyThread b = new MyThread(lock, "B", 2);
        MyThread c = new MyThread(lock, "C", 0);

        a.start();
        b.start();
        c.start();
    }
}
class MyThread extends Thread{
    private Object lock;
    private String showChar;
    private int showNumPosition;

    private int printCount = 0;

    private static int addNumber = 1;

    public MyThread(Object lock, String showChar, int showNumPosition) {
        super();
        this.lock = lock;
        this.showChar = showChar;
        this.showNumPosition = showNumPosition;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                while (true){
                    if(addNumber % 3 == showNumPosition){
                        System.out.println(showChar);
                        addNumber++;
                        printCount++;
                        lock.notifyAll();
                        if(printCount == 10){
                            break;
                        }
                    }else {
                            lock.wait();
                        }
                    }

                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
