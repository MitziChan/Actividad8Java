package com.mitzitec;
import java.util.ArrayList;

public class Card {
    
    private String palo;
    private String color;
    private String valor;

    

    Card(String palo,String color){
        this.palo = palo;
        this.color = color;
    }



    public void setValor(Integer valor) {
        if(valor <= 10){
            if(valor == 1) this.valor = "A";
            this.valor = valor.toString();
        }else {
            if(valor == 11) this.valor = "J";
            else if(valor == 12) this.valor = "Q";
            else this.valor = "K";
        }
    }

    @Override
    public String toString() {
        String mensaje = "%s, %s, %s";
        return String.format(mensaje,palo,color,valor);
    }

}
