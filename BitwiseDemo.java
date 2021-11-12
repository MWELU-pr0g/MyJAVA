

/**
 *
 * @author mwelu_mutinda
 */
public class BitwiseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
      /*  //this is done the binary form
        int x = 10,y=6,z,n,m;
        z=x&y;
          n=x|y;
            m=x^y;
        System.out.println(z);
        System.out.println(n);
        System.out.println(m);
        
        int c = 0b1010;
        int k =c<<1;
        int g =c>>1;
        
        //left shift doubles the number while right shift divides the number
        System.out.println(k+"This is left shift");
        System.out.println(g+"This is right shift");
        
        
        
        int f=-0b1010;
        int e=f>>>1;//Signed shift
        
        System.out.println(e+"this is integer value");
        
        //there was a shift check from results to see how
         System.out.println(String.format("%s", Integer.toBinaryString(f))+"this is in binarry form");
         System.out.println(String.format("%32s", Integer.toBinaryString(e))+"this is in binarry form");//32 shows the place it has moved**/
         
         
         
       /*  //BITWISE SWAPPING
         
         int a =10 ,b= 15;
         
         a = a^b;
         b = a^b;
         a = a^b;
         
         System.out.println("The value of "+a+"and"+b);**/
       
       
       
       //MERGING AND MASKING
       
       byte a = 9,b =12;
       byte c;
       
       
        System.out.println(a+"\n"+b);
        
        //Performing & operator to a and b thats masking
        
         c = (byte) ((byte)a<<4);
       
      
      c=(byte)(a<<4);
      c=(byte)(c|b);
      
      System.out.println((c&0b11110000)>>4);
      System.out.println((c&0b00001111)>>4);
      
        
        
         
 
        
    }
}
