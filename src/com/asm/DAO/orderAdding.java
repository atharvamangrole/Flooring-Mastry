package com.asm.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import com.asm.DTO.ReadO;

public class orderAdding {
    public static <CSVWriter> void OADDING(String d, String n, String s, String t, Double a) throws FileNotFoundException {

        //Get ID for new order
        ReadO RO = new ReadO();
        String e = RO.readO();
        int e1 = Integer.parseInt(e);
        int e2 = e1+1;
        String id =Integer.toString(e2);

        //Get TaxRate for new Order
        ReadO RO2 = new ReadO();
        Double TR = RO2.TR(s);

        //Get CostPerSquareFeet for new Order
        ReadO RO3 = new ReadO();
        Double CPSF = RO3.CPSF(t);

        //Get LabourCostPerSquareFeet for new Order
        ReadO RO4 = new ReadO();
        Double LCPSF = RO4.LCPSF(t);

        int MC = (int) (a * CPSF);
        int LC = (int) (a * LCPSF);
        int Tax = (int) (((MC+LC)*TR)/100);
        int Total = (int) (MC+LC+Tax);

        try (PrintWriter writer = new PrintWriter("test.csv")) {

            StringBuilder sb = new StringBuilder();
            sb.append(id); // ID
            sb.append(n); // Name
            sb.append(s); // State
            sb.append(TR); // TaxRate
            sb.append(t); // ProductType
            sb.append(a); // Area
            sb.append(CPSF); // CostPerSquareFeet
            sb.append(LCPSF); // LabourCostPerSquareFeet
            sb.append(MC); // MaterialCost
            sb.append(LC); // LabourCost
            sb.append(Tax); // Tax
            sb.append(Total); // Total
            sb.append(d); // Date

            writer.write(sb.toString());

            System.out.println("Your Order has been added.");

        }
    }
}
