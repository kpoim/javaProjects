package poimenidis.javaexercises;

import java.util.Scanner;

public class Input {
  
  private Input(){}
  
  static Scanner scanner = new Scanner(System.in);
  
  public static void inputAge() {
	int age = -1;
	do {
	System.out.println("Enter an age");
	  while(!scanner.hasNextInt()){
		System.out.println("Age must be a number");
		scanner.nextLine();
	  }
	  age = scanner.nextInt();
	} while (age<0);
	System.out.println("Age -> " + age);
  }
  
  public static void inputJava(){
	do {	  
	  System.out.println("Type: Java");
	  if (scanner.nextLine().equals("Java")) break;
	} while (true);
  }
  
  public static void getUserInfo(){
	System.out.println("Enter your name: ");
	String name = scanner.nextLine();
	System.out.println("Enter your age: ");
	int age = scanner.nextInt();
	if(age <= 18){
	  System.out.println("Going to school");
	} else if(age <= 60){
	  System.out.println("Working");
	} else if(age <= 100) {
	  System.out.println("Retired");
	} else 
	  System.out.println("Are you sure?");
  }
}
