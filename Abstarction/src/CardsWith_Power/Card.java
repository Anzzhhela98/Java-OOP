package CardsWith_Power;

public class Card {
    private Rank rank;
    private Suit suit;
    private int power;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int PowerOfCard(){
        return this.rank.getRank() + this.suit.getSuit();
    }

    public void setPower(int power) {
        this.power = power;
    }
}
