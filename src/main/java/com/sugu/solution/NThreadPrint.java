package com.sugu.solution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: create by sugu
 * @date:2019/8/1
 * @link:
 */
class NThread extends Thread{
    private Object lock;
    private int curThreadNum;
    private int threadCount;
    volatile private static int addNum = 0;
    private int printCut = 0;
    public NThread(String name, Object lock, int curThreadNum, int threadCount) {
        super(name);
        this.lock = lock;
        this.curThreadNum = curThreadNum;
        this.threadCount = threadCount;
        ExecutorService service = Executors.newFixedThreadPool(1);
    }

    @Override
    public void run() {
        super.run();
        try{
            synchronized (lock){
                while(true){
                    if(addNum % threadCount == curThreadNum){
                        System.out.println(Thread.currentThread().getName() + " print " + addNum);
                        addNum++;
                        printCut++;
                        lock.notifyAll();
                        if(printCut == 10){
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
public class NThreadPrint {
    public static void main(String[] args) {
        int threadCount = 10;
        Object lock = new Object();
        for (int i = threadCount;i>=0;i--){
            new NThread("Thread[" + i + "]" ,lock,i,threadCount).start();
        }
    }
}
