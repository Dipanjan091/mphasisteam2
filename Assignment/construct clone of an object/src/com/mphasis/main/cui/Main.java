package com.mphasis.main.cui;

class Box {
    double width;
    double height;
    double depth;

    // construct clone of an object
    Box (Box ob) { // pass object to constructor
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;

    }

    // constructor used when all dimensions specified


    // constructor used when no dimensions specified
    Box() {
        width = -1;  // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1;  // box
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

// Here, Box is extened to include weight.
class BoxWeight extends Box {
    double weight; // weight of box

    public BoxWeight(double w, double h, double d, double wei) {
        width=w;
        height=h;
        depth=d;
        weight=wei;

    }

    // constructor for BoxWeight

}

class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
    }
}