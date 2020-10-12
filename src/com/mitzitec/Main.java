package com.mitzitec;

public class Main {

    public static void main(String args[])
    {

        int cantCard = 52;
        Deck miDeck = new Deck();
        miDeck.shuffle();
        System.out.printf("Primera carta: \n");
        for ( int i = 0; i < 1; i++ )
        {

            System.out.printf("%-20s\n",
                    miDeck.hand(), miDeck.hand(),
                    miDeck.hand(), miDeck.hand());
        }
        System.out.println("Quedan 51 cartas \n");
        System.out.println("Carta aleatoria: \n");
        for ( int i = 1; i < 2; i++ )
        {

            System.out.printf("%-20s\n",
                    miDeck.hand(), miDeck.hand(),
                    miDeck.hand(), miDeck.hand());
        }
        System.out.println("Quedan 51 cartas \n");
        System.out.printf("Cartas en mano: \n");
        for ( int i = 0; i < 5; i++ )
        {
            System.out.printf("%-20s\n",
                    miDeck.hand(), miDeck.hand(),
                    miDeck.hand(), miDeck.hand());
        }
        System.out.println("Quedan 47 cartas");

    }
}