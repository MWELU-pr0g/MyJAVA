import java.lang.*;
import java.util.*;
/**
 * Finding if a given String is Radix
 *
 * @author mmutinda
 */
public class Radix {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //find the type of a string
        String num, getNum;
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please Type the String:->");

        num = inputNumber.nextLine();

        if (num.matches("[01]+")) {
            System.out.println("Binary Number ---Radix 2");
        } else if (num.matches("[0-7]+")) {
            System.out.println("Octal ----Radix 8 ");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Here");
        } else {
            System.out.println("Normal String");
        }

    }

}
