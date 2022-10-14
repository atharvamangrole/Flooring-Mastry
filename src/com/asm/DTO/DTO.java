package com.asm.DTO;

//Display Orders

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DTO {
    public static void dto() {
        String line = "";
        String splitBy = ",";
        try
        {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("orders.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] employee = line.split(splitBy);    // use comma as separator
                System.out.println("Order Number: " + employee[0] + ", Customer Name: " + employee[1] + ", State: "
                        + employee[2] + ", Tax Rate: " + employee[3] + ", Product Type: " + employee[4] + ", Area: "
                        + employee[5] + ", Cost Per Square Feet "+employee[6]+", Labour Cost Per Square Feet: "
                        + employee[7] + ", Material Cost: " + employee[8]+", Labour Cost: "+employee[9]+", Tax: "
                        + employee[10] + ", Total: "+ employee[11]);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
