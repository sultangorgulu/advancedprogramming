
public class Account implements Data {
           
		
	  private int balance;
	  private String type;
	  private String owners;
	  
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	  
	@Override

	public void log() {
		System.out.println("logged*");
		
	}

}
//8