package com.mphasis.main.cui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Data{
    public int id;
    public String name;
    public float salary;

    public Data(){

    }
    public Data(int id,String name,float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
}

public class Main {
    public static void main(String[] args ){
        Data data = new Data();
      try {
          FileInputStream fos = new FileInputStream("objectStore.txt");
          ObjectOutptStream oos = new obje
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      }
    }
}

class FileInputStreamDemo implements FileInputStream {
    public static void main(String args[]) throws IOException {
        int size;

        // Use try-with-resources to close the stream.
        try ( FileInputStream f =
                      new FileInputStream("./FileInputStream.java") ) {



            System.out.println("Total Available Bytes: " +
                    (size = f.available()));

            int n = size/40;
            System.out.println("First " + n +
                    " bytes of the file one read() at a time");
            for (int i=0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println("\nStill Available: " + f.available());

            System.out.println("Reading the next " + n +
                    " with one read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.err.println("couldn't read " + n + " bytes.");
            }

            System.out.println(new String(b, 0, n));
            System.out.println("\nStill Available: " + (size = f.available()));
            System.out.println("Skipping half of remaining bytes with skip()");
            f.skip(size/2);
            System.out.println("Still Available: " + f.available());

            System.out.println("Reading " + n/2 + " into the end of array");
            if (f.read(b, n/2, n/2) != n/2) {
                System.err.println("couldn't read " + n/2 + " bytes.");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nStill Available: " + f.available());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
