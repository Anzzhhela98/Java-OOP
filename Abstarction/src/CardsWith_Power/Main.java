package CardsWith_Power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String rank = scaner.nextLine();
        String suit = scaner.nextLine();

        Card card = new Card(Rank.valueOf(rank), Suit.valueOf(suit));

        int result = card.PowerOfCard();
        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, result);
    }
}
