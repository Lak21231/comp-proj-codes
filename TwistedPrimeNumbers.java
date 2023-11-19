//import required classes and packages  
import java.io.*;  
import java.util.*;  
  
//create TwistedPrimeNumbers class to check twisted prime number  
class TwistedPrimeNumbers {  
   
    // create checkPrimeNumber() method to check whether the number is prime or not  
    static boolean checkPrimeNumber(int number)  
    {  
        int i;  
        int m = 0;  
        int flag = 0;        
        m = number/2;        
        if(number == 0 || number == 1){    
            return false;        
        }else{    
            for(i = 2; i <= m ;i++){        
                if(number%i == 0){        
                    flag=1;        
                    return false;       
                }        
            }        
            if(flag == 0)    
            {   
                return true;  
            }    
        }  
        return false;  
    }  
      
    static int getReverseNumber(int number){  
        int rev = 0;    
        while(number != 0)     
        {    
            int rem = number % 10;    
            rev = rev * 10 + rem;    
            number = number/10;    
        }  
        return rev;  
    }  
   
    // create checkTwistedPrimeNumber() to check whether the numbers are twisted prime or not  
    static boolean checkTwistedPrimeNumber(int number)  
    {  
        if(checkPrimeNumber(number) && checkPrimeNumber(getReverseNumber(number)))  
            return true;  
        else  
            return false;  
    }  
   
    /* Driver program to test above function */  
    public static void main(String[] args)  
    {  
         int number1, number2;  
          
        //use scanner class for the values of number1 and number2  
        Scanner sc = new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter first number");  
          
        //store user entered value into variable n1  
        number1 = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter second number");  
          
        //store user entered value into variable n2  
        number2 = sc.nextInt();  
          
        if (checkTwistedPrimeNumber(number1))   
            System.out.println(number1 +" is a twisted prime number");   
        else  
            System.out.println(number1 +" is not a twisted prime number");   
          
        if (checkTwistedPrimeNumber(number2))   
            System.out.println(number2 +" is a twisted prime number");   
        else  
            System.out.println(number2 +" is not a twisted prime number");   
          
    }  
}  
