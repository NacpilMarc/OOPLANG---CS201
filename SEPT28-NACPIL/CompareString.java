
/**
 * Write a description of class CompareString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class CompareString
{
    public static void main (String[]args){
        String aName = "Carmen";
        String anotherName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        anotherName  =input.nextLine();
        if (aName.equals(anotherName))
            System.out.println(aName + " equals " + anotherName);
        else
            System.out.println(aName + " are not equal " + anotherName);

        if (aName.equalsIgnoreCase(anotherName))
            System.out.println(aName + " equals " + anotherName);
        else
            System.out.println(aName + " are not equal " + anotherName);
        }
}
