package com.mphasis.main.cui;

class Runner implements Runnable {
    String name; // name of thread
    Thread t;

    Runner(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }

    // This is the entry point for thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}

class DemoJoin {
    public static void main(String args[]) {
        Runner runner1 = new Runner ("One");
        Runner runner2= new Runner ("Two");
        Runner runner3= new Runner ("Three");

        System.out.println("Thread One is alive: "
                + runner1.t.isAlive());
        System.out.println("Thread Two is alive: "
                + runner2.t.isAlive());
        System.out.println("Thread Three is alive: "
                + runner3.t.isAlive());
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.xxxxx();
            ob2.t.xxxxx();
            ob3.t.xxxxx();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread One is alive: "
                + runner1.t.isAlive());
        System.out.println("Thread Two is alive: "
                + runner2.t.isAlive());
        System.out.println("Thread Three is alive: "
                + runner3.t.isAlive());

        System.out.println("Main thread exiting.");
    }
}