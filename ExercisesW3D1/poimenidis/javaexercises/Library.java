package poimenidis.javaexercises;

public class Library {
  
  private Book[] books;

  public Library(Book[] books) {
	this.books = books;
  }

  public Library() {}

  public Book[] getBooks() {
	return books;
  }
  
  public void printAvailableBooks(){
	for(Book book:books){
	  if(book.isAvailable()) System.out.println(book.getTitle());
	}
  }
  
  public void printBookDetails(String bookTitle){
	for(Book book:books){
	  if(book.getTitle().equals(bookTitle)){
		book.toString();
		return;
	  }
	}
  }
  
  public void printBookFromAuthor(Author authorToSearch){
	for(Book book:books){
	  if(book.getAuthor().getName().equals(authorToSearch.getName()))
		System.out.println(book.toString());
	}
  }
  
  public void printTheMostPopularBook(){
	int counter = 0;
	Book popularBook = this.books[counter];
	while(++counter < this.books.length){
	  if(popularBook.getTimesRented() < this.books[counter].getTimesRented())
		popularBook = this.books[counter];
	}
	System.out.println(popularBook.toString());
  }
  
  public void rentBook(Book book){
	book.rentBook();
  }
  
}
