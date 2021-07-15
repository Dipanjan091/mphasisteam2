package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.CountDownLatch;

/*class Point<T> {
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}*/

class Task implements Runnable {
    CyclicBarrier barrier;
    String name;
    CountDownLatch latch;
    int duration;

    public Task(CyclicBarrier barrier, String name, int duration) {
        this.barrier = barrier;
        this.name = name;
        this.duration = duration;

    }

    public void run() {
        Logger logger = Logger.getLogger(Task.class.getName());
        logger.log(Level.INFO, Thread.currentThread() + "Stared");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();

        } catch (BrokenBarrierException e) {
            e.printStackTrace();

        }
    }
    //latch.countDown();

    // logger.log(Level.INFO, "Resuming");


    /*Task() {
        AtomicInteger counter = new AtomicInteger(1);
    }

   public Point call() throws Exception {
        System.out.println(Thread.currentThread());
        Thread.sleep(0500);


        AtomicInteger counter = new AtomicInteger();
        return new Point(counter.getAndIncrement(), counter.getAndIncrement());
    }
}
*/
    public class Main {

        public static void main(String[] args) {
            int vCPU = Runtime.getRuntime().availableProcessors();
            ExecutorService service = Executors.newFixedThreadPool(vCPU);
            CyclicBarrier barrier = new CyclicBarrier(3);
            service.execute(new Task(barrier, "Task1", 2000));

            service.execute(new Task(barrier, "Task2", 5000));

            service.execute(new Task(barrier, "Task3", 9000));

            service.shutdown();

            Logger.getLogger(Main.class.getName()).log(Level.INFO, "End of Main");

        }

    }
}
       /* CountDownLatch latch = new CountDownLatch();
        service.execute(new Task(latch, 2000));
        service.execute(new Task(latch, 3000));
        service.execute(new Task(latch, 4000));

        System.out.println("End");


        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
        Logger.getLogger(Main.class.getName()).log(Level.INFO, "End of main Thread");
    }
}
        //ArrayList<Future> allFutures = new ArrayList<Future>();
        //Task task = new Task();
        //Future<Point> future;
        /*for(int counter=0; counter<4;counter++) {
            allFutures.add(service.submit(task));
       // }
        for (Future<Point> future:allFutures)
        {
            try {
                //future = service.submit(task);
                Point point = future.get();
                System.out.println(point);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            catch (ExecutionException e){
                e.printStackTrace();
            }
        }
        service.shutdown();
        System.out.println("End");

         */
