import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	public void describe () {
		System.out.println(name);
		System.out.println(score);
		for (Card inHand : hand) {
			inHand.describe();
		}
	}
	public Card flip () {
		Card topCard = new Card();
		topCard = hand.remove(0);
		return topCard;
	}
	public void drawToHand (Deck deck) {
		hand.add(deck.Draw());
		
	}
	public void incrementScore () {
		this.score += 1;
	}	
}
