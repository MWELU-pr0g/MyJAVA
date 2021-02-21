import java.lang.*;

class DataTypesSize{
	
	public static void main(String arg[]){
		
		/*to check the the member function of a class run command
				javap java.lang.Integer;
				*/
		
		//to check the size of INTEGER datatype
		System.out.println("INT SIZE :"+Integer.MIN_VALUE);
		//outputs:-128
		System.out.println("INT SIZE :"+Integer.MAX_VALUE);
		//outputs:127
		System.out.println("INT BYTE SIZE :"+Integer.BYTES);
		//outputs:1
		
		
		//to check the size of BYTE datatype
		System.out.println("Byte Min: "+Byte.MIN_VALUE);
        System.out.println("Byte Max: "+Byte.MAX_VALUE);
        System.out.println("Byte Bytes :"+Byte.BYTES);
        
		
		////to check the size of FLOAT datatype
        System.out.println("FLoat Min: "+Float.MIN_VALUE);
        System.out.println("Float Max: "+Float.MAX_VALUE);
        System.out.println("Float Bytes :"+Float.BYTES);
	}
}