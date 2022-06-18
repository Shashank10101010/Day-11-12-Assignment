package com.bridgelab;

import java.util.Random;

public class DeckOfCard {

    public static void main(String[] args) {

        int numberShow[] = new int[36];
        String cardShow[] = new String[36];

        String[][] cards = new String[36][36];

        Random random = new Random();

        int numbers;
        int cardName;
        String cardNamePrint = "";

        for (int i = 0; i < 36; i++) {
            numbers = random.nextInt(13) + 1;
            numberShow[i] = numbers;
            cardName = random.nextInt(4);
            switch (cardName) {
                case 0:
                    cardNamePrint = "Clubs";
                    break;
                case 1:
                    cardNamePrint = "Diamonds";
                    break;
                case 2:
                    cardNamePrint = "Hearts";
                    break;
                case 3:
                    cardNamePrint = "Spades";
                    break;
            }
            cardShow[i] = cardNamePrint;
        }

        int k = 0;
        while (k < 4) {
            System.out.println("After suffle, cards received by player " + (k + 1));
            for (int i = 0; i < 9; i++) {
                System.out.print(numberShow[i] + " of " + cardShow[i] + ", ");
            }
            System.out.println();
            k++;
        }
    }
}

