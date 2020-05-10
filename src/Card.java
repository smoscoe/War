
public class Card {
	
	private int value;
	
	private String name;
	
	public Card (int value, String name) {
		this.value = value;
		this.name = name;
	}
		
	public Card() {
	}

	public void setCardValue (int e) {
		this.value = e;
	}
	public int getCardValue () {
		return value;
	}
	public void setCardName (String str) {
		this.name = str;
	}
	public String getCardName () {
		return name;
	}
	public void describe () {
		System.out.println(getCardValue());
		System.out.println(getCardName());
	}

}
