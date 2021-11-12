/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mmutinda
 */
public class Printing {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int a = 10,b=20;
        char c='A';
        boolean n = true;
        //METHOD println()
        //there are more than one method of println() with different parameters this is known as OVERLOADING
        System.out.println(a);//for int parameter
        System.out.println(c);//for char data type (parameter)same method name

        System.out.println(a+b +"SUM");//operation s done first
        System.out.println("SUM"+a+b);//a is concatenated to SUM TO FORM A STRING SAME TO b;
        
        
        /*format specifiers
        %d -integer,%f-float&double,%c-char
        
        **/
        
          
        /*Escape sequence
        \n -next line,\t-next tab,
        
        **/
        //METHOD printf()-two parameters
        
        
         double age =12.234;
        float weight = 57.8f;
        String str = "Mutinda Mwelu";
        char bloodGroup='B';
        
        System.out.printf(str+" weight %f age %f bloodgroup %c ",weight,age,bloodGroup);
        
        
    }
}
