package Ejercicio30;
//Problema 30
//Crea una clase Coche, que heredará de Vehículo, y además contendrá las siguientes variables:
//- numPuertas
//- capacidadMaletero
//Nota: En este caso sin ningún modificador

// Usamos la palabra reservada para indicar que la nueva clase Coche va a heredar de la clase Vehiculo.
public class Coche extends Vehiculo {


    //Declaramos las dos nuevas variables exclusivas de la clase Coche
    private int numPuertas;
    private int capacidadMaletero;

    //Realizamos constructor vacio
    public Coche(){

    }

    //Realizamos constructor con los atributos exclusivos de clase.
    public Coche(int numPuertas, int capacidadMaletero) {
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }

    //Realizamos constructor con todos los atributos totales.
    public Coche(String color, int caballos, String marca, String modelos, int numPuertas, int capacidadMaletero) {
        super(color, caballos, marca, modelos);
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }
}
