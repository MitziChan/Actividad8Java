package com.mitzitec;


import java.util.Random;

public class Deck {
    private Card paquete[];
    private int cartaActual;
    private final int NUMERO_DE_CARTAS = 52;
    private Random numerosAleatorios;



    public Deck()
    {

        String caras[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
                "OCHO", "NUEVE", "DIEZ", "J", "Q", "K"};
        String palos[] = { "CORAZONES", "DIAMANTES", "TREBOLES", "PICAS"};
        String color[] = {" ROJA", " NEGRA", " ROJA", " NEGRA"};


        paquete = new Card[ NUMERO_DE_CARTAS ];
        cartaActual = 0;
        numerosAleatorios = new Random();

        for ( int cuenta = 0; cuenta < paquete.length; cuenta++ )
            paquete[ cuenta ] = new Card( caras[cuenta % 13], palos[cuenta/13], color[cuenta/13]);

    }


    public void shuffle() {
        cartaActual = 0;

        for ( int primera = 0; primera < paquete.length; primera++ )
        {
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

            Card temp = paquete[primera];

            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;



        }
        System.out.println("");
        System .out.println("Se mezcló el Deck");
        System.out.println("");

    }




    public Card hand()
    {
        if (cartaActual < paquete.length )
            return paquete[cartaActual++];
        else return null;
    }
}