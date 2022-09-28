
/**
 * Write a description of class equalandignore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class equalandignore
{
    public static void main (String[]args){
        String Name;
        //String nameone = "DEREK";
        //String nametwo = "derek";
        
        //System.out.println("Using Equals: " + nameone.equals(nametwo));
        //System.out.println("Using Equals Ignore Case: " +nameone.equalsIgnoreCase(nametwo));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        Name  =input.nextLine();
        
        System.out.println("to UpperCase Method: " + Name.toUpperCase());
        System.out.println("to LowerCase Method: " + Name.toLowerCase());
        System.out.println("Length Method: " + Name.length());
    }
}
