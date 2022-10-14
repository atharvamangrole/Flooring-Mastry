package com.asm.UI;

import java.text.ParseException;
import java.util.Scanner;

public class AddOrderUI {
    public static String addOUI() throws ParseException {
        Scanner aOUIInput = new Scanner(System.in);
        System.out.println("Enter Order Date (MM/DD/YYYY): ");
        String date = aOUIInput.nextLine();
        return date;
    }
    public static String addOUI2() {
        Scanner aOUIInput2 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String aOUI2 = aOUIInput2.nextLine();
        return aOUI2;
    }
    public static String addOUI3() {
        Scanner aOUIInput3 = new Scanner(System.in);
        System.out.println("Enter your State: ");
        String aOUI3 = aOUIInput3.nextLine();
        return aOUI3;
    }
    public static String addOUI4() {
        Scanner aOUIInput4 = new Scanner(System.in);
        System.out.println("Following are the product options with their prices per square feet: ");
        System.out.println("  Wood:- 1.3");
        System.out.println("  Tile:- 1.4");
        System.out.println("  Carpet:- 0.75");
        System.out.println("Select Product: ");
        String aOUI4 = aOUIInput4.nextLine();
        return aOUI4;
    }
    public static Double addOUI5() {
        Scanner aOUIInput5 = new Scanner(System.in);
        System.out.println("Enter Area: ");
        String aOUI5 = aOUIInput5.nextLine();
        double aOUI51 = Double.parseDouble(aOUI5);
        return aOUI51;
    }
}
