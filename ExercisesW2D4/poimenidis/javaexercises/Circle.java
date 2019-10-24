package poimenidis.javaexercises;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Circle {
  
  private double radius;
  private String color;
  
  public Circle(){
	this(1.0, "red");
  }
  
  public Circle(double radius, String color){
	this.radius = radius;
	this.color = color;
  }
  
  public double getRadius(){
	return this.radius;
  }
  
  public Double getArea(){
	return Math.PI * Math.pow(this.radius, 2);
  }
  
  @Override
  public String toString(){
	List<Field> fields = Arrays.asList(this.getClass().getDeclaredFields());
	
	StringBuilder result = new StringBuilder();
	
	result.append("This is an instance of the class \"");
	result.append(this.getClass().getSimpleName());
	result.append("\"\nand has the following fields :\n");
	fields.forEach(field -> {
	  result.append(field.getName());
	  result.append(" -> ");
	  try {
		result.append(field.get(this).toString());
	  } catch (IllegalArgumentException | IllegalAccessException ex) {
		Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
	  }
	  result.append("\n");
	}
	);
	return result.toString();
  }
  
}
