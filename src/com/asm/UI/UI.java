package com.asm.UI;

import java.util.Scanner;

public class UI {

    public double intialOutputUI(){
        //Initial Output
        System.out.println("**************************************************");
        System.out.println("* <<Flooring Mastery>>");
        System.out.println("* 1. Display Orders");
        System.out.println("* 2. Add an Order");
        System.out.println("* 3. Edit an Order");
        System.out.println("* 4. Remove an Order");
        System.out.println("* 5. Export all Data");
        System.out.println("* 6. Quit");
        System.out.println("**************************************************");

        Scanner iniUI = new Scanner(System.in);
        System.out.println("Please select an option number: ");
        String iUI = iniUI.nextLine();

        double initialUI = Double.parseDouble(iUI);
        return initialUI;
    }
}
