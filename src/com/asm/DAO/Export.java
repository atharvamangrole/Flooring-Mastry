package com.asm.DAO;

import java.io.*;
import java.util.*;

public class Export{
    public static void export(File a, File b)throws Exception  {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);

        try {

            int n;

            // read() function to read the
            // byte of data
            while ((n = in.read()) != -1) {
                // write() function to write
                // the byte of data
                out.write(n);
            }
        }
        finally {
            if (in != null) {

                // close() function to close the
                // stream
                in.close();
            }
            // close() function to close
            // the stream
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");

    }

    public static void export2() throws Exception {
        String a = "orders.txt";
        // source file
        File x = new File(a);
        String b = "export.txt";
        // destination file
        File y = new File(b);
        export(x, y);
    }
}


