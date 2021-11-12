
import java.lang.*;

/**
 *
 * @author mmutinda
 */
public class DemoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //method overloading ---same method but expects different parameter
        /*String can be made through various method in a pool and heap(thats when is created as an 
        *object using the new keyword
        **/

       //method one at poll
        //variable word and wordTwo point to the same heap hence considered as equal
//        String wordTwo = "Java";
//        String word = "Java";
//        String wordFour = new String("Java");
//        
//        System.out.println("Our programming language is " + word.toUpperCase() + " & " + wordTwo.toLowerCase(Locale.ITALY));
//
//        //method two creating at heap
//        String wordThree = new String("      WUnglu   ");
//
//        System.out.println(wordThree.trim());
//        
        
      /* equals() method will  compare to string but not memory but {==}-------
        ----------string literals**/
//        System.out.println("comparison in memory" +""+ wordTwo == wordFour);
//        
//        System.out.println(wordTwo == wordFour);
//        
//       System.out.println(wordTwo == word);
//        
//        System.out.println("comparison " + wordTwo.equals(word));
//        
//        System.out.println("comparison " + wordTwo.equals(wordFour));
//
//        System.out.println("length " + wordTwo.length());
//        
//        System.out.println("Index of char " + wordTwo.indexOf('v'));
        
        
//           String yes = "Yes";
//           String no = "n"; 
//           String test = "a"; 
//           String exact = "abc"; 
//          
//           System.out.println(test.matches(".")); //single symbol true
//           System.out.println(no.matches("."));   //not word false
//           System.out.println(no.matches("[a-z0-7]")); //single character
//            System.out.println(exact.matches("abc")); //exact characters 
           
//        if (word.matches("[a-z][A-Z]")){
//            System.out.println(yes);
//        }
//            System.out.println(no);
//        }

            /************How to get digit from String using meta character***********/
//            String number;
//             
//            Scanner keyboard = new Scanner(System.in);
//            System.out.println("enter an integer");
//            number = keyboard.nextLine();
//            
//            if(number.matches("\\d")){
//                System.out.println("The out put number is :"+number);
//            }else{
//                  System.out.println("KIndly follow the instruction carefully this "+number+" is not a digit"); 
//            }
//
//           
//           System.out.println("The out put number is :"+number);
           
           
           
/******************CHALLENGE ONE***********************/

/*1.Find email if it contains gmail and 
2.get username and domain name**/

//            String email;
//             
//            Scanner inputEmail = new Scanner(System.in);
//            System.out.println("Please Enter your Email?");
//            email = inputEmail.nextLine();
//            
//            if (email.matches("\\w*@gmail.*")) {
//
//                System.out.println("Your email is :"+email);
//               int  domain = email.lastIndexOf('l');
//               int i=email.indexOf("@");
//                String uname=email.substring(0,i);
//                System.out.println("Your domain  is :"+email.substring(domain+1));
//                System.out.println("Your Username is : "+email.substring(0,i));
//         } else {
//                 System.out.println("Ensure\n You have a gmail account\nYour email ranges to 5 - 10 characters");
//         }

         
            
             
/******************CHALLENGE TWO***********************/
/*finding binary number*
int intVal;
String binaryWord;

 Scanner inputNewword = new Scanner(System.in);
        System.out.println("Please Enter the Binary Number you think of?");
        intVal=inputNewword.nextInt();        
         binaryWord = String.valueOf(intVal);

            
            
    if(binaryWord.matches("[01]+")){
            System.out.println("hurray thats binary number");
    }else{
       System.out.println("try again!read about binary numbers");
            }
    }
}**/

/******************CHALLENGE THREE***********************/
/*Date format**/

String newDate = "02/12/2003";
String newWord = "carol";
String newMeso = "caroli";



if(newDate.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}")){
    
    System.out.println("Very true");
    //Compares string lexicographically using unicode and return an int value ---it also check if
    //string is greater or less than
     System.out.println(newWord.compareTo(newMeso));
    }else{
    
        System.out.println("Try again :(");
    }
    }
}
