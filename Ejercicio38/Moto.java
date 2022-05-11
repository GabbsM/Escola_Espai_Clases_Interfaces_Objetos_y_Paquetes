package Ejercicio38;

import Ejercicio27.Vehiculo;
import Ejercicio36.Producto;

public class Moto extends Vehiculo implements Producto {

    private int ruedas;
    private String tipo;

    public Moto (){

    }

    public Moto(int ruedas, String tipo) {
        this.ruedas = ruedas;
        this.tipo = tipo;
    }

    public Moto(String color, int caballos, String marca, String modelo, int ruedas, String tipo) {
        super(color, caballos, marca, modelo);
        this.ruedas = ruedas;
        this.tipo = tipo;
    }

    @Override
    public void getPrecio() {

    }

    @Override
    public void getDescripcion() {

    }
}
