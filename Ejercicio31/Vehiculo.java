package Ejercicio31;

public class Vehiculo {

    private String color;
    private int caballos;
    private String marca;
    private String modelos;

    //Declaramos constructor vacio
    public Vehiculo(){

    }

    //Declaramos constructor con todos los atributos de clase Vehiculo
    public Vehiculo(String color, int caballos, String marca, String modelos) {
        this.color = color;
        this.caballos = caballos;
        this.marca = marca;
        this.modelos = modelos;
    }
}
