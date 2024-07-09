package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    /***
    This class has implemented arraylist which can be switched with json file or database for expanding as proper simulator and able access picture to be displayed
     Having simulator feel needed number of tries to get a proper/ liked outfit for occasion.

     */
    public static void main(String[] args) {
        // Create instances for different types of outfits
        garmentGen p = new professional();
        garmentGen c = new casual();
        garmentGen party = new party();

        Scanner scrn = new Scanner(System.in);

        int occasion = 0;

        // List of generic colors
        ArrayList<String> genericColor = new ArrayList<String>();
        genericColor.add("Green");
        genericColor.add("Yellow");
        genericColor.add("Black");
        genericColor.add("Red");
        genericColor.add("Saddle brown");
        genericColor.add("Purple");
        genericColor.add("blue");
        genericColor.add("magenta");
        genericColor.add("yellow");
        genericColor.add("white");
        genericColor.add("Sparkly");
        genericColor.add("check Design in red");

        // List of professional top colors
        ArrayList<String> pColor = new ArrayList<String>();
        pColor.add("Green");
        pColor.add("Yellow");
        pColor.add("Black");
        pColor.add("Red");
        pColor.add("Saddle brown");
        pColor.add("Purple");
        pColor.add("blue");
        pColor.add("magenta");
        pColor.add("yellow");
        pColor.add("white");

        // List of professional pants colors
        ArrayList<String> pColorpants = new ArrayList<String>();
        pColorpants.add("Black");
        pColorpants.add("Saddle brown");
        pColorpants.add("white");
        pColorpants.add("Khaki");

        Random rand = new Random();

        // Prompt the user for input
        System.out.printf("Enter the following numbers depend upon the outfit occasion \nCasual outfit : 0  | Party outfit : 1  | Professional outfit : 2 | To exit : 991 \n ");

        while (!(occasion == 991)) {
            occasion = scrn.nextInt();
            if (occasion == 0) {
                // Generate and wear a casual outfit
                System.out.println("You are acquiring for Casual outfit.");
                garment Top = p.createTop("Casual", genericColor.get(rand.nextInt(0, genericColor.size() - 1)));
                garment Pants = p.createPants("Casual", genericColor.get(rand.nextInt(0, genericColor.size() - 1)));
                garment Shoes = p.createShoes("Casual", genericColor.get(rand.nextInt(0, genericColor.size() - 1)));

                Top.wear();
                Pants.wear();
                Shoes.wear();
                System.out.printf("\n Enter the following numbers depend upon the outfit occasion \nCasual outfit : 0  | Party outfit : 1  | Professional outfit : 2 | To exit : 991 \n ");

            } else if (occasion == 1) {
                // Generate and wear a party outfit
                System.out.println("You are acquiring for Party outfit.");
                garment Top = p.createTop("Party", genericColor.get(rand.nextInt(0, genericColor.size() - 1)));
                garment Pants = p.createPants("Party", genericColor.get(rand.nextInt(0, genericColor.size() - 1)));
                garment Shoes = p.createShoes("Party", genericColor.get(rand.nextInt(0, genericColor.size() - 1)));

                Top.wear();
                Pants.wear();
                Shoes.wear();
                System.out.printf("\n Enter the following numbers depend upon the outfit occasion \nCasual outfit : 0  | Party outfit : 1  | Professional outfit : 2 | To exit : 991 \n ");

            } else if (occasion == 2) {
                // Generate and wear a professional outfit
                System.out.println("You are acquiring for Professional outfit.\n");
                garment Top = p.createTop("Professional", pColor.get(rand.nextInt(0, pColor.size() - 1)));
                garment Pants = p.createPants("Professional", pColorpants.get(rand.nextInt(0, pColorpants.size() - 1)));
                garment Shoes = p.createShoes("Professional", pColor.get(rand.nextInt(0, pColor.size() - 1)));

                Top.wear();
                Pants.wear();
                Shoes.wear();

                System.out.printf("\n Enter the following numbers depend upon the outfit occasion \nCasual outfit : 0  | Party outfit : 1  | Professional outfit : 2 | To exit : 991 \n ");

            } else {
                // Invalid input prompt
                System.out.println("Please input appropriate input as directed initial statements \nCasual outfit : 0  | Party outfit : 1  | Professional outfit : 2 | To exit : 991 ");
            }
        }
    }
}
