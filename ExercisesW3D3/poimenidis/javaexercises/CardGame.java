package poimenidis.javaexercises;

import java.util.*;

/**
 * I made CardGame a class because it needs to hold instance variables<br>
 * and abstract because some methods must be implemented differently for each game.
 */

public abstract class CardGame {
  
  private Map<Player, Integer> scoreTable;
  private List<Card> cards;

  public CardGame() {
  }

  public CardGame(Map<Player, Integer> scoreTable, List<Card> cards) {
	this.scoreTable = scoreTable;
	this.cards = cards;
  }

  public Map<Player, Integer> getScoreTable() {
	return scoreTable;
  }

  public List<Card> getCards() {
	return cards;
  }
  
  public static List<Card> shuffle(List<Card> cards){
	List<Card> shuffled = new ArrayList<>(cards);
	/*
	  Shuffle the cards
	*/
	return shuffled;
  }
  
/**
 * <b>deal()</b> is an important, yet not very complicated action,<br>
 * so I made a very simple implementation that can be overriden.
 */
  public Card deal(){
	return cards.remove(0);
  }
  /**
   * <b>keepScore()</b> needs access to instance varibles<br>
   * so it could't be implemented in an Interface.
   */
  abstract void keepScore();
  
  /**
   * <b>displayRules()</b> seems essential to a card game and it was included in the<br>
   * class, but it must be implemented beacuse each game has its rules.
   */
  abstract void displayRules();

  @Override
  public String toString() {
	return "CardGame{" + "scoreTable=" + scoreTable + ", cards=" + cards + '}';
  }
  
}
