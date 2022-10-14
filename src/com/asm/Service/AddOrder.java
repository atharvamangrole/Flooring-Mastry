package com.asm.Service;

import com.asm.UI.UIError;
import com.asm.UI.AddOrderUI;

import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class AddOrder {
    public static String askDate() throws ParseException {
        AddOrderUI aOUI = new AddOrderUI();

        String inputString1 = aOUI.addOUI();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        String inputString2 = formatter.format(date);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime date1 = LocalDate.parse(inputString1, dtf).atStartOfDay();
        LocalDateTime date2 = LocalDate.parse(inputString2, dtf).atStartOfDay();
        int daysBetween = (int) Duration.between(date1, date2).toDays();
        if (daysBetween<=0){
            //check if this method terminates here or not
            UIError E2 = new UIError();
            E2.Error2();
        }
        return inputString1;
    }

    public static String askName() {
        AddOrderUI aOUI = new AddOrderUI();
        String name = aOUI.addOUI2();
        return name;
    }

    public static String askState() {
        AddOrderUI aOUI = new AddOrderUI();
        String state = aOUI.addOUI3();
        return state;
    }

    public static String askType() {
        AddOrderUI aOUI = new AddOrderUI();
        String type = aOUI.addOUI4();
        return type;
    }

    public static Double askArea() throws ParseException {
        AddOrderUI aOUI = new AddOrderUI();
        Double area = aOUI.addOUI5();
        UIError E3 = new UIError();
        Double Area = E3.Error3(area);
        return Area;
    }

    public AddOrder() throws ParseException {
    }
}
