package poimenidis.javaexercises;

public class Array {
  
  private Double[] arrayOfIntegers;
  private String[] arrayOfStrings;
  private int length;
  
  public Array(int length){
	this.length = length;
	this.arrayOfIntegers = new Double[length];
	this.arrayOfStrings = new String[length];
  }
  
  public Array(Double[] values){
	this.arrayOfIntegers = values;
  }
  
  public Array(String[] values){
	this.arrayOfStrings = values;
  }
  
  public void add(double number){
	int index = currentArrayIndex(this.arrayOfIntegers);
	if(index == -1){
	  	System.out.println("Array is full");
	} else {
	  this.arrayOfIntegers[index] = number;
	  System.out.format("%.2f was added\n", number);
	}
  }
  
  public void add(String string){
	int index = currentArrayIndex(this.arrayOfStrings);
	if(index == -1){
	  	System.out.println("Array is full");
	} else {
	  this.arrayOfStrings[index] = string;
	  System.out.format("%s was added", string);
	}
  }
  
  public static void printArray(Array array){
	if(array.arrayOfIntegers[0] != null){
	  System.out.println(Array.print(array.arrayOfIntegers));
	} else if(array.arrayOfStrings[0] != null){
	  System.out.println(Array.print(array.arrayOfStrings));
	} else {
	  System.out.println("Array is empty");
	}
  }
  
  private static String print(Object[] array){
	StringBuilder result = new StringBuilder();
	for(Object item:array) result.append(item).append("\n");
	return result.toString();
  }
  
  private int currentArrayIndex(Object[] array){
	for(int i = 0; i < this.length; i++){
	  if(array[i] == null) return i;
	}
	return -1;
  }
  
  public double min(){
	double min = Double.POSITIVE_INFINITY;
	for(int i = 0; i < this.arrayOfIntegers.length; i++){
	  if(this.arrayOfIntegers[i] < min) min = this.arrayOfIntegers[i];
	}
	return min;
  }
  
  public double max(){
	double max = Double.NEGATIVE_INFINITY;
	for(Double number:this.arrayOfIntegers){
	  if(number > max) max = number;
	}
	return max;
  }
  
  public static void printReversed(Array array){
	if(array.arrayOfIntegers[0] != null){
	  for(int i = array.length - 1; i >= 0; i--){
		System.out.println(array.arrayOfIntegers[i]);
	  }
	}
	if(array.arrayOfStrings[0] != null){
	  for(int i = array.length - 1; i >= 0; i--){
		System.out.println(array.arrayOfStrings[i]);
	  }
	}
  }
  
  public double averageValue(){
	double sum = 0;
	for(Double num:this.arrayOfIntegers) sum+=num;
	return sum/this.arrayOfIntegers.length;
  }
  
  public String maximumLetters(){
	String max = "";
	for(String name:this.arrayOfStrings){
	  if(max.length() < name.length()) max = name;
	}
	return max;
  }
  
  public void getAnimalsThatDoNotStartWithC(){
	getStringsThatDoNotStartWithChar('c');
  }
  
  public void getStringsThatDoNotStartWithChar(char character){
	for(String string:this.arrayOfStrings){
	  if(string.charAt(0) != character) System.out.println(string);
	}
  }
}
