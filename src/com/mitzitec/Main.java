package com.mitzitec;
import java.util.Scanner;

public class Main {


    Deck miDeck = new Deck();


    public void showMenuu() {
        System.out.println("Seleccióne una opción:\n 1. Mezclar deck\n 2. Sacar una carta\n " +
                "3. Carta aleatoria\n 4. Generar una mano de 5 cartas\n 0. Salir");
    }

    public int ask() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("----------------------");
        System.out.print("Seleccione una opción: ");
        var caso = sc.nextInt();
        return caso;
    }
    public void showMenu(int caso)throws Exception{
        switch (caso) {
            case 0:
                System.out.println("Gracias por jugar <3");
                miDeck.jugar = false;
                break;
            case 1:
                miDeck.shuffle();
                if (miDeck.baraja.isEmpty()){

                    System.out.println("Se agotaron las cartas de Poker :(");
                    miDeck.jugar = false;
                }
                break;
            case 2:

                miDeck.head();
                if (miDeck.baraja.isEmpty()){
                    System.out.println("Se agotaron las cartas de Poker :(");
                    miDeck.jugar = false;
                }
                break;
            case 3:


                miDeck.pick();
                if (miDeck.baraja.isEmpty()){
                    System.out.println("Se agotaron las cartas de Poker :(");
                    miDeck.jugar = false;
                }
                break;
            case 4:


                miDeck.hand();
                if (miDeck.baraja.size() <5){
                    System.out.println("Se agotaron las cartas de Poker :(");
                    miDeck.jugar = false;
                }
                break;

        }

    }
    public void opcion() throws Exception {

        do {
            showMenuu();
            try {
                var caso = ask();
                if (caso < 0 || caso > 4) {
                    System.out.println("----------------------------");
                    throw new Exception("Opción No Valida");


                }
                showMenu(caso);

            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        } while (miDeck.jugar == true);
    }


    public static void main(String[] args)throws Exception {
        System.out.println("");
        System.out.println("¡Bienvenido a Poker!");
        System.out.println("");

        Main Menu = new Main();
        Menu.opcion();
    }
}