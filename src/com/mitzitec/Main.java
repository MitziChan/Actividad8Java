package com.mitzitec;

public class Main {
    public static void main(String[] args) {

        //objeto creado
        Deck miDeck = new Deck();

        miDeck.initPalos();
        miDeck.init();
        miDeck.shuffle();
        miDeck.head();
        miDeck.pick();
        miDeck.hand();
    }
}