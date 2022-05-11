package Ejercicio34;
//Problema 34
//En la clase Coche, haz un cambio: Haz static la variable capacidadMaletero. Después, ves a la
//clase Main y crea 3 variables tipo coche, asignando a cada una capacidadMaletero distinta. Por
//último muestra el contenido de los 3 objetos coche (con System.out.println) y explica qué ha
//sucedido

import Ejercicio33.Coche;

public class Principal {

    public static void main(String[] args) {

        Ejercicio34.Coche coche = new Ejercicio34.Coche();
        coche.capacidadMaletero = 23;
        Ejercicio34.Coche coche2 = new Ejercicio34.Coche();
        coche2.capacidadMaletero = 68;
        Ejercicio34.Coche coche3 = new Ejercicio34.Coche();
        coche3.capacidadMaletero = 84;

        System.out.println(coche.capacidadMaletero);
        System.out.println(coche2.capacidadMaletero);
        System.out.println(coche3.capacidadMaletero);

        // RESPUESTA:

        //Las 3 variables han mostrado el ultimo valor introducido.
    }
}
