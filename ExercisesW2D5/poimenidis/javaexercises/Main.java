package poimenidis.javaexercises;

public class Main {

  public static void main(String[] args) {
	
	// CALCULATIONS TESTING ----------------
	System.out.println("-------  CALCULATIONS 1 ---------");
	double result = Calculator.add(Calculator.subtract(10, Calculator.multiply(2, 3)), Calculator.divide(6, 2));
	System.out.println(result);
	System.out.println();
	//------------------------------------
	
	
	// CALCULATIONS TESTING ----------------
	System.out.println("-------  CALCULATIONS 2 ---------");
	Calculator.divisible();
	System.out.println();
	//------------------------------------
	
	// CALCULATIONS TESTING ----------------
	System.out.println("-------  CALCULATIONS 3 ---------");
	
	Friend friend1 = new Friend("Max", 23);
	Friend friend2 = new Friend("Andy", 40);
	Friend friend3 = new Friend("Steph", 80);
	
	friend1.calculateAgeIn(1970);
	friend2.calculateAgeIn(1979);
	friend3.calculateAgeIn(2040);
	System.out.println();
	//------------------------------------
	
	// ARRAYS TESTING ----------------
	System.out.println("-------  ARRAYS 1 ---------");
	Array array1 = new Array(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5});
	System.out.println("Min: " + array1.min());
	System.out.println("Max: " + array1.max());
	Array.printArray(array1);
	System.out.println();
	//------------------------------------
	
	// ARRAYS TESTING ----------------
	System.out.println("-------  ARRAYS 2 ---------");
	Array ages = new Array(5);
	ages.add(12);
	ages.add(22);
	ages.add(32);
	ages.add(42);
	ages.add(52);
	System.out.println("Minimum age: " + ages.min());
	System.out.println("Maximum age: " + ages.max());
	Array.printReversed(ages);
	System.out.println("Average age: " + ages.averageValue());
	
	System.out.println();
	//------------------------------------
	
	// ARRAYS TESTING ----------------
	System.out.println("-------  ARRAYS 3 ---------");
	Array array3 = new Array(new String[]{"Jim", "John", "Andy", "Peter", "Josh"});
	System.out.println("Name with max letters: " + array3.maximumLetters());
	System.out.println();
	//------------------------------------
	
	// ARRAYS TESTING ----------------
	System.out.println("-------  ARRAYS 4 ---------");
	Array array4 = new Array(new String[]{"camel", "dog", "cat", "crocodile", "catfish", "chicken", "parrot", "panda"});
	array4.getAnimalsThatDoNotStartWithC();
	System.out.println();
	//------------------------------------
	
	// CALCULATIONS TESTING ----------------
	System.out.println("-------  INPUT 1 ---------");
	Input.inputAge();
	System.out.println();
	//------------------------------------
	
	// CALCULATIONS TESTING ----------------
	System.out.println("-------  INPUT 2 ---------");
	Input.inputJava();
	System.out.println();
	//------------------------------------
	
	// CALCULATIONS TESTING ----------------
	System.out.println("-------  INPUT 4 ---------");
	Input.getUserInfo();
	System.out.println();
	//------------------------------------
	
	// CLASSES 1 TESTING ----------------
	System.out.println("-------  CLASSES 1  ---------");
	Person person1 = new Person();
	person1.setName("Jim");
	person1.setAge(15);
	person1.setColor("Blue");
	person1.setSport("Basketball");
	Person person2 = new Person();
	person2.setName("Andy");
	person2.setAge(25);
	person2.setColor("Red");
	person2.setSport("Football");
	Person person3 = new Person();
	person3.setName("Jess");
	person3.setAge(20);
	person3.setColor("Pink");
	person3.setSport("Swimming");
	Person[] persons = {person1, person2, person3};
	for(int i = 0; i < persons.length; i++){
	  System.out.format("%s's (%d) favorite color is %s and favorite sport is %s%n", persons[i].getName(), persons[i].getAge(), persons[i].getColor(), persons[i].getSport());
	}
	Person min = persons[0];
	Person max = persons[0];
	for(Person person:persons) if(person.getAge() < min.getAge()) min = person;
	System.out.format("%s, %d years old, is the youngest one of the group%n", min.getName(), min.getAge());
	int counter = 0;
	while(counter < persons.length){
	  if(persons[counter].getAge() > max.getAge()) max = persons[counter];
	  counter++;
	}
	System.out.format("%s, %d years old, is the oldest one of the group%n", max.getName(), max.getAge());
	System.out.println();
	//------------------------------------
	
	// CLASSES 2 TESTING ----------------
	System.out.println("-------  CLASSES 2  ---------");
	Person person4 = new Person();
	person4.setInfo("John", 30, "Green", "Volleyball");
		System.out.format("%s's (%d) favorite color is %s and favorite sport is %s%n", person4.getName(), person4.getAge(), person4.getColor(), person4.getSport());
	System.out.println();
	//------------------------------------
	
	// CLASSES 3 TESTING ----------------
	System.out.println("-------  CLASSES 3  ---------");
	System.out.println(Person.message(person2));
	System.out.println();
	//------------------------------------
	
	// CALCULATIONS TESTING ----------------
	System.out.println("-------  CLASSES 6  ---------");
	PersonBank person5 = new PersonBank("Jim", 17);
	person5.createAccount();
	
	PersonBank person6 = new PersonBank("Andy", 22);
	person6.createAccount();
	person6.createAccount();
	person6.createAccount();
	System.out.println(person6.toString());
	person6.getAccounts()[0].deposit(12.33);
	person6.getAccounts()[1].deposit(120);
	person6.getAccounts()[2].deposit(74);
	person6.getAccounts()[0].withdraw(1.33);
	System.out.println(person6.toString());
	
	PersonBank person7 = new PersonBank("Jess", 27);
	person7.createAccount();
	person7.createAccount();
	person7.createAccount();
	person7.getAccounts()[0].deposit(1000);
	person7.getAccounts()[0].setIsActive(false);
	person7.getAccounts()[1].deposit(100);
	person7.getAccounts()[2].deposit(10);
	System.out.println(person7.toString());
	
	System.out.println("The richest is " + PersonBank.getRichest(new PersonBank[]{person6, person7}).getName());
	System.out.println("The poorest is " + PersonBank.getPoorest(new PersonBank[]{person6, person7}).getName());
	
	System.out.println();
	//------------------------------------
  }
  
}
