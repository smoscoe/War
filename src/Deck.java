import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	private String[] firstName = {"Two", "Three","Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
			"Jack", "Queen", "King", "Ace"};
	private String[] lastName = {"of Spades", "of Hearts", "of Clubs", "of Diamonds"};
	
	public Deck() {

		for (String cardNameOne: lastName) {
			for(String cardNameTwo : firstName) {
				switch (cardNameTwo){
					case "Two":
						cards.add(new Card (2, (cardNameTwo + " " + cardNameOne)));
						break;
					case "Three":
						cards.add(new Card (3, cardNameTwo + " " + cardNameOne));
						break;
					case "Four":
						cards.add(new Card (4, cardNameTwo + " " + cardNameOne));
						break;
					case "Five":
						cards.add(new Card (5, cardNameTwo + " " + cardNameOne));
						break;
					case "Six":
						cards.add(new Card (6, cardNameTwo + " " + cardNameOne));
						break;
					case "Seven":
						cards.add(new Card (7, cardNameTwo + " " + cardNameOne));
						break;
					case "Eight":
						cards.add(new Card (8, cardNameTwo + " " + cardNameOne));
						break;
					case "Nine":
						cards.add(new Card (9, cardNameTwo + " " + cardNameOne));
						break;
					case "Ten":
						cards.add(new Card (10, cardNameTwo + " " + cardNameOne));
						break;
					case "Jack":
						cards.add(new Card (11, cardNameTwo + " " + cardNameOne));
						break;
					case "Queen":
						cards.add(new Card (12, cardNameTwo + " " + cardNameOne));
						break;
					case "King":
						cards.add(new Card (13, cardNameTwo + " " + cardNameOne));
						break;
					case "Ace":
						cards.add(new Card (14, cardNameTwo + " " + cardNameOne));
						break;
				} 
			}
		}
	}
	
	public void Shuffle () {
		Collections.shuffle(cards);
	}
	public Card Draw () {
		Card topCard = new Card();
		topCard = cards.remove(0);
		return topCard;
	}
}
