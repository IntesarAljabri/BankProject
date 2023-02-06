package src;
import java.util.*;
public class Account extends Main{
	Scanner scan = new Scanner(System.in);
	
	int account_Number;
	String accountHoldName;
	int balance;
	int amount;
	
	
	//***********Setter/Getter*****************************
	public int getaccount_Number() {
		return account_Number;
	}
	
	public void setaccount_Number(int account_Number) {
		this.account_Number=account_Number;
	}
	
	
	
	public int getbalance() {
		return balance;
	}
	
	public void setbalance(int balance) {
		this.balance=balance;
	}
	
	
	public String getaccountHoldName() {
		return accountHoldName;
	}
	
	public void setaccountHoldName(String accountHoldName) {
		this.accountHoldName=accountHoldName;
	}
	
	
	
	////to get calculate of amount+balance  **the amount should be argument
	
	void dopsit(int amount) {
	   System.out.println("The balance : ");
	    balance = scan.nextInt();
		balance=balance+amount;
		System.out.println("the Balance are : "+ balance);
		
		//balance=balance+amount;
	}
	
	///has if to check the amount is greater than balance 
	void withdrawd(int amount) {
		 try {
			 System.out.println("Enter your Amonut :");
			 amount= scan.nextInt();
			 
			 if(amount > balance) {
				 
				 System.out.println("Your amount is must be less than 200" + balance);
			 }
			 else { 
				 boolean repeat=true;
				 while(repeat) {
					 
					 System.out.println("please Enter your Amount : " + amount);
					 if(amount < balance) {
						 System.out.println("Your Balance are : " + balance);
						 break; 
					  }
					 
				  }
				 
			   }
		   }
		 	catch(Exception e) {
			System.out.println("the amount is match");
		}
	
	
	//*********************Constructors************************
	/*Account(String Account_Name, int account_Number){
		
		System.out.println(Account_Name + account_Number);
	}*/
	}
}
