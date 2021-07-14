package com.mphasis.main.cui;

class Point{
    public int x;
    public int y;
}

public class Main {

    public static void main(String[] args) {
	    int[][] nums;

	    nums = new int[5][];

	    nums[0] = new int[2];
        nums[1] = new int[4];
        nums[2] = new int[3];

        System.out.println(nums);
    }
}
