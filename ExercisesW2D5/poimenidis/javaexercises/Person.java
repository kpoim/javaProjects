package poimenidis.javaexercises;

public class Person {
  private String name;
  private Integer age;
  private String color;
  private String sport;

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public Integer getAge() {
	return age;
  }

  public void setAge(Integer age) {
	this.age = age;
  }

  public String getColor() {
	return color;
  }

  public void setColor(String color) {
	this.color = color;
  }

  public String getSport() {
	return sport;
  }

  public void setSport(String sport) {
	this.sport = sport;
  }
  
  public void setInfo(String name, int age, String color, String sport){
	this.name = name;
	this.age = age;
	this.color = color;
	this.sport = sport;
  }
  
  public static String message(Person person){
	switch(person.getSport().toUpperCase()){
	  case "FOOTBALL": return "Football is a simple game; 22 men chase a ball for 90 minutes and at the end, the Germans win. -Gary Lineker";
	  case "BASKETBALL": return "Ask not what your teammates can do for you. Ask what you can do for your teammates. -Magic Johnson";
	  case "KARATE": return "Karate aims to build character, improve human behavior, and cultivate modesty; it does not, however, guarantee it. -Yasuhiro Konishi";
	  case "SWIMMING": return "With so many people saying it couldn’t be done, all it takes is an imagination. -Michael Phelps";
	  case "VOLLEYBALL": return "All I want out of life is that when I walk down the street folks will say, \"There goes the greatest hitter that ever lived.\" -Ted Williams";
	  default: return "Sorry there's nothing for " + person.getSport().toLowerCase();
	}
  }
  
}
