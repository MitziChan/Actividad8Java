package com.mitzitec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.Exception;

public class Deck { private HashMap<String, String> palos = new HashMap<String, String>();
    public ArrayList<Card> baraja = new ArrayList<Card>();
    boolean jugar = true;

    public void shuffle() {
        for (int i = 0; i < 1; i++) {
            Collections.shuffle(baraja);
            System.out.println("--------------------");
            System.out.println("Se mezcló el Deck");
            System.out.println("--------------------");
        }
    }

    public void shuffleCarta() {
        for (int i = 0; i < 1; i++) {
            Collections.shuffle(baraja);
        }
    }


    public ArrayList<Card> getJuego() {
        return baraja;
    }

    Deck(){
        initPalos();
        init();
    }


    public void initPalos() {
        palos.put("CORAZÓN", "ROJO");
        palos.put("DIAMANTE", "ROJO");
        palos.put("TREBOL", "NEGRO");
        palos.put("PICA", "NEGRO");
    }

    public void init() { for (Map.Entry<String, String> palo : palos.entrySet()) {
            for (int i = 1; i <= 13; i++) {
                Card card = new Card(palo.getKey(), palo.getValue());
                card.setValor(i);
                baraja.add(card);
            }
        }
    }


    public void head() throws Exception{
        System.out.println("");
        if (baraja.isEmpty()) throw new Exception("Se agotaron las cartas de Poker :( ");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Sacar Carta: "); var card = baraja.get(baraja.size() - 1);
        System.out.println("--------------------");
        baraja.remove(card);
        System.out.println(card.toString());
        System.out.println("Cartas restantes " + baraja.size());

    }

    public void pick() throws Exception{
        System.out.println("");
        if (baraja.isEmpty()) throw new Exception("Se agotaron las cartas de Poker :( ");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Carta aleatoria: ");
        System.out.println("--------------------");
        var card = baraja.get(baraja.size() - 1);
        baraja.remove(card);
        System.out.println(card.toString());
        System.out.println("Cartas restantes " + baraja.size());


    }

    public void hand() throws Exception {
        System.out.println("");
        if (baraja.isEmpty()) throw new Exception("Se agotaron las cartas de Poker :( ");
        System.out.println("");
        if(baraja.size() <=5) throw new Exception("No hay tantas cartas disponibles para sacar una mano de 5");
        for (int i = 0; i < 1; i++) {
            System.out.println("");
            System.out.println("--------------------");
            System.out.println("Cartas en mano: ");
            System.out.println("--------------------");
            if (baraja.size() <= 5) {
                for (var card : baraja) {
                    printHand(baraja);
                }
            } else {
                var cards = new ArrayList<Card>();
                Card card;
                for (int e = 1; e <= 5; e++) {
                    card = randomCard();
                    baraja.remove(card);
                    cards.add(card);
                }
                printHand(cards);
                System.out.println("Cartas restantes: " + baraja.size());
            }
        }
    }

    private void printHand(ArrayList<Card> cards) {
        for (var card : cards) System.out.println(card.toString());
    }

    private Card randomCard() { var rnd = (int) Math.floor(Math.random() * (1 - baraja.size() + 1) + baraja.size());
        return baraja.get(rnd);
    }
}