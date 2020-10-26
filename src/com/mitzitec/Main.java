package com.mitzitec;
import java.util.Scanner;

public class Main {

    int caso;

    public void showMenu()throws Exception{

        Deck miDeck = new Deck();
        System.out.println("Seleccióne una opción:\n 1. Mezclar deck\n 2. Sacar una carta\n " +
                "3. Carta aleatoria\n 4. Generar una mano de 5 cartas\n 0. Salir");

        Scanner sc = new Scanner(System.in);
        caso = sc.nextInt();

        switch (caso) {
            case 0:
                System.out.println("Gracias por jugar <3");
                break;
            case 1:
                miDeck.initPalos();
                miDeck.init();
                miDeck.shuffle();
                break;
            case 2:
                miDeck.initPalos();
                miDeck.init();
                miDeck.shuffleCarta();
                miDeck.head();

                break;
            case 3:
                miDeck.initPalos();
                miDeck.init();
                miDeck.shuffleCarta();
                miDeck.pick();
                break;
            case 4:
                miDeck.initPalos();
                miDeck.init();
                miDeck.shuffleCarta();
                miDeck.hand();
                break;
        }

    }
    public void volverMenu()throws Exception{
        if (caso == 0 || caso == 1 || caso == 2 || caso == 3 || caso == 4) {
            showMenu();
            volverMenu();
        } else if (caso > 4){
            System.out.println("Opción no valida, porfavor digíte una correcta");
            showMenu();
            volverMenu();
        }

    }

    public static void main(String[] args)throws Exception {
        System.out.println("¡Bienvenido a Poker!");

        Main Menu = new Main();
        Menu.showMenu();
        Menu.volverMenu();


    }
}