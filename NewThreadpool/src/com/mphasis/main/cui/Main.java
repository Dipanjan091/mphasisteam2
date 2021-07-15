package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

class Point<T> {
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
}

     class Task implements Callable<Point> {

    AtomicInteger counter;

    Task() {
        counter = new AtomicInteger(1);
    }

    public Point call() throws Exception {
        System.out.println(Thread.currentThread());
        Thread.sleep(0500);

        return new Point(counter.getAndIncrement(), counter.getAndIncrement());
    }
}
        public class Main {

            public static void main(String[] args) {
                int vCPU = Runtime.getRuntime().availableProcessors();
                ExecutorService service = Executors.newFixedThreadPool(vCPU);
                ArrayList<Future> allFutures = new ArrayList<Future>();
                Task task = new Task();
                //Future<Point> future;
                for(int counter=0; counter<4;counter++) {
                    allFutures.add(service.submit(task));
                }
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

                //Point<Integer> point1 = new Point(2, 4);
                //System.out.println(point1);
                //Point<Float> point2 = new Point<>(2.2f, 4.5f);
                //System.out.println(point2);

            }
        }

