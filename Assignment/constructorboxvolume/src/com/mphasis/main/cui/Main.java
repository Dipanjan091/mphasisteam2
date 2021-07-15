package com.mphasis.main.cui;

class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box(double width, double height, double depth) {
        width = width;
        height = height;
        depth = depth;
    }
    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String args[]) {
        // declare, allocate, and initialize Box objects
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(5, 6, 9);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
    }
}
