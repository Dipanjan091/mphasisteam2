package com.mphasis.main.cui;

/*public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo {
    public static void main(String args[]) throws IOException {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";
        byte buf[] = source.getBytes();

        // Use try-with-resources to close the files.
        try (FileOutputStream f0 = new FileOutputStream("file1.txt");
             FileOutputStream f1 = new FileOutputStream("file2.txt");
             FileOutputStream f2 = new FileOutputStream("file3.txt") )
        {

            // write to first file
            for (int i=0; i < buf.length; i += 2) f0.write(buf[i]);

            // write to second file
            f1.write(buf);

            // write to third file
            f2.write(buf, buf.length-buf.length/4, buf.length/4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            System.out.println("An I/O Error Occured");
        }
    }
}