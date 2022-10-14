package com.asm.DAO;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class editOrder {
    private static Scanner x;
    public static void remove(String orderNumber, String newID, String newname, String newState, String newtaxRate,
                              String newproductType, String newArea, String newcostPerSquareFeet,
                              String newlabourCostPerSquareFeet, String newmaterialCost, String newlabourCost,
                              String newtax, String newtotal, String newdate) {
        String tempFile = "temp.txt";
        File oldFile = new File("orders.txt");
        File newFile = new File("temp.txt");
        String ID = ""; String name = ""; String state = ""; String taxRate = ""; String productType = "";
        String Area = ""; String costPerSquareFeet = "";String labourCostPerSquareFeet = ""; String materialCost = "";
        String labourCost = ""; String tax = ""; String total = ""; String date = "";
        try{
            FileWriter fw = new FileWriter("temp.txt",true);
            BufferedWriter bf = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bf);
            x = new Scanner(new File("orders.txt"));
            x.useDelimiter("[,\n]");

            while(x.hasNext()){
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
                if(ID.equals(orderNumber)){
                    pw.println((newID+","+newname+","+newState+","+newtaxRate+","+newproductType +","+ newArea+","+
                            newcostPerSquareFeet+","+ newlabourCostPerSquareFeet+""+newmaterialCost+""+ newlabourCost+
                            ","+newtax+""+ newtotal+""+ newdate));
                }else{
                    pw.println(ID+","+name+","+state+","+taxRate+","+productType+","+Area+","+costPerSquareFeet+","+
                            labourCostPerSquareFeet+","+materialCost+","+labourCost+","+tax+","+total+","+date);
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
