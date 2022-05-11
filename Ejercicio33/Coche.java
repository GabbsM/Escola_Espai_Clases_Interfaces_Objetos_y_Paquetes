package Ejercicio33;

import Ejercicio30.Vehiculo;

//Problema 33
//Asumiendo que has creado numPuertas de esta manera: Public int numPuertas = 5. Modifícala,
//y hazla “final”. Qué sucede cuando intentas asignar un valor a la variable desde Main?

public class Coche extends Vehiculo {



    public final int numPuertas = 5;
    public int capacidadMaletero;


    public Coche(){

    }


    public Coche(int numPuertas, int capacidadMaletero) {
       // this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }


    public Coche(String color, int caballos, String marca, String modelos, int numPuertas, int capacidadMaletero) {
        super(color, caballos, marca, modelos);
       // this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }
}
