package poimenidis.javaexercises;

public class Account {
  
  private String name;
  private String number;
  private double balance;
  private boolean isActive;
  
  public Account(String name, PersonBank client){
	this(name, 0, client);
  }
  
  public Account(String name, double balance, PersonBank client){
	this.name = name;
	this.number = Math.round(Math.random()*1000) + client.hashCode() + client.getName()+ client.getAge();
	this.balance = balance;
	this.isActive = true;
  }

  public String getName() {
	return name;
  }

  public String getNumber() {
	return number;
  }

  public double getBalance() {
	if(!isActive) return 0;
	return balance;
  }

  public boolean isActive() {
	return isActive;
  }

  private void setBalance(double amount) {
	if(this.isActive) this.balance += amount;
  }

  public void setIsActive(boolean isActive) {
	this.isActive = isActive;
  }
  
  public void deposit(double amount){
	this.setBalance(amount);
  }
  
  public void withdraw(double amount){
	this.setBalance(-amount);
  }
  
  public String toString(){
	StringBuilder result = new StringBuilder();
	result.append("[name: ")
		.append(name)
		.append(",\nnumber: ")
		.append(number)
		.append(",\nbalance: ")
		.append(balance)
		.append(",\nis active: ")
		.append(isActive)
		.append("]");
	return result.toString();
  }
  
}
