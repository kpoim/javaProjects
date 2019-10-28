package poimenidis.javaexercises;

public class Calculator {
  
  public static double add(double num1, double num2){
	return num1 + num2;
  }
  
  public static double subtract(double num1, double num2){
	return num1 - num2;
  }
  
  public static double multiply(double num1, double num2){
	return num1 * num2;
  }
  
  public static double divide(double num1, double num2){
	return num1 / num2;
  }
  
  public static void divisible(){
	divisible(0, 100, 4, 5);
  }
  
  public static void divisible(Integer start, Integer end, Integer num1, Integer num2){
	Integer min = Math.min(num1, num2);
	Integer max = Math.max(num1, num2);
	Integer loopStart = start;
	Integer total = end - start;
	Integer divisibleCounter = 0;
	while(loopStart % min != 0) loopStart++;
	for(int i = loopStart; i <= end; i += min) {
	  if(i % num2 == 0){
		divisibleCounter++;
		System.out.println("Number '" + i + "' is divisible by both '" + min + "' & '" + max + "'");
	  }
	}
//	System.out.println(divisibleCounter + " number in the range " + start " - " + end );
	System.out.format("%d numbers in the range %d - %d are divisible by both %d and %d.%n%d numbers are not.%n", divisibleCounter, start, end, min, max, (total - divisibleCounter));
  }
  
}
