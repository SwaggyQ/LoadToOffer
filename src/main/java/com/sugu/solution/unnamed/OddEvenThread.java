package com.sugu.solution.unnamed;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: create by sugu
 * @date:2019/8/1
 * @link:
 */
class MyOEThread extends Thread{
    boolean odd = true;
    private AtomicInteger atomicInteger;
    private Object lock;

    public MyOEThread(String name, boolean odd, AtomicInteger atomicInteger, Object lock) {
        super(name);
        this.odd = odd;
        this.atomicInteger = atomicInteger;
        this.lock = lock;
    }



    @Override
    public void run() {
        super.run();
        synchronized (lock){
            while(true){
                if(atomicInteger.get() % 2 != 0){
                    if(odd){
                        System.out.println("OddThread: " + atomicInteger.get());
                        atomicInteger.incrementAndGet();
                        lock.notifyAll();
                    }else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }else {
                    if(!odd){
                        System.out.println("EvenThread: " + atomicInteger.get());
                        atomicInteger.incrementAndGet();
                        lock.notifyAll();
                    }else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if(atomicInteger.get() == 100){
                    break;
                }
            }
        }


    }
}
public class OddEvenThread {
    public static void main(String[] args) {
        Object lock = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        MyOEThread oddThread = new MyOEThread("OddThread",true,atomicInteger,lock);
        MyOEThread evenThread = new MyOEThread("EvenThread",false,atomicInteger,lock);
        oddThread.start();
        evenThread.start();
    }
}
