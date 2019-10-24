package poimenidis.javaexercises;

public class Rectangle {
  
  
  private double length = 1;
  private double width = 1;
  
  public double getPerimeter(){
	return (length + width) * 2;
  }
  
  public double getArea(){
	return length * width;
  }

  public double getLength() {
	return length;
  }

  public void setLength(double length) {
	this.length = verify(length);
  }

  public double getWidth() {
	return width;
  }

  public void setWidth(double width) {
	this.width = verify(width);
  }
  
  private double verify(double value){
	return (value>0 && value<20) ? value : 1;
  }
  
  @Override
  public String toString(){
	return "length -> " + length + "\nwidth -> " + width;
  }
  
}
