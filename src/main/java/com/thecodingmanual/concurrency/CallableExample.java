package com.thecodingmanual.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    Callable<String> task = () -> {
      System.out.println("Executing the callable task");
      return "Success";
    };
    ExecutorService executor = Executors.newSingleThreadExecutor();

    Future<String> future = executor.submit(task);

    String result = future.get();  // blocks until task completes
    System.out.println(result);

    executor.shutdown();
  }

}
