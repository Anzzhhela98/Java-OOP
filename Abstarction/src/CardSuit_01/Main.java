package CardSuit_01;

public class Main {
    public static void main(String[] args) {
        CardSuits[] cardsTypes = CardSuits.values();
        System.out.println("Card Suits:");

        for (CardSuits value : cardsTypes) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(), value);
        }
    }
}
