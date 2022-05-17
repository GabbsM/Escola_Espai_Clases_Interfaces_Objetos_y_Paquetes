package Ejercicio51;

//Problema 51
//Haz un programa que genere 100 números aleatorios, luego los ordene por orden de menor a
//mayor y los muestre por pantalla. Para hacerlo deberás utilizar en la clase de tu programa, una
//clase que llamarás Ordenacion que implementará la interface creada en el ejercicio anterior.

import java.util.ArrayList;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        Ordenacion n = new Ordenacion();
        n.ordenar();


    }

}
