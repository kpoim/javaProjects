package poimenidis.javaexercises;

import java.util.Scanner;

public class Main {
  
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
	
// EXERCISE 1 TESTING ----------------
	System.out.println("-------  Exercise 1  ---------");
	Exercise1 temp = new Exercise1();
	System.out.println("number = " + temp.number);
	System.out.println("character = " + temp.character);
	System.out.println();
//------------------------------------


// EXERCISE 2 TESTING ----------------
  System.out.println("-------  Exercise 2  ---------");
	Circle myCircle = new Circle();
	System.out.println("Radius -> " + myCircle.getRadius());
	System.out.println("Area -> " + myCircle.getArea());
	System.out.println("toString() -> " + myCircle.toString());
	System.out.println();
//------------------------------------


// EXERCISE 3 TESTING ----------------
	System.out.println("-------  Exercise 3  ---------");
	Author oscar = new Author("Oscar Wilde", "oscar.wilde@gmail.com", "male");
	Book book = new Book("The picture of Dorian Gray", oscar);
	
	book.setPrice(19.98);
	book.setQty(12);
	
	System.out.println("Book's name -> " + book.getName());
	System.out.println("Book's price -> " + book.getPrice());
	System.out.println("Book's quantity -> " + book.getQty());
	
	System.out.println("Author's name -> " + book.getAuthorName());
	System.out.println("Author's email -> " + book.getAuthorEmail());
	System.out.println("Author's gender -> " + book.getAuthorGender());
	
	System.out.println("Book's toString() method: " + book.toString());
	System.out.println();
//------------------------------------


// EXERCISE 4 TESTING ----------------
	System.out.println("-------  Exercise 4  ---------");
	Rectangle rectangle = new Rectangle();
	System.out.println(rectangle.toString());
	rectangle.setLength(-10);
	rectangle.setWidth(21);
	System.out.println(rectangle.toString());
	rectangle.setLength(5);
	rectangle.setWidth(2);
	System.out.println(rectangle.toString());
	System.out.println("Area -> " + rectangle.getArea());
	System.out.println("Perimeter -> " + rectangle.getPerimeter());
	System.out.println();
//------------------------------------


// EXERCISE 5 TESTING ----------------
	System.out.println("-------  Exercise 5  ---------");
	System.out.println(fibonacci(0));
	System.out.println(fibonacci(2));
	System.out.println(fibonacci(8));
	System.out.println();
//------------------------------------


// RETURN VALID AGE EXERCISE TESTING ----------------
	System.out.println("-------  Exercise returnValidAge  ---------");
	System.out.println(returnValidAge());
	System.out.println();
//------------------------------------


	scanner.close();
  }
  
  public static int fibonacci(int num){
	return num < 1 ? -1 
		: num <= 2 ? 1
		: fibonacci(num - 1) + fibonacci(num - 2);
  }
  
  static int returnValidAge(){
	int age = 0;
	boolean gotInt = false;
	
	System.out.println("Enter your age");
	while(!gotInt){
	  if(!scanner.hasNextInt()) {
		System.out.println("Invalid input. Enter an integer.");
		scanner.next();
	  } else {
		age = scanner.nextInt();
		if(age<120 && age>0){
		  gotInt = true;
		} else {
		  System.out.println("Invalid integer value. Age must be between 0-120");
		}
	  }
	}
	return age;
  }
}
