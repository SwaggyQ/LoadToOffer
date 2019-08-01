package com.sugu.solution;

/**
 * @author: create by sugu
 * @date:2019/7/31
 * @link:
 */
public class ThreeThread {
    public static void main(String[] args) {
        Object lock = new Object();
        MyPrintThread a = new MyPrintThread("A",0,lock);
        MyPrintThread b = new MyPrintThread("B",1,lock);
        MyPrintThread c = new MyPrintThread("C",2,lock);
        a.start();
        b.start();
        c.start();
    }


}
class MyPrintThread extends Thread{
    private String printChar ;
    private Object lock;
    private int printInt;
    volatile private static int addSum = 0;
    private int printCnt = 0;
    private int printMax = 10;
    public MyPrintThread(String b, int i, Object lock) {
        this.printChar = b;
        this.lock = lock;
        this.printInt =  i;
    }

    @Override
    public void run() {
        try {
            while (true){
                synchronized (lock){
                    if(addSum % 3 ==printInt){
                        System.out.println(printChar);
                        addSum++;
                        printMax++;
                        printCnt++;
                        lock.notifyAll();
                        if(printCnt == 10){
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