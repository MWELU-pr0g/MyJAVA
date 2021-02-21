
import java.lang.*;

 class Literals {

    public static void main(String[] args) {
		
		//Literal are constant values that are used in program but have data types 
		
		/* e.g Integer Literals 
		decimals=0123456789,
		binary=0,1,
		octal=01234567,
		hexadecimal=0123456789abcdef*/
		
		// Example of writing 10 in differnt ways
        byte b1=10;//decimal
        byte b2=0b1010;//binary
        byte b3=012;//octal
        byte b4=0XA;//hexadecimal
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
		
		//By default decimals valus are double one can assign letters to differentiate type of LITERAL DATA TYPE
        
        long l=9999999999L;
        float f=12.56f;
        double d=12.56d;
		
		//N/B large number can be seperated using underscores for efficient readibilty
		long ll=999_999_9999L;
		//can also be as long large = 999_999_9999;
		
        
        System.out.println(ll);
        System.out.println(f);
        System.out.println(d);
    }
    
}