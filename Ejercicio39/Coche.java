package Ejercicio39;

public class Coche extends Vehiculo{

    private int numPuertas;
    private int capacidadMaletero;

    public Coche(){

    }

    public Coche(int numPuertas, int capacidadMaletero) {
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }

    public Coche(String color, int caballos, String marca, String modelos, int numPuertas, int capacidadMaletero) {
        super(color, caballos, marca, modelos);
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }
}
