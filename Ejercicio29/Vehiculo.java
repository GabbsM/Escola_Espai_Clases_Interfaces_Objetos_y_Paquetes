package Ejercicio29;

public class Vehiculo {

    //Declaramos los campos de clase pero esta vez encapsularemos dos atributos como "private" y
    //otros dos como "protected" para demostrar que pasa con ellos.

    protected String color;
    private int caballos;
    protected String marca;
    private String modelo;

    //Declaramos constructor vacio
    public Vehiculo(){

    }

    //Declaramos constructor con los atributos
    public Vehiculo(String color, int caballos, String marca, String modelo) {
        this.color = color;
        this.caballos = caballos;
        this.marca = marca;
        this.modelo = modelo;
    }
}
