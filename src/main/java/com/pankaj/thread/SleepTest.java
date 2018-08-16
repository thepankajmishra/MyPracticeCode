package com.pankaj.thread;

public class SleepTest {

  public static void main(String[] args) {
    SleepTest st = new SleepTest();
    Thread t1 = new Thread(new Runnable() {
      
      @Override
      public void run() {
        st.getSleepTest();
      }
    }, "Thread 1");
    
    Thread t2 = new Thread(new Runnable() {
      
      @Override
      public void run() {
        st.getSleepTest();
      }
    }, "Thread 2");
    
    t1.start();
    t2.start();
  }
  
  private synchronized void getSleepTest() {
    for(int i=0;i<10;i++) {
      System.out.println(Thread.currentThread().getName());
      try {
        wait(1000);
      } catch (Exception e) {
      }
    }
  }

}
