import java.lang.*;

import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mmutinda
 */
public class Isosless {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        //code from instructor
//         Scanner sc=new Scanner(System.in);
//         
//        int a,b,c;
//        double s,area;
//        
//        System.out.println("Enter 3 Sides of a Triangle");
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c=sc.nextInt();
//        
//        s=(a+b+c)/2f;
//        
//        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
//        
//        System.out.println("Area of Triangle is "+area);
        
        // My code  application logic here
                System.out.println("This is a program to calculate Area of Isosless Triangle");
        	 System.out.println("Please Input the First dimension of Triange(max of 2 decimals -meters?");
		Scanner getC = new Scanner(System.in);
		
		int  sideA =getC.nextInt();
		System.out.println("base dimension:"+sideA);
		
		System.out.println("Please Input the Second dimension of Triange(max of 2 decimals?");
		Scanner getA = new Scanner(System.in);
		
		int   sideB =getA.nextInt();
		System.out.println("height dimension:"+sideB);
                
                System.out.println("Please Input the Third  dimension of Triange(max of 2 decimals?");
		Scanner getB = new Scanner(System.in);
		
		int   sideC =getB.nextInt();
		System.out.println("height dimension:"+sideC);
		
		//int c = 1/2;
        float total =( sideA + sideB + sideC)/2f;
		double areaOfTriangle = Math.sqrt(total*((total-sideA)*(total-sideB)*(total - sideC)));
		//System.out.println(c);
		
		System.out.println("The Area of triange is "+areaOfTriangle +" squared meters");
    }
}
