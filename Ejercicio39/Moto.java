package Ejercicio39;

public class Moto extends Vehiculo {
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

    public int getRuedas() {
        return ruedas;
    }

    public String getTipo() {
        return tipo;
    }
}
