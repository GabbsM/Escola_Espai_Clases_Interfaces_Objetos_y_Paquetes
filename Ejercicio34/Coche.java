package Ejercicio34;

import Ejercicio30.Vehiculo;

public class Coche extends Vehiculo {


    public final int numPuertas = 5;
    public static int capacidadMaletero;


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
