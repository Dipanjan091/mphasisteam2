package com.mphasis.main.cui;

class Data{
    private int value;

    public  void getValue() {

        synchronized(this) {
            System.out.println(value);
            try {
                notify();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void setValue(int value) {
        this.value = value;
        try {
            notify();
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Task implements Runnable {
    Data data;

    public Task() {
        this.data = new Data();
    }

    @Override
    public void run() {
        for( int counter=0;counter<10;counter++) {
            Thread currThread = Thread.currentThread();
            System.out.println(currThread);
            if(currThread.getName().equals("Producer")){
                //synchronized (data) {   //lock aquired
                    data.setValue(counter);
//                    try {
//                        data.notify();
//                        data.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }//release lock
            }else if(currThread.getName().equals("Consumer")){
//                synchronized (data) {   //lock aquired
                    data.getValue();
//                    try {
//                        data.notify();
//                        data.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }//release lock
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(task,"Producer");  //NEW THREAD STATE
        Thread thread2 = new Thread(task,"Consumer");  //NEW THREAD STATE
        thread1.start();
        thread2.start();
        try {
            thread1.join(2000);
            thread2.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.isAlive()); System.out.println(thread2.isAlive());
//        Thread mainThread = Thread.currentThread();
//        System.out.println(mainThread);
//
//
//        Thread thread1 = new Thread(() -> System.out.println(Thread.currentThread()));  //NEW THREAD STATE
//        Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread()));  //NEW THREAD STATE
//
//        System.out.println(thread1.getState());
//
//        thread1.start();
//        thread2.start();
//
//        System.out.println(thread1.getState());
//        System.out.println(thread2.getState());
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(thread1.getState());
//        System.out.println(thread2.getState());
//        System.out.println("End");
    }
}
