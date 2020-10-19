package com.mitzitec;

import java.util.*;

public class Deck {
    private HashMap<String,String> palos = new HashMap<String, String>();
    private ArrayList<Card> juego = new ArrayList<Card>();
    private String strFormat = "Quedan %s";

    public ArrayList<Card> getJuego() {
        return juego;
    }

    public void initPalos(){
        palos.put("Diamante","Rojo");
        palos.put("Trebol","Negro");
        palos.put("Pica","Negro");
        palos.put("Corazon","Rojo");
    }

    public void init(){
        for (Map.Entry<String,String> palo:palos.entrySet()){
            for (int i=1;i <= 13;i++){
                Card card = new Card(palo.getKey(), palo.getValue());
                card.setValor(i);
                juego.add(card);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(juego);
        System.out.println("Se mezcló el Deck");
    }

    public void head(){
        var card = juego.get(juego.size()-1);
        juego.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,juego.size()));
    }

    public void shuffle_head(){
        Collections.shuffle(juego);
    }

    public void pick(){
        var card = randomCard();
        juego.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,juego.size()));
    }

    public void hand(){
        if(juego.size() <= 5){
            for (var card:juego){
                printHand(juego);
            }
        }else {
            var cards = new ArrayList<Card>();
            Card card;
            for (int i=1;i<=5;i++){
                card = randomCard();
                juego.remove(card);
                cards.add(card);
            }
            printHand(cards);
            System.out.println(String.format(strFormat,juego.size()));
        }
    }

    private void printHand(ArrayList<Card> cards){
        for (var card: cards) System.out.println(card.toString());
    }

    private Card randomCard(){
        var rnd = (int)Math.floor(Math.random()*(1-juego.size()+1)+juego.size());
        return juego.get(rnd);
    }

    /*
    public void shuffle(){
        System.out.println("Se mezcló el Deck.");
        System.out.println("-------------------------------");
    }
    //Metodo 2
    public void head(){
        */
       /* int ValorPalo = r.nextInt(Palo.length);
        int ValorColor = r.nextInt(Color.length);
        int Value = r.nextInt(Valorr.length);
        inicio_cartas--;
        Palo[0]= String.valueOf(posicion-1);
        System.out.println("Palo: "+"{"+Palo[ValorPalo]+"}"+ " Color: "+"{"+Color[ValorColor]+"}"+ " Valor: "+"{"+Valorr[Value]+"}");
        System.out.println("Numero de cartas: "+inicio_cartas);*/
    //}

}
