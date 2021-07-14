package com.mphasis.main.cui;

class Point{
    public int x;
    public int y;
}

public class Main {

    public static void main(String[] args) {
        Point[] points;//static
	    points = new Point[3];

	    points[0] = new Point();
	    points[0].x=2;
	    points[0].y=5;

	   for(Point Point : points){
	       if(Point!=null){
               System.out.println(Point.x + " " + Point.y);
           }
       }

        System.out.println();
    }
}
