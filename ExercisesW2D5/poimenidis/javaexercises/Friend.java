package poimenidis.javaexercises;

public class Friend {
  
  private String name;
  private int age;
  
  
  public Friend(String name, int age){
	this.name = name;
	this.age = age;
  }

  public String getName() {
	return name;
  }

  public int getAge() {
	return age;
  }
  
  public void calculateAgeIn(Integer year){
	int yearOfBirth = 2019 - age;
	int ageInYear = year - yearOfBirth;
	if(ageInYear<0) System.out.format("%s was not born in %d", this.name, year);
	else if(ageInYear == 0) System.out.format("%s was born in that year", this.name);
	else if(year <= 2019) System.out.format("%s was %d in %d", this.name, ageInYear, year);
	  else System.out.format("%s will be %d in %d", this.name, ageInYear, year);
	if(ageInYear>100) System.out.println(", hopefully");
	else System.out.println();
  }
  
}
