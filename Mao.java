import  java.lang.*;

class Mao{
	public static void  main(String arg[]){
		
		//Arithmetic operetors results data type can change depending on operation
		//This is known as Coesion ......eg byte + byte = byte 
		//..................................................short + byte = int
		
		
		//Precedence of arithmetic operation  *,/,%,(high),,,,,-,+(low)......() is used to change the order
		float a = 12.4f;
		long  b = 123l;
		
		float c = a + b;
		 System.out.println(c);
	}



}