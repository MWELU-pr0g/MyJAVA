import
 java.lang.*;
import java.util.*;

class MyFirst{
	public static void main(String arg[])
	{
		
	String lang;
	int c = 5;
	int e,f;
	System.out.println("Hello Mutinda Mwelu \n I love my new career");
	System.out.println("Whats your favourite Programming language?");
	
	
	/*
	System.out.println(arg[0]); -----this is a command line argument and it throws an error when you run but if
	you include another word when running it will read it as the first index.
	eg when you run java First carol
	
	carol (will be printed);**/
	
	
	//ask for word from keyboard using Scanner class 
	Scanner s = new Scanner(System.in);
	lang=s.next();
	System.out.println("Hello Hacker so love "+lang +" as a programming language") ;
	
	//reads number using nextInt() func
	System.out.println("Tell me more about yourself...How old are you?");
	Scanner b = new Scanner(System.in);
	 e = b.nextInt();
	
	System.out.println("what  is 2 + 2");
	Scanner m = new Scanner(System.in);
	 f = m.nextInt();
	
	if(f ==4){
	System.out.println("Correct!Do you know in 5 years you will be "+(e + c));	
	}else{
		System.out.println("OOPS!Something went wrong by");	
	}
	
	}
}