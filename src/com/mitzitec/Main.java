package com.mitzitec;
import java.util.Scanner;


public class Main {

    int caso;
    public void showMenu(){
        Deck miDeck = new Deck();

        System.out.println("¡Bienvenido a Poker!\n Seleccióne una opción:\n 1. Mezclar deck\n 2. Sacar una carta\n " +
                "3. Carta aleatoria\n 4. Generar una mano de 5 cartas\n 0. Salir");

        Scanner sc = new Scanner(System.in);
        caso = sc.nextInt();

        switch (caso) {
            case 0:
                System.out.println("--------------------");
                System.out.println("Fin del juego <3");
                System.out.println("--------------------");
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
    public void volverMenu(){
        while (caso<0 || caso >4){
            System.out.println("");
            System.out.println("Opción invalida");
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("DIGITE UNA NUEVA OPCIÓN");
            System.out.println("-------------------------");
            System.out.println("");
            showMenu();
        }

    }

    public static void main(String[] args) {
        Main Menu = new Main();
        Menu.showMenu();
        Menu.volverMenu();

    }
}