
public class App {

	public static void main(String[] args) {
		Player playerOne = new Player("Player One");
		Player playerTwo = new Player("Player Two");
		Deck deck = new Deck();
		deck.Shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				playerOne.drawToHand(deck);
			}else {
				playerTwo.drawToHand(deck);
			}
		}
			
		for (int i = 0; i < 26; i++) { 
			int a = (playerOne.flip().getCardValue());
			int b = (playerTwo.flip().getCardValue());
			if(a > b) {
				playerOne.incrementScore();
			} else if(b > a) {
				playerTwo.incrementScore();
			}
		}
		
		System.out.println("Final Score:\n" + playerOne.getName() + ": " + playerOne.getScore() + "\n" + 
		playerTwo.getName() + ": " + playerTwo.getScore());
		
		
		if(playerOne.getScore() > playerTwo.getScore()) {
			System.out.println(playerOne.getName() + " Wins");
			
		}else if(playerTwo.getScore() > playerOne.getScore()) {
			System.out.println(playerTwo.getName() + " Wins");
			
		} else {
			System.out.println("The War is a Draw");
		}
	}
}
