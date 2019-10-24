package poimenidis.javaexercises;

public class Book {
  String name;
  Author author;
  double price;
  int qty;
  
  public Book(String name, Author author){
	this.name = name;
	this.author = author;
  }

  public String getName() {
	return name;
  }

  public Author getAuthor() {
	return author;
  }

  public double getPrice() {
	return price;
  }

  public int getQty() {
	return qty;
  }

  public void setPrice(double price) {
	this.price = price;
  }

  public void setQty(int qty) {
	this.qty = qty;
  }
  
  public String getAuthorName(){
	return this.author.getName();
  }
  
  public String getAuthorEmail(){
	return this.author.getEmail();
  }
  
  public String getAuthorGender(){
	return this.author.getGender();
  }
  
  @Override
  public String toString(){
	StringBuilder result = new StringBuilder();
	result.append("Book[name=")
		.append(this.name)
		.append(",")
		.append(this.author.toString())
		.append(",price=")
		.append(this.price)
		.append(",qty=")
		.append(this.qty);
	return result.toString();
  }
  
  
}
