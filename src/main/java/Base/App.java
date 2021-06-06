/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        startQuest();
    }
    public static void startQuest()
    {
        boolean validFlag = false;
        System.out.print("Is the car silent when you turn the key? (Y/N): ");
        String input = in.nextLine();

        while (!validFlag)
        {
            if (!"Y".equals(input.toUpperCase(Locale.ROOT)) && !"N".equals(input.toUpperCase(Locale.ROOT)))
            {
                System.out.print("I'm sorry, I didn't get that. Please enter Y or N: ");
                input = in.nextLine();
            }
            else validFlag = true;
        }
        if ("Y".equals(input.toUpperCase(Locale.ROOT)))
        {
            battTermQuest();
        }
        else if ("N".equals(input.toUpperCase(Locale.ROOT)))
        {
            clickQuest();
        }
    }
    public static void battTermQuest()
    {
        boolean validFlag = false;
        System.out.print("Are the battery terminals corroded? (Y/N): ");
        String input = in.nextLine();

        while (!validFlag)
        {
            if (!"Y".equals(input.toUpperCase(Locale.ROOT)) && !"N".equals(input.toUpperCase(Locale.ROOT)))
            {
                System.out.print("I'm sorry, I didn't get that. Please enter Y or N: ");
                input = in.nextLine();
            }
            else validFlag = true;
        }
        if ("Y".equals(input.toUpperCase(Locale.ROOT)))
        {
            System.out.print("Clean terminals and try starting again.\n");
        }
        else if ("N".equals(input.toUpperCase(Locale.ROOT)))
        {
            System.out.print("Replace cables and try again.\n");
        }
    }
    public static void clickQuest()
    {
        boolean validFlag = false;
        System.out.print("Does the car make a clicking noise? (Y/N): ");
        String input = in.nextLine();

        while (!validFlag)
        {
            if (!"Y".equals(input.toUpperCase(Locale.ROOT)) && !"N".equals(input.toUpperCase(Locale.ROOT)))
            {
                System.out.print("I'm sorry, I didn't get that. Please enter Y or N: ");
                input = in.nextLine();
            }
            else validFlag = true;
        }
        if ("Y".equals(input.toUpperCase(Locale.ROOT)))
        {
            System.out.print("Replace the battery.\n");
        }
        else if ("N".equals(input.toUpperCase(Locale.ROOT)))
        {
            crankQuest();
        }
    }
    public static void crankQuest()
    {
        boolean validFlag = false;
        System.out.print("Does the car crank up but fail to start? (Y/N): ");
        String input = in.nextLine();

        while (!validFlag)
        {
            if (!"Y".equals(input.toUpperCase(Locale.ROOT)) && !"N".equals(input.toUpperCase(Locale.ROOT)))
            {
                System.out.print("I'm sorry, I didn't get that. Please enter Y or N: ");
                input = in.nextLine();
            }
            else validFlag = true;
        }
        if ("Y".equals(input.toUpperCase(Locale.ROOT)))
        {
            System.out.print("Check spark plug connections.\n");
        }
        else if ("N".equals(input.toUpperCase(Locale.ROOT)))
        {
            startFailQuest();
        }
    }
    public static void startFailQuest()
    {
        boolean validFlag = false;
        System.out.print("Does the engine start and then die? (Y/N): ");
        String input = in.nextLine();

        while (!validFlag)
        {
            if (!"Y".equals(input.toUpperCase(Locale.ROOT)) && !"N".equals(input.toUpperCase(Locale.ROOT)))
            {
                System.out.print("I'm sorry, I didn't get that. Please enter Y or N: ");
                input = in.nextLine();
            }
            else validFlag = true;
        }
        if ("Y".equals(input.toUpperCase(Locale.ROOT)))
        {
            fuelInjQuest();
        }
        else if ("N".equals(input.toUpperCase(Locale.ROOT)))
        {
            System.out.print("This should not be possible.\n");
        }
    }
    public static void fuelInjQuest()
    {
        boolean validFlag = false;
        System.out.print("Does your car have fuel injection? (Y/N): ");
        String input = in.nextLine();

        while (!validFlag)
        {
            if (!"Y".equals(input.toUpperCase(Locale.ROOT)) && !"N".equals(input.toUpperCase(Locale.ROOT)))
            {
                System.out.print("I'm sorry, I didn't get that. Please enter Y or N: ");
                input = in.nextLine();
            }
            else validFlag = true;
        }
        if ("Y".equals(input.toUpperCase(Locale.ROOT)))
        {
            System.out.print("Get it in for service.\n");
        }
        else if ("N".equals(input.toUpperCase(Locale.ROOT)))
        {
            System.out.print("Check to ensure the choke is opening and closing.\n");
        }
    }
}

