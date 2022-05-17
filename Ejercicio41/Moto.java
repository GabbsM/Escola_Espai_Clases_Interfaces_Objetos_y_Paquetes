package Ejercicio41;

public class Moto extends Vehiculo {

    private String tipoMoto;
    private int numRuedas;

    public Moto(String color, int caballos, String marca, String modelos, String tipoMoto, int numRuedas) {
        super(color, caballos, marca, modelos);
        this.tipoMoto = tipoMoto;
        this.numRuedas = numRuedas;
    }

    public Moto() {

    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String toString() {
        return "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelos() + "\n" +
                "Caballos: " + getCaballos() + "\n" +
                "Color: " + getColor() + "\n" +
                "Numero de ruedas: " + getNumRuedas() + "\n" +
                "Tipo de motocicleta: " + getTipoMoto();
    }

}