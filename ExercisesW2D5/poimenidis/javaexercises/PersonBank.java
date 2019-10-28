package poimenidis.javaexercises;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonBank {
  
  private String name;
  private int age;
  private Account[] accounts;
  
  public PersonBank(String name, int age){
	this.name = name;
	this.age = age;
	this.accounts = new Account[3];
  }

  public String getName() {
	return name;
  }

  public int getAge() {
	return age;
  }

  public Account[] getAccounts() {
	return accounts;
  }

  public void createAccount(){
	int index = getAccountsQuantity();
	if(index != -1){
	  if(age > 18){
		this.accounts[index] = new Account("Savings", this);
	  } else {
		System.out.format("You are %d years old. You won't be eligible to create an account until you turn 18.", age);
	  }
	} else {
	  System.out.println("You already own 3 accounts, can't create more.");
	}
  }
  
  public int getAccountsQuantity(){
	int index = -1;
	for(int i = 0; i < accounts.length; i++){
	  if(accounts[i] == null){
		index = i;
		break;
	  }
	}
	return index;
  }
  
  public String toString(){
	StringBuilder result = new StringBuilder();
	result.append("[name: ")
		.append(name)
		.append(",\nage: ")
		.append(age)
		.append(",\n");
	for(Account account:accounts) result.append(account.toString()).append(",\n");
	result.append("]");
	return result.toString();
  }
  
  public void printToFile(){
	try {
	  PrintWriter writer;
	  writer = new PrintWriter("info.txt", "UTF-8");
	  writer.println(this.toString());
	  writer.close();
	} catch (FileNotFoundException | UnsupportedEncodingException ex) {
	  Logger.getLogger(PersonBank.class.getName()).log(Level.SEVERE, null, ex);
	}
  }
  
  public static PersonBank getRichest(PersonBank[] persons){
	PersonBank richest = null;
	double totalBalance = Double.NEGATIVE_INFINITY;
	for(PersonBank person: persons){
	  double tempBalance = person.getTotalBalance();
	  if(totalBalance < tempBalance){
		richest = person;
		totalBalance = tempBalance;
	  }
	}
	return richest;
  }
  
  public static PersonBank getPoorest(PersonBank[] persons){
	PersonBank poorest = null;
	double totalBalance = Double.POSITIVE_INFINITY;
	for(PersonBank person: persons){
	  double tempBalance = person.getTotalBalance();
	  if(totalBalance > tempBalance){
		poorest = person;
		totalBalance = tempBalance;
	  }
	}
	return poorest;
  }
  
  private double getTotalBalance(){
	double total = 0;
	for(Account account: accounts){
	  if(account == null) break;
	  else total += account.getBalance();
	}
	return total;
  }
  
}
