package Ejercicio41;

public class Vehiculo {

    private String color;
    private int caballos;
    private String marca;
    private String modelos;

    public Vehiculo(String color, int caballos, String marca, String modelos) {
        this.color = color;
        this.caballos = caballos;
        this.marca = marca;
        this.modelos = modelos;
    }

    public Vehiculo() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }
}
