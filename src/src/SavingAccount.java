package src;
import java.util.*;
public class SavingAccount extends Account{

  
	Scanner scan = new Scanner(System.in);

		void calculate_Intercet(int rate ,int time) {
			
			System.out.println("please enter your rate : ");
			rate =scan.nextInt();
			
			System.out.println("please enter your time : ");
			time =scan.nextInt();
		
			int calculate_Intercet= balance*rate*time;
			System.out.println("The Calculate_Intercet =  "+ calculate_Intercet);
			
			
			
		}

		public void withdrawd() {
			 try {
				 System.out.println("Enter your Amonut :");
				 amount= scan.nextInt();
				 
				 if(amount > balance) {
					 
					 System.out.println("Your amount is must be less than 200" + balance);
				 }
					
				 else if(amount == 0){ 
					System.out.println("Amount should be more 0"); 
				 }
				 
				 else {
					 boolean repeat=true;
					 while(repeat) {
						 
						 System.out.println("please enter your Amount : " + amount);
						 if(amount < balance) {
							 System.out.println("Your Balance are : " + balance);
							 
						  }
						 
					  }
				   }
			   }
			 	 catch(Exception e) {
				System.out.println("the amount is match");
			}
		}

		/*public void dopsit(int amount) {
			System.out.println("The balance : ");
		    balance = scan.nextInt();
			balance=balance+amount;
			
			System.out.println("the Balance are : "+ balance);
			
		}*/
		
	}