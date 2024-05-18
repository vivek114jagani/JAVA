package Advance.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PoolThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Cast the object to its class type.
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

        // State before task execution.
        System.out.println("LARGER: " + pool.getLargestPoolSize());
        System.out.println("MAXIMUM: " + pool.getMaximumPoolSize());
        System.out.println("CURRENT: " + pool.getPoolSize());
        System.out.println("CURRENTLY EXECUTING: " + pool.getActiveCount());
        System.out.println("TOTAL: " + pool.getTaskCount());

        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());

        // State After tasks execution.
        System.out.println("core Thread: " + pool.getCorePoolSize());
        System.out.println("LARGER: " + pool.getLargestPoolSize());
        System.out.println("MAXIMUM: " + pool.getMaximumPoolSize());
        System.out.println("CURRENT: " + pool.getPoolSize());
        System.out.println("CURRENTLY EXECUTING: " + pool.getActiveCount());
        System.out.println("TOTAL: " + pool.getTaskCount());

        executor.shutdown();
    }

    static class Task implements Runnable {

        @Override
        public void run() {

            try {
                long duration = (long) (Math.random() * 5);
                System.out.println("Running task Thread Name: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(duration);

                System.out.println("Task Completed! Thread Name: " + Thread.currentThread().getName());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
