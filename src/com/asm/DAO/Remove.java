package com.asm.DAO;

import java.io.*;
import java.util.Scanner;

public class Remove {
    private static Scanner x;

    public Remove() {
    }

    public static void remove(String orderNumber) {
        String tempFile = "temp.txt";
        File oldFile = new File("orders.txt");
        File newFile = new File("temp.txt");
        String ID = "";
        String name = "";
        String state = "";
        String taxRate = "";
        String productType = "";
        String Area = "";
        String costPerSquareFeet = "";
        String labourCostPerSquareFeet = "";
        String materialCost = "";
        String labourCost = "";
        String tax = "";
        String total = "";
        String date = "";
        try {
            FileWriter fw = new FileWriter("temp.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bf);
            x = new Scanner(new File("orders.txt"));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                name = x.next();
                state = x.next();
                taxRate = x.next();
                productType = x.next();
                Area = x.next();
                costPerSquareFeet = x.next();
                labourCostPerSquareFeet = x.next();
                materialCost = x.next();
                labourCost = x.next();
                tax = x.next();
                total = x.next();
                date = x.next();
                if (!ID.equals(orderNumber)) {
                    pw.println((ID + "," + name + "," + state + "," + taxRate + "," + productType + "," + Area + "," +
                            costPerSquareFeet + "," + labourCostPerSquareFeet + "" + materialCost + "" + labourCost +
                            "," + tax + "" + total + "" + date));
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File("orders.txt");
            newFile.renameTo(dump);

        } catch (IOException e) {
            System.out.println("There is a error. Please start again.");
        }
    }
}
