package com.example;
import java.util.Scanner;


public class MyClass
{


    public static void main(String[] args)
    {
        // flow control decisions regarding my route to MCC
        // decision basis: other stops, time of day, traffic, am I late
        Scanner in = new Scanner(System.in);
        boolean otherStops = false, late = false;
        String time = "afternoon", traffic = "moderate";

        late = runningLate();
        otherStops = makingStops();

        if(time.equals("afternoon") && late == false)
        {
            System.out.println("Take 47 into MCC.");
        }
        else if(time.equals("afternoon") && late == true)
        {
            System.out.println("Take Lucas road into MCC.");
        }
        else if(late == true && otherStops == true)
        {
            System.out.println("Well you're kinda screwed now aren't you?");
            System.out.println("Take 47 into MCC or go through Bull Valley.");
        }
        else if(traffic.equals("moderate") && otherStops == false )
        {
            System.out.println("Take 176 into MCC.");
        }
        else if(otherStops == true && late == false)
        {
            System.out.println("Go through Bull Valley.");
        }
        else
        {
            System.out.println("Does it really matter how you get where you're going\n as long as you arrive safely?");
        }


    }

    public static Boolean runningLate()
    {
        Scanner in = new Scanner(System.in);
        String amLate = "Y";
        Boolean late = false;

        System.out.println("Are you running late? (Y / N) ");
        amLate = in.nextLine();

        if (amLate.equals("n"))
        {
            amLate = "N";
        }
        else if (amLate.equals("y")  || amLate.equals("Y"))
        {
            amLate = "Y";
            late = true;
        }
        while (amLate.equalsIgnoreCase("Y") == false  && amLate.equalsIgnoreCase("N") == false) //Input validation for are you late?
        {
            System.out.println("That was not a valid answer; please answer the \nquestion correctly.");
            System.out.println("Are you running late? (Y / N) ");
            amLate = in.nextLine();
            if (amLate.equals("n"))
            {
                amLate = "N";
            }
            else if (amLate.equals("y"))
            {
                amLate = "Y";
            }
        }

        return late;
    }

    public static Boolean makingStops()
    {
        Scanner in = new Scanner(System.in);
        String makingStops = "N";
        boolean otherStops = false;

        System.out.println("Do you have other stops to make? (Y / N) ");
        makingStops = in.nextLine();

        if (makingStops.equalsIgnoreCase("Y"))
        {
            makingStops = "Y";
            otherStops = true;
        }
//        else if(makingStops.equals("n"))
//        {
//            makingStops = "N";
//        }

        while (makingStops.equalsIgnoreCase("Y") == false  && makingStops.equalsIgnoreCase("N") == false) //Input validation for are you late?
        {
            System.out.println("That was not a valid answer; please answer the \nquestion correctly.");
            System.out.println("Do you have other stops to make? (Y / N) ");
            makingStops = in.nextLine();
            if (makingStops.equals("n"))
            {
                makingStops = "N";
            }
            else if (makingStops.equals("y"))
            {
                makingStops = "Y";
                otherStops = true;
            }
        }

        return otherStops;
    }
}