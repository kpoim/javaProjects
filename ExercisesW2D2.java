/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author poime
 */
public class ExercisesW2D2{// implements Comparator<Number>{

  static Random rand = new Random();
  static Scanner scanner = new Scanner(System.in);
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	// TODO code application logic here

	System.out.println("Exercise 2");
	exercise2(10);
	System.out.println("--------------------------------------------");
	System.out.println("Exercise 3");
	exercise3();
	System.out.println("--------------------------------------------");
	System.out.println("Exercise 4");
	exercise4();
	System.out.println("--------------------------------------------");
	System.out.println("Exercise 5");
	exercise5();
	System.out.println("--------------------------------------------");
	System.out.println("Exercise 6");
	exercise6(10);
	System.out.println("--------------------------------------------");
	System.out.println("Exercise 7");
	exercise7();
	System.out.println("--------------------------------------------");
	System.out.println("Some math 1");
	someMath1(new Integer[]{20, 35, 50, 65});
	System.out.println("--------------------------------------------");
	System.out.println("Some math 2");
	someMath2(900, 9);
	System.out.println("--------------------------------------------");
	System.out.println("Some math 3");
	System.out.println(someMath3(5));
	System.out.println("--------------------------------------------");
	System.out.println("Control flow 1");
	controlFlow1(5);
	System.out.println("--------------------------------------------");
	System.out.println("Control flow 2");
	controlFlow2(7);
	System.out.println("--------------------------------------------");
	System.out.println("Control flow 3");
	controlFlow3(5);
	System.out.println("--------------------------------------------");
	System.out.println("Control flow 4");
	controlFlow4(4);
	System.out.println("--------------------------------------------");
	System.out.println("Control flow 5");
	controlFlow5('A');
	System.out.println("--------------------------------------------");
	System.out.println("Control flow 6");
	controlFlow6(17);
	System.out.println("--------------------------------------------");
	System.out.println("Control flow 7");
	controlFlow7(80);
	System.out.println("--------------------------------------------");
	System.out.println("Control flow 8");
	controlFlow8(4);
	System.out.println("--------------------------------------------");
	System.out.println("Loops Arrays 1 ");
	loopsArrays1();
	System.out.println("--------------------------------------------");
	System.out.println("Loops Arrays 2");
	loopsArrays2();
	System.out.println("--------------------------------------------");
	
	
  }
  
  static void exercise1(){
	int siblings;
	int finalGrade;
	long earthPopulation;
	int countyPopulation;
	int busPassengers;
	int historicYear;
	float automobilePrice;
  }
  
  static void exercise2(double nauticalMiles){
	double km = nauticalMiles*1.852;
	double miles = nauticalMiles*1.150779;
	System.out.println(nauticalMiles + " nautical miles = " + km + " kilometers");
	System.out.println(nauticalMiles + " nautical miles = " + miles + " miles");
  }
  
  static void exercise3(){
	int sum, x;
	x=1;
	sum=0;
	sum+=x;
	System.out.println("The sum is: " + sum);
  }
  
  static void exercise4(){
	int[] array = new int[11];
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	for(int i=0; i<11; i++){
	  array[i] = rand.nextInt();
	  if(array[i]>max) max = array[i];
	  if(array[i]<min) min = array[i];
	  System.out.println("array[" + i + "] = " + array[i]);
	}
	for(int i=10; i>=0; i--)
	  System.out.println("array[" + i + "] = " + array[i]);
	System.out.println("Largest: " + max);
	System.out.println("Smallest: " + min);
  }
  
  static void exercise5(){
	int counter = 1;
	int sum = 0;
	while(counter<11){
	  sum+=counter++;
	}
	System.out.println("Sum from 1 to 10 = " + sum);
  }
  
  static void exercise6(int var){
	switch(var){
	  case 7: 
		System.out.println("Hello");
		break;
	  case 10:
		System.out.println("Hi");
		break;
	  case 444:
		System.out.println("Good");
		break;
	  default:
		System.out.println("No Match Found");
	}
  }
  
  static void exercise7(){
	for(int i=4; i<101; i+=4){
	  if(i%5!=0) System.out.println(i);
	}
  }
  
  static void someMath1(Integer[] ages){
	int currentYear = 2019;
	for(int i=0; i<ages.length; i++){
	  System.out.println("Person " + i + " was born in " + (currentYear-ages[i]));
	  String message1 = ages[i] > currentYear - 1960
		  ? "He/She was " + (1960+ages[i]-currentYear) + " years old back in 1960"
		  : "He/She was not born in 1960";
	  System.out.println(message1);
	  int age2040 = ages[i]+2040-currentYear;
	  System.out.println("He/She will be " + age2040 + " years old in 2040");
	  if(age2040>100) System.out.println("Or not.");
	}
  }
  
  static void someMath2(Integer monthlySalary, double tax){
	Double netMonthlySalary = monthlySalary * (100-tax)/100;
	Double monthlyTax = monthlySalary - netMonthlySalary;
	System.out.println("Net salary: " + netMonthlySalary + "$/m  -  "
	  + (netMonthlySalary*12) + "$/y");
	System.out.println("Tax: " + monthlyTax + "$/m  -  "
	  + (monthlyTax*12) + "$/y");
  }
  
  static boolean someMath3(int num){
	return num%3==0;
  }
  
  static void controlFlow1(int age){
	if(age<6){
	  System.out.println("Propaly too young for school");
	} else if(age<12){
	  System.out.println((age-5) + " grade");
	} else if(age<15){
	  System.out.println((age-11) + " grade of middle school");
	} else if(age<18){
	  System.out.println((age-14) + " grade of high school");
	} else {
	  System.out.println("Propaly too old for school");
	}
  }
  
  static void controlFlow2(int hour){
	if(hour<0){
	  System.out.println("Invalid");
	} else if(hour<7){
	  System.out.println("ZZzzZZZzzZzZz...");
	} else if(hour<9){
	  System.out.println("Eating breakfast");
	}else if(hour<14){
	  System.out.println("In class");
	} else if(hour<15){
	  System.out.println("Lunch time");
	} else if(hour<17){
	  System.out.println("Again in class");
	} else if(hour<21){
	  System.out.println("Studying");
	} else if(hour<24){
	  System.out.println("Relaxing");
	} else {
	  System.out.println("I wish a day had " + hour + " hours so I could sleep a bit longer");
	}
  }
  
  static void controlFlow3(int month){
	if (month<3){
	  System.out.println("Winter");
	} else if(month<6){
	  System.out.println("Spring");
	} else if(month<9){
	  System.out.println("Summer");
	} else if (month<12){
	  System.out.println("Autumn");
	} else if(month==12){
	  System.out.println("Winter");
	} else {
	  System.out.println("A year has 12 months");
	}
  }
  
  static void controlFlow4(int month){
	switch(month){
	  case 1:
	  case 3:
	  case 5:
	  case 7:
	  case 8:
	  case 10:
	  case 12:
		System.out.println("31 days");
		break;
	  case 4:
	  case 6:
	  case 9:
	  case 11:
		System.out.println("30 days");
		break;
	  case 2:
		System.out.println("Most of the time 28 days");
		break;
	  default:
		  System.out.println("That particular month has 0 days");
	}
  }
  
  static void controlFlow5(char c){
		System.out.println(c == 'A' ? "Perfect"
		: c == 'B' ? "Good"
		: c == 'C' ? "Pass"
		: c == 'D' ? "Pass"
		: "Fail");
  }

