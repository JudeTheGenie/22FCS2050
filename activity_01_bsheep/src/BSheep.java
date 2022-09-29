/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 01 - BSheep
 */

import java.util.Scanner;

public class BSheep {

    static final int MIN_NUM_SHEEP = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Sheep");
        String stringInput;
        int numOfSheep = input.nextInt();
        try {
            numOfSheep = Integer.parseInt(stringInput);
        }
        catch (NumberFormatException ex)
        System.out.println("Not a number");
        System.exit(1);
        if (numOfSheep < MIN_NUM_SHEEP)
            System.out.println("Number of sheep must be at least ");
        System.exit(2);


    }
} // end of class definition