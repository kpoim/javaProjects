package poimenidis.javaexercises;

public class Librarian {
  
  private Library library;

  public Librarian(Library library) {
	this.library = library;
  }

  public Librarian() {}
  
  public void findMeBooksFromAuthor(Author author){
	library.printBookFromAuthor(author);
  }
  
  public void findMeAvailableBooks(){
	library.printAvailableBooks();
  }
  
  public void findMeBook(String bookTitle){
	library.printBookDetails(bookTitle);
  }
  
  public void findMostPopularBook(){
	library.printTheMostPopularBook();
  }
  
  public void rentBook(String bookTitle){
	for(Book book:library.getBooks()){
	  if(bookTitle.equals(book.getTitle()) && book.isAvailable()){
		library.rentBook(book);
		System.out.println("Enjoy reading " + bookTitle);
		return;
	  }
	}
	System.out.println(bookTitle + " is not available.");
  }
  
}
