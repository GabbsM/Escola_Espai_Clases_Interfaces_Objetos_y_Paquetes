package Ejercicio39;

public class Vehiculo {

    public String color;
    public int caballos;
    public String marca;
    public String modelo;

    public Vehiculo(){

    }


    public Vehiculo(String color, int caballos, String marca, String modelo) {
        this.color = color;
        this.caballos = caballos;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public int getCaballos() {
        return caballos;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
