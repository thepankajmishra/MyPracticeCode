package com.pankaj.thread;

public class JoinExample {

  public static void main(String[] args) {
    
    System.out.println("Execution started...");
    Thread t = new Thread(() -> {
      for(int i=0;i<100;i++) {
        System.out.println(i);
        try {
          Thread.sleep(100);
        } catch (Exception e) {
        }
      }
    });
    
    Thread t2 = new Thread(() -> {
      for(int i=0;i<100;i++) {
        System.out.println(i);
        try {
          Thread.sleep(100);
        } catch (Exception e) {
        }
      }
    });
    
    Thread t3 = new Thread(() -> {
      for(int i=0;i<100;i++) {
        System.out.println(i);
        try {
          Thread.sleep(100);
        } catch (Exception e) {
        }
      }
    });
    
    Thread t4 = new Thread(() -> {
      for(int i=0;i<100;i++) {
        System.out.println(i);
        try {
          Thread.sleep(100);
        } catch (Exception e) {
        }
      }
    });
    t.start();
    t2.start();
    t3.start();
    t4.start();
    
    System.out.println(Thread.activeCount());
    Thread[] tArr = new Thread[Thread.activeCount()]; 
    System.out.println(Thread.enumerate(tArr));
    for(Thread thread : tArr) {
      System.out.println(thread.getName());
    }
    
//    t.start();
    /*try {
//      Thread.currentThread().join();
      t.join();
    } catch (Exception e) {
    }*/
    System.out.println("Execution ended ...");
  }

}
