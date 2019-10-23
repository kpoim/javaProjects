package javaexercises;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExercisesW2D3 {

  private static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
	System.out.println("Exercise 1: " + exercise1("Are you talking to me?"));
	System.out.println("--------------------------------------------");
	exercises3and4();
	System.out.println("--------------------------------------------");
	System.out.println(exercise5("abcvcba"));
	System.out.println("--------------------------------------------");
	System.out.println("Concatenate names: " + concatNames("Konstantinos", "Poimenidis"));
	scanner.close();
  }
  
  static int exercise1(String quote){
	String[] array = quote.split(" ");
	return array.length-1;
  }
  
  static void exercise2(){
	String str="Harry";
	int n=str.length();
	String mystery=str.substring(0,1)+str.substring(n-1,n);
	System.out.println(mystery); // -> "Hy"
}
  
  static void exercises3and4(){
	PrintWriter writer;
	System.out.print("Enter your name: ");
	String name = scanner.nextLine();
	System.out.print("Enter your surname: ");
	String surname = scanner.nextLine();
	System.out.print("Enter your age: ");
	int age = scanner.nextInt();
	scanner.nextLine();
	System.out.print("Enter your favourite colour: ");
	String colour = scanner.nextLine();
	if((age>18 && age<66) || colour.charAt(0) == 'b'){
	  try {
		writer = new PrintWriter("info.txt", "UTF-8");
		writer.println("Name: " + name);
		writer.println("Surname: " + surname);
		writer.println("Age: " + age);
		writer.println("Favourite colour: " + colour);
		writer.close();
	  } catch (FileNotFoundException | UnsupportedEncodingException ex) {
		Logger.getLogger(ExercisesW2D3.class.getName()).log(Level.SEVERE, null, ex);
	  }
	}
  }
  
  static String exercise5(String word){
	int lastPosition = word.length() - 1;
	int i = 0;
	StringBuilder result = new StringBuilder();
	while(i<word.length()/2){
	  if(word.charAt(i) == word.charAt(lastPosition-i))
		result.append(word.charAt(i++));
	  else break;
	}
	return result.toString();
  }
  
  static String concatNames(String fname, String lname){
	return fname.concat(" ").concat(lname).toUpperCase();
  }
  
}