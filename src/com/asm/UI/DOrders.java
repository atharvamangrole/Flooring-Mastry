package com.asm.UI;

import java.util.Scanner;

public class DOrders {
    public static String Date() {
        Scanner aOUIInput = new Scanner(System.in);
        System.out.println("Enter Order Date (MM/DD/YYYY): ");
        String date = aOUIInput.nextLine();
        return date;
    }
}
