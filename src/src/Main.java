package src;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
	
		
		//****************Object for each classes*********************
		//Account account = new Account();
		SavingAccount saveAccount = new SavingAccount();
	    CheckingAccount checkAccount = new CheckingAccount();
	
	
	saveAccount.setaccount_Number(01);
	saveAccount.setaccountHoldName("Ahmed");
	saveAccount.setbalance(500);
	saveAccount.dopsit(122);
	saveAccount.withdrawd(22);
	
	System.out.println("The Account Number  :" + saveAccount.getaccount_Number());
	System.out.println("The Hold Name :"+ saveAccount.getaccountHoldName());
	System.out.println("The Account balance  :" + saveAccount.getbalance());
	saveAccount.dopsit(122);
	saveAccount.withdrawd(22);
	System.out.println("________________________________________________________");
	

	checkAccount.setaccount_Number(03);
	checkAccount.setaccountHoldName("Amjad");
	checkAccount.setbalance(300);
	checkAccount.dopsit(200);
	checkAccount.withdrawd(200);
	checkAccount.setlimit(100);
	
	System.out.println("The Account Number  :" + checkAccount.getaccount_Number() );
	System.out.println("The Hold Name :" + checkAccount.getaccountHoldName());
	System.out.println("The Account Balance  :" + checkAccount.getbalance());
	checkAccount.dopsit(200);
    checkAccount.withdrawd(434);
	checkAccount.getlimit();
	System.out.println( "___________________________________________________________");
	
	
	
	//********************Save To File*******************************
	      try (FileWriter file = new FileWriter("Bank_Account.txt");
		         PrintWriter writer = new PrintWriter(file)){
		
		writer.println("checking Account");
		writer.println("Account Number :"+ saveAccount.getaccount_Number());
		writer.println("Account Hold Name :"+ saveAccount.getaccountHoldName());
		writer.println("Account Balance :"+ saveAccount.getbalance());
		
		writer.println("Account Number :");
		writer.println("Account Number :"+ checkAccount.getaccount_Number());
		writer.println("Account Hold Name :"+ checkAccount.getaccountHoldName());
		writer.println("Account Balance :"+ checkAccount.getbalance());	
	
		}
	      catch(Exception e) {
		       e.printStackTrace();
	}
   }
 }