static void controlFlow6(int age){
  System.out.println(age<16 ? "You cannot drive"
	  : age<18 ? "You can drive but not vote"
		  : age<22 ? "You can vote but not drink"
			  : "You can do anything");
}

  static void controlFlow7(int weight){
	System.out.println(weight + " kg on Earth is:");
	System.out.println((weight*0.78) + " kg on Venus");
	System.out.println((weight*0.39) + " kg on Mars");
	System.out.println((weight*2.65) + " kg on Jupiter");
	System.out.println((weight*1.17) + " kg on Saturn");
	System.out.println((weight*1.05) + " kg on Uranus");
	System.out.println((weight*1.23) + " kg on Neptune");
  }
  
  static void controlFlow8(int day){
	switch(day){
	  case 1:
		System.out.println("Monday");
		break;
	  case 2:
		System.out.println("Tuesday");
		break;
	  case 3:
		System.out.println("wednesday");
		break;
	  case 4:
		System.out.println("Thursday");
		break;
	  case 5:
		System.out.println("Friday");
		break;
	  case 6:
		System.out.println("Saturday");
		break;
	  case 7:
		System.out.println("Sunday");
		break;
	  default:
		  System.out.println("Try something in the range 1-7");
	}
  }
  
  static void loopsArrays1(){
	System.out.println("Enter the names of your 4 best friends");
	String[] names = new String[]{scanner.nextLine(), scanner.nextLine(),scanner.nextLine(), scanner.nextLine()};
	for(String name:names) System.out.println(name);
  }
  
  static void loopsArrays2(){
	int[] arr = new int[]{rand.nextInt(), rand.nextInt(), rand.nextInt(), rand.nextInt(), rand.nextInt()};
	
	int sum = 0;
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	for(int num:arr){
	  sum+=num;
	  if(num > max) max = num;
	  if(num < min) min = num;
	}
	
	double average = sum / arr.length;
	
	System.out.println("Sum: " + sum);
	System.out.println("Min: " + min);
	System.out.println("Max: " + max);
	System.out.println("Average: " + average);
	 
  }
  
}