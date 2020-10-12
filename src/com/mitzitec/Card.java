package com.mitzitec;

public class Card {

    private String cara;
    private String palo;
    private String color;
    public Card( String caraCarta, String paloCarta, String colorCarta) {
        cara = caraCarta;
        palo = paloCarta;
        color = colorCarta;

    }

    public String toString()
    {
        return cara + " de " + palo + " " + color;
    }
}