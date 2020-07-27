package com.sugu.solution.concurrent;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

/**
 * @author: Gu Quanye
 * @Date: 2020/7/27 11:07 上午
 * @Number:
 * @Link:
 */
public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Executor executor = Executors.newFixedThreadPool(10);
        //forkJoinPoolTask(list);
        completeFutureTask(list,executor);
    }

    private static void completeFutureTask(List<Integer> list, Executor executor) {
        long start,end;
        start = System.currentTimeMillis();
        List<CompletableFuture<Void>> futures = list.stream()
                .map(i -> CompletableFuture.runAsync(() ->{
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("ThreadId: " + Thread.currentThread().getId()+ " sout : "+ i);
                    },executor)).collect(Collectors.toList());
        futures.stream().map(i -> i.join()).collect(Collectors.toList());
        end = System.currentTimeMillis();
        System.out.println("cost :" + (end - start));
    }

    private static void forkJoinPoolTask(List<Integer> list) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(10);

        long start,end;
        start = System.currentTimeMillis();
        forkJoinPool.submit(() ->list.parallelStream().forEach(i -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ThreadId: " + Thread.currentThread().getId()+ " sout : "+ i);
        })).join();
        end = System.currentTimeMillis();
        System.out.println("cost :" + (end - start));
    }
}
