package Advance.MultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulingThread {
    public static void main(String[] args) {

        // Creat a Scheduled executor service with a single thread.
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        //Schedule a task to run periodically.
        executor.scheduleAtFixedRate(()-> System.out.println("Task executed at: " + System.currentTimeMillis()), 0, 1, TimeUnit.SECONDS); // Run Every 1 second.

        // wait for a while to see the output.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Shutdown the executor service.
        executor.shutdown();

//        final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//
//        final ScheduledFuture<?> beepHelper = executor.scheduleAtFixedRate(new BeepTask(), 2, 2, TimeUnit.SECONDS);
//
//        executor.schedule(new Runnable() {
//            @Override
//            public void run() {
//                beepHelper.cancel(true);
//                executor.shutdown();
//            }
//        }, 10, TimeUnit.SECONDS);
    }

//    static class BeepTask implements Runnable {
//        @Override
//        public void run() {
//            System.out.println("beep");
//        }
//    }
}
