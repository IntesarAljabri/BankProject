package src;

public class CheckingAccount extends Account {

	int limit=200;
	
	
	public int getlimit() {
		return limit;
	}
	
	public void setlimit(int limit) {
		this.limit=limit;
	}
	
	
	void withdrawd(int limit) {
			
		if(amount > limit) {
			System.out.println("The Amount is greater than limit");
		                 }
		else if(amount== limit) {
			System.out.println("The amount is equal the limit ");
			
			while(true){
                System.out.print("Do you want to comlete? (y/n):    ");
                String choice=scan.next();
                    if(choice.equals("N") || choice.equals("n")){
                       break;
                    }
                else if(choice.equals("y")||choice.equals("Y")){
                    break;
                }
                else{
                    System.out.println("Invalid input  ");
                }
			  break;
		
			}
			
		}
			else if(amount< limit) {
				System.out.println("The amount is less than limit");
			}
		
			else {
				System.out.println("The amount is 0");
			
		}
	}
}
	

