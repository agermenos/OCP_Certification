package com.ocp.threads;

/**
 * Created by agermenos on 3/26/2017.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Counter implements Callable<String> {

    private static final int THREAD_POOL_SIZE = 2;

    // method where the thread execution takes place
    public String call() {
        return Thread.currentThread().getName() + " calling ...";
    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        // create a pool of 2 threads
        ExecutorService executor = Executors
                .newFixedThreadPool(THREAD_POOL_SIZE);

        Future<String> future1 = executor.submit(new Counter());
        Future<String> future2 = executor.submit(new Counter());

        System.out.println(Thread.currentThread().getName() + " executing ...");

        //asynchronously get from the worker threads
        System.out.println(future1.get());
        System.out.println(future2.get());

    }
}
