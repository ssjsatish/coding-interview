package com.thecodingmanual.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {

  public static void main(String[] args) {
    Runnable task = () -> {
      System.out.println("Executing the task");
    };
    ExecutorService executor = Executors.newSingleThreadExecutor();

    executor.execute(task);
    executor.shutdown();
  }

}
