package poimenidis.javaexercises;

public class Card {
  private Integer number;
  private String symbol;

  public Card(Integer number) {
	this.number = number;
  }

  @Override
  public String toString() {
	return "Card{" + "number=" + number + '}';
  }
  
  
}
