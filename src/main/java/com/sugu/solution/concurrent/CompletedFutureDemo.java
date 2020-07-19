package com.sugu.solution.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Gu Quanye
 * @Date: 2020/7/2 7:39 下午
 */
public class CompletedFutureDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> task1(),executorService);
        task1.join();
//        String val = task1.complete(null);
        System.out.println("task ending");
    }

    public static String task1(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread() + " Process task1...");
        return "task1 ";
    }

}
