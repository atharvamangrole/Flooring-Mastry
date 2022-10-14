package com.asm.DTO;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadO {

    //ID
    public static String readO() {
        String file = "orders.txt";
        List<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            //Some error logging
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String e = String.valueOf(content.get(content.size() - 1));
        return e;

    }

    //TaxRate
    public static @NotNull Double TR(String s) {
        String file = "Taxes.txt";
        List<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            //Some error logging
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = content.indexOf(s);
        int index2 = index + 2;
        String I = String.valueOf(content.get(index2));
        Double TaxRate = Double.parseDouble(I);
        return TaxRate;
    }

    //CostPerSquareFeet
    public static @NotNull Double CPSF(String t) {
        String file = "Product.txt";
        List<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            //Some error logging
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = content.indexOf(t);
        int index2 = index + 1;
        String I = String.valueOf(content.get(index2));
        Double CostSF = Double.parseDouble(I);



        return CostSF;

    }

    //LabourCostPerSquareFeet
    public static @NotNull Double LCPSF(String t) {
        String file = "Product.txt";
        List<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            //Some error logging
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index = content.indexOf(t);
        int index2 = index + 2;
        String I = String.valueOf(content.get(index2));
        Double LCostSF = Double.parseDouble(I);



        return LCostSF;

    }

}
