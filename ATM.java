   
import java.util.*;  

class bankAccountNo229876{
   public int Balance = 250000;
}
  

public class ATM  
{  
   
    public static void main(String args[] )  
    {  
         bankAccountNo229876 afzal22112=new bankAccountNo229876();
        
        int  withdraw, deposit;  
          
         
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter your Pin: (pin is 4433)");
        int pin=sc.nextInt();
        if(pin==4433){
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        
        withdraw = sc.nextInt();  
                      
        
        if(afzal22112.Balance >= withdraw)  
        {  
             
            afzal22112.Balance = afzal22112.Balance  - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            
            System.out.println("Sorry! Insufficient Balance");  
        }  
        System.out.println("Thank you and see U again");
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        
        deposit = sc.nextInt();  
                      
     
        afzal22112.Balance  = afzal22112.Balance  + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
   
        System.out.println("Balance : "+afzal22112.Balance);  
        System.out.println("");  
        break;  
   
                case 4: 
                System.out.println("See U Soon..."); 
       
        System.exit(0);  
            }  
        }  
    
    }
    else System.out.println("Incorrect pin...");  
}  
}