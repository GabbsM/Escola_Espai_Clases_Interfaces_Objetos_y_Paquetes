package Ejercicio43;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Esta clase define los parámetros necesarios para la construccion de un objeto de tipo Moto, que extiende de la
 * clase Vehiculo.. Usamos la anotación Data de Lombok, por lo cual no es necesario que escribamos ni los
 * constructores ni los métodos Getters y Setters.
 * @author: Gabriel Moreno.
 * @version: 13/05/2022. Version 1.0
 */

@Data
@NoArgsConstructor
public class Moto extends Vehiculo {

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String tipo;
    private int numRuedas;

    public Moto(String color, int caballos, String marca, String modelos, String tipoMoto, int numRuedas) {
        super(color, caballos, marca, modelos);
        this.tipo = tipoMoto;
        this.numRuedas = numRuedas;
    }

    /**
     *
     * @param
     * /Método toString que devuelve la información de la clase convertida en cadena de strings.
     */
  /*  public String toString(){
        return  "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelos() + "\n" +
                "Caballos: " + getCaballos() + "\n" +
                "Color: " + getColor() + "\n" +
                "Numero de ruedas: " + getNumRuedas() + "\n" +
                "Tipo de motocicleta: " + getTipo();
    }*/
}
