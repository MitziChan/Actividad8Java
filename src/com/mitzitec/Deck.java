package com.mitzitec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;



public class Deck { private HashMap<String,String> palos = new HashMap< >();
    private ArrayList<Card> baraja = new ArrayList< >();

    public void shuffle(){ Collections.shuffle(baraja);
    System.out.println("");
    System.out.println("--------------------");
        System.out.println("Se mezcló el Deck ");
        System.out.println("--------------------"); }

    public ArrayList<Card> getJuego() {
        return baraja;
    }
    public void initPalos(){
        palos.put("CORAZÓN","ROJO");
        palos.put("DIAMANTE","ROJO");
        palos.put("TREBOL","NEGRO");
        palos.put("PICA","NEGRO");
    }
    public void init(){ for (Map.Entry<String,String> palo:palos.entrySet()){
            for (int i=1;i <= 13;i++){
                Card card = new Card(palo.getKey(), palo.getValue());
                card.setValor(i);
                baraja.add(card); }
        }
    }

    public void head(){
        System.out.println("Primer carta: "); var card = baraja.get(baraja.size()-1);
        baraja.remove(card);
        System.out.println(card.toString());
        System.out.println("Cartas restantes: " + baraja.size());
    }
    public void pick(){
        System.out.println("-------------------");
        System.out.println("Carta aleatoria:"); var card = randomCard();
        System.out.println(card.toString());
        System.out.println("Cartas restantes: " + baraja.size());
        baraja.remove(card);
    }
    public void hand(){
        System.out.println("--------------------");
        System.out.println("Cartas en mano: ");

        if(baraja.size() <= 5) { for (var card:baraja){ printHand(baraja); }
        }else { var cards = new ArrayList<Card>();
            Card card; for (int i=1;i<=5;i++)
            { card = randomCard();
                baraja.remove(card);
                cards.add(card);
            }printHand(cards);
            System.out.println("Cartas restantes: " + baraja.size());
        }
    }
    private void printHand(ArrayList<Card> cards){ for (var card: cards) System.out.println(card.toString());
    }
    private Card randomCard() { var rnd = (int)Math.floor(Math.random()*(1-baraja.size()+1)+baraja.size());
        return baraja.get(rnd);
    }
}