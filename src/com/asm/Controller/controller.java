package com.asm.Controller;

import com.asm.DAO.Remove;
import com.asm.Service.AddOrder;
import com.asm.DAO.orderAdding;
import com.asm.DAO.editOrder;
import com.asm.DAO.Export;
import com.asm.UI.DOrders;
import com.asm.UI.UI;
import com.asm.UI.UIError;
import com.asm.DTO.DTO;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class controller {


    public static void initialOutput() throws Exception {
        //Calls to print initial Output
        UI iniO = new UI();
        double variable = iniO.intialOutputUI();
        //Checks if the user input for home screen is valid or not
        if (variable % 1 != 0){
            //Error when user inputs the options for the home screen
            UIError iniOerror = new UIError();
            iniOerror.Error();
        }else{
            //Valid input gets sent ahead
            if (variable >= 1  &&  variable <= 6){
                if (variable == 1){//Display Orders

                    //Get date
                    DOrders DO = new DOrders();
                    String Date = DO.Date();

                    //Go to DTO
                    DTO show = new DTO();
                    show.dto();
                }

                if (variable == 2){//Add an Order

                    //Ask Date
                    AddOrder ADO = new AddOrder();
                    String D = ADO.askDate();
                    //Ask Name
                    AddOrder ANO = new AddOrder();
                    String N = ANO.askName();
                    //Ask State
                    AddOrder ASO = new AddOrder();
                    String S = ASO.askState();
                    //Ask Type
                    AddOrder ATO = new AddOrder();
                    String T = ATO.askType();
                    //Ask Area
                    AddOrder AAO = new AddOrder();
                    Double A = AAO.askArea();
                    //Adding the order
                    orderAdding OA = new orderAdding();
                    OA.OADDING(D,N,S,T,A);
                }

                if (variable == 3){

                    Scanner S = new Scanner(System.in);
                    System.out.println("Please enter the Order Number to be edited: ");
                    String orderNumber = S.nextLine();
                    System.out.println("Please enter the new ID: ");
                    String newID = S.nextLine();
                    System.out.println("Please enter the new name: ");
                    String newname = S.nextLine();
                    System.out.println("Please enter the new state: ");
                    String newState = S.nextLine();
                    System.out.println("Please enter the new Tax Rate you want: ");
                    String newtaxRate = S.nextLine();
                    System.out.println("Please enter the new Product Type: ");
                    String newproductType = S.nextLine();
                    System.out.println("Please enter the new Area: ");
                    String newArea = S.nextLine();
                    System.out.println("Please enter the new Cost per square feet: ");
                    String newcostPerSquareFeet = S.nextLine();
                    System.out.println("Please enter the new labour cost per square feet: ");
                    String newlabourCostPerSquareFeet = S.nextLine();
                    System.out.println("Please enter the new material cost: ");
                    String newmaterialCost = S.nextLine();
                    System.out.println("Please enter the new labour cost: ");
                    String newlabourCost = S.nextLine();
                    System.out.println("Please enter the new tax: ");
                    String newtax = S.nextLine();
                    System.out.println("Please enter the new total: ");
                    String newtotal = S.nextLine();
                    System.out.println("Please enter the new date: ");
                    String newdate = S.nextLine();

                    editOrder RO = new editOrder();
                    RO.remove(orderNumber,  newID,  newname,  newState,  newtaxRate,
                             newproductType,  newArea,  newcostPerSquareFeet,
                             newlabourCostPerSquareFeet,  newmaterialCost,  newlabourCost,
                             newtax,  newtotal,  newdate);

                }
                if (variable == 4){

                    Scanner S2 = new Scanner(System.in);
                    System.out.println("Please enter the ID of the order which is to be deleted: ");
                    String orderNumber = S2.nextLine();
                    Remove R = new Remove();
                    R.remove(orderNumber);

                }
                if (variable == 5){//Export all Data
                    Export a = new Export();
                    a.export2();

                }
                if (variable == 6){//Ending program

                    System.exit(0);
                }

            }else{
                //Error when user inputs the options for the home screen
                UIError iniOerror = new UIError();
                iniOerror.Error();
            }
        }
    }
}
