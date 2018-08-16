package com.pankaj.thread;

public class ThreadScheduling {

  public static void main(String[] args) {
    Thread thread1 = new Thread(new Runnable() {
      
      @Override
      public void run() {
        for(int i=0;i<10;i++) {
          System.out.println(Thread.currentThread().getName()+" Running "+ i);
        }
      }
    },"Thread 1");
    
Thread thread2 = new Thread(new Runnable() {
      
      @Override
      public void run() {
        for(int i=0;i<10;i++) {
          System.out.println(Thread.currentThread().getName()+" Running "+ i);
        }
      }
    },"Thread 2");

Thread thread3 = new Thread(new Runnable() {
  
  @Override
  public void run() {
    for(int i=0;i<10;i++) {
      System.out.println(Thread.currentThread().getName()+" Running "+ i);
    }
  }
},"Thread 3");

thread1.setPriority(9);
thread2.setPriority(8);
thread3.setPriority(7);

thread1.start();
thread2.start();
thread3.start();

System.out.println("Program ended");
}

}
