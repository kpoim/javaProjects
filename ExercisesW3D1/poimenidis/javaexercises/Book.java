package poimenidis.javaexercises;

public class Book {
  
  private String title;
  private Author author;
  private String isbn;
  private int physicalCopies;
  private int availableCopies;
  private int timesRented;

  public Book() {
  }

  public Book(String title, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented) {
	this.title = title;
	this.author = author;
	this.isbn = isbn;
	this.physicalCopies = physicalCopies;
	this.availableCopies = availableCopies;
	this.timesRented = timesRented;
  }

  public String getTitle() {
	return title;
  }

  public void setTitle(String title) {
	this.title = title;
  }

  public Author getAuthor() {
	return author;
  }

  public void setAuthor(Author author) {
	this.author = author;
  }

  public String getIsbn() {
	return isbn;
  }

  private void setIsbn(String isbn) {
	this.isbn = isbn;
  }

  public int getPhysicalCopies() {
	return physicalCopies;
  }

  public void setPhysicalCopies(int physicalCopies) {
	this.physicalCopies = physicalCopies;
  }

  public int getAvailableCopies() {
	return availableCopies;
  }

  public void setAvailableCopies(int availableCopies) {
	this.availableCopies = availableCopies;
  }

  public int getTimesRented() {
	return timesRented;
  }

  public void setTimesRented(int timesRented) {
	this.timesRented = timesRented;
  }
  
  public boolean isAvailable(){
	return getAvailableCopies()>0;
  }
  
  public boolean hasAuthor(String author){
	return this.author.equals(author);
  }

  public void rentBook(){
	this.availableCopies--;
	this.timesRented++;
  }
  
  public void returnBook(){
	this.availableCopies++;
  }
  
  @Override
  public String toString() {
	return "Book{" + "title=" + title + ", " + author.toString() + ", isbn=" + isbn + ", physicalCopies=" + physicalCopies + ", availableCopies=" + availableCopies + ", timesRented=" + timesRented + '}';
  }
  
  
  
}
