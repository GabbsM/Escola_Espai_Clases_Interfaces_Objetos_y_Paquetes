package Ejercicio36;

import Ejercicio30.Vehiculo;

public class Coche extends Vehiculo implements Producto {


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

    // Al implementar la interface Producto, esta nos obliga a usar sus metodos.
    @Override
    public void getPrecio() {

    }

    @Override
    public void getDescripcion() {

    }

    static class Radio{

        public void encender(){
            System.out.println("Encendemos la radio");

        }

        public void apagar( ){
            System.out.println("Apagamos la radio");

        }

        public void sintonizar( ){
            System.out.println("Sintonizamos la radio");
        }
    }
}
