import java.lang.*;
import java.util.*;

class Cubiod{
	public static void main(String arg[]){
		//input for sides of a the cubiod
		int length,height,breadth;
		int totalArea,volume;
		
		System.out.println("THIS PROGRAM IS USED TO CALCULATE THE AREA AND VOLUME OF A CUBIOD ");
        System.out.println("Please Input the dimensions of the cubiod in the order LENGTH,HEIGHT  and BREADTH");
		
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		height = sc.nextInt();
		breadth = sc.nextInt();
		
		
		
		int sideA = 2*(length * height) ;
		int sideB = 2*(breadth * height);
		int sideC = 2*(length * breadth) ;
		
		totalArea = sideA + sideB + sideC;
		volume = length * breadth * height;
		
		System.out.println("The Total Surface Area of the cubiod is :"+totalArea+ "cm**");
		
		System.out.println("The Volume of the cubiod is :"+volume+ "cm***");
		
		
	}
}

      //INCREMENT AND DECREMENT OPERATORS
	  
//	  class Cubiod{
//	public static void main(String arg[]){
//
//		int x = 5,y=1;
//		x++;
//		
//		//the result for m will be 1 because m will be assigned to y:
//		int m = y++;
//		int f = ++y;
//		
//		System.out.println(x);
//		
//		System.out.println(m);
//		
//		System.out.println(f);
		
		
		/*increment/decrement can also happen to char  & bytes data types 
		
		
		e.g  char a = 'A';
				a++;
				
				when you print a you get 'B'
				
				
				byte a = 5;
				a++;
				
				when you print a you get '6'
				
				
				
				BUT 
				
				byte a = 5;
				a+1;
				
				when you print a you get 'ERROR '  ------This is because  1 is an integer and  a is byte
													(INCOMPATIBLE DATA TYPES);
	*/
				
				
				
				
				
		
		
		
//	}
//}s

