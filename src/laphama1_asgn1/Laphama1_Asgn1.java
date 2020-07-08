package laphama1_asgn1;

import java.io.PrintStream;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Anthony Lapham
 */
public class Laphama1_Asgn1 {

    // scanner attached to System.in (usable in all methods)
    final static Scanner cin = new Scanner(in);

    // declare variables available to all methods (global)
    static String serverName;
    static double drinkPrice, appPrice, entreePrice, desertPrice, tip, totalDue;
    static double tipFifteen, tipEighteen, tipTwenty, salesTax, subTotal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CPS Assignment 1 by Anthony Lapham");
        System.out.println();
        input();
        process();
        output();
    }//end main

    private static void input() {
        //user dialog
        System.out.println("Welcome to the Restaurant check calculator!");
        System.out.println();
        System.out.printf("Enter server's first name: ");
        serverName = cin.next();
        System.out.printf("Enter the price of the drink: ");
        drinkPrice = cin.nextDouble();
        System.out.printf("Enter the price of the appetizer: ");
        appPrice = cin.nextDouble();
        System.out.printf("Enter the price of the entree: ");
        entreePrice = cin.nextDouble();
        System.out.printf("Enter the price of the desert: ");
        desertPrice = cin.nextDouble();
        System.out.println();
        System.out.println("Tip suggestions:");
        System.out.print("(15%): ");
        tipFifteen = (.15)*(drinkPrice + appPrice + entreePrice + desertPrice);
        System.out.printf("%.2f%n", tipFifteen);
        System.out.print("(18%): ");
        tipEighteen = (.18)*(drinkPrice + appPrice + entreePrice + desertPrice);
        System.out.printf("%.2f%n", tipEighteen);
        System.out.print("(20%): ");
        tipTwenty = (.20)*(drinkPrice + appPrice + entreePrice + desertPrice);
        System.out.printf("%.2f%n", tipTwenty);
        System.out.println();
        System.out.printf("Enter amount you wish to tip: ");
        tip = cin.nextDouble();
        System.out.println("--------------------------------------------------");

    }//end input

    private static void process() {
        //calculation
        subTotal = drinkPrice + appPrice + entreePrice + desertPrice;
        salesTax = (.075)*(drinkPrice + appPrice + entreePrice + desertPrice);
        totalDue = subTotal + salesTax + tip;
       

    }//end process

    private static void output() {
        System.out.println();
        System.out.println("Lapham's Taproom");
        System.out.println("================");
        System.out.println("Welcome Customer!");
        System.out.printf("Your server is ");
        System.out.println(serverName);
        System.out.println();
        System.out.printf("Drink: ");
        System.out.println(drinkPrice);
        System.out.printf("Appetizer: ");
        System.out.println(appPrice);
        System.out.printf("Entree: ");
        System.out.println(entreePrice);
        System.out.printf("Desert: ");
        System.out.println(desertPrice);
        System.out.printf("Tip: ");
        System.out.println(tip);
        System.out.printf("Sales tax: ");
        System.out.printf("%.2f%n", salesTax);
        System.out.println();
        System.out.printf("Total due: ");
        System.out.printf("%.2f%n", totalDue);
        System.out.println();
        System.out.println("CPS 150 Assignment 1 complete!");

    }//end output

}//end class
