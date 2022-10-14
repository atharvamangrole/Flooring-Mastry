package com.asm.UI;

import com.asm.Controller.controller;
import com.asm.Service.AddOrder;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class UIError {
    public static void Error() throws Exception {
        //program takes user to home screen
        System.out.println("There is a error. Please start again.");
        controller againIniO = new controller();
        againIniO.initialOutput();
    }
    public static void Error2() throws ParseException {
        System.out.println("There is a error. Please start again.");
        AddOrder askD = new AddOrder();
        askD.askDate();
    }
    public static Double Error3(Double area) throws ParseException {
        if (area <= 100){
            //check if this method terminates here or not
            System.out.println("There is a error. Please start again.");
            AddOrder askA = new AddOrder();
            askA.askArea();
        }
        return area;
    }
}
