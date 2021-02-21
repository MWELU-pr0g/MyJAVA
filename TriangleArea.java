import java.lang.*;

import java.util.*;


class TriangleArea{
	public static void main(String arg[]){
		
		 System.out.println("Please Input the base dimension of Triange(max of 2 decimals -meters)");
		Scanner getBase = new Scanner(System.in);
		
		float  base =getBase.nextFloat();
		System.out.println("base dimension:"+base);
		
		System.out.println("Please Input the height dimension of Triange(max of 2 decimals)");
		Scanner getHeight = new Scanner(System.in);
		
		float   height =getBase.nextFloat();
		System.out.println("height dimension:"+height);
		
		//int c = 1/2;
		double areaOfTriangle = (base * height)/2;
		//System.out.println(c);
		
		System.out.println("The Area of triange is "+areaOfTriangle +" squared meters");
		
		
		
		
	}
	
	
}