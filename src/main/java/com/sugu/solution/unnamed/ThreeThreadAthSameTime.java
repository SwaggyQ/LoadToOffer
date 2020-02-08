package com.sugu.solution.unnamed;

import java.util.concurrent.CountDownLatch;

/**
 * @author: create by sugu
 * @date:2019/7/27
 * @link:
 */
public class ThreeThreadAthSameTime {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Thread a = new MyThread("ThreadA",countDownLatch);
        Thread b = new MyThread("ThreadB",countDownLatch);

        Thread c = new MyThread("ThreadC",countDownLatch);
        a.start();
        b.start();
        c.start();
    }
    static class MyThread extends Thread{
        private CountDownLatch countDownLatch = null;

        public MyThread(String name, CountDownLatch countDownLatch) {
            super(name);
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {

            super.run();
            countDownLatch.countDown();
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread:[" + getName() + "] start at " + System.currentTimeMillis());
        }
    }
}
