import java.lang.*;
import java.util.*;

/*
 * relational & logical opertaor they both return bolean response
 *
 *>,>=,<=,==,!=
 */
/**
 *
 * @author mmutinda
 */
public class Conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int a = 45;
        int b = 4;
        int c = 10;
        
        
        System.out.println(a > b);
        
        //find the maximum number(nested if)
        if(a>b && a > c){
            System.out.println(a);
        }else if(b > c){
             System.out.println(b);
        }else{
             System.out.println(c);
            
        }
        
          //find if number is odd or even
        
        int oddNumber = 7;
        
        if(oddNumber/2 == 0 || oddNumber == 2){
            System.out.println("this is a even number");
        }else if(oddNumber % 2 >= 1 ){
            System.out.println("this is odd number");
        }
        //find age of a person
        int getAge;
        Scanner inputNewword = new Scanner(System.in);
        System.out.println("Please Enter your Age?");
        getAge=inputNewword.nextInt();
        
        if(getAge >=  65 && getAge <= 120){
            System.out.println("Old");
        }else if(getAge >= 25 && getAge <= 64){
            System.out.println("Middle Age");
        }else if(getAge >= 24 && getAge <= 18){
            System.out.println("Youth");
        }else if(getAge >= 13 && getAge <= 17){
            System.out.println("Teen");
        }else if(getAge >= 6 && getAge <= 12){
            System.out.println("Babies");
        }
        else if(getAge >= 1 && getAge <= 5){
            System.out.println("Infants");
        }
        else{
            System.out.println("Invalid Age");
        }
        
        
        
        //find age of a person
        int getGrade;
        Scanner inputGrade = new Scanner(System.in);
        System.out.println("Please Enter your Percentage Grade?");
        getGrade = inputGrade.nextInt();
        
        if(getGrade >=  80 && getGrade <= 100){
            System.out.println("A");
        }else if(getGrade >= 75 && getGrade <= 79){
            System.out.println("A-");     
        }else if(getGrade >= 70 && getGrade <= 74){
            System.out.println("B+");
        }else if(getGrade >= 65 && getGrade <= 69){
            System.out.println("B");     
        }else if(getGrade >= 60 && getGrade <= 64){
            System.out.println("B-");
        }else if(getGrade >= 55 && getGrade <= 59){
            System.out.println("C+");
        }else if(getGrade >= 50 && getGrade <= 54){
            System.out.println("C");
        }
        else if(getGrade >= 45 && getGrade <= 49){
            System.out.println("C-");      
        }
        else if(getGrade >= 40 && getGrade <= 44){
            System.out.println("D+");
        }
        else if(getGrade >= 35 && getGrade <= 39){
            System.out.println("D");
        }
        else if(getGrade >= 30 && getGrade <= 34){
            System.out.println("D-");
        }
        else if(getGrade >= 0 && getGrade <= 29){
            System.out.println("E");
        }
        else{
            System.out.println("Kindly enter your percentage grade to get you grade");
        }
        
    }
}
