package Ejercicio46.es.espai.vehiculos;
import Ejercicio43.Vehiculo;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Esta clase define los parámetros necesarios para la construccion de un objeto de tipo Coche, que extiende de la
 * clase Vehiculo.. Usamos la anotación Data de Lombok, por lo cual no es necesario que escribamos ni los
 * constructores ni los métodos Getters y Setters.
 * @author: Gabriel Moreno.
 * @version: 13/05/2022. Version 1.0
 */

@Data
@NoArgsConstructor
public class Coche extends Vehiculo {

    private int numPuertas;
    private int capacidadMaletero;

    public Coche(String color, int caballos, String marca, String modelos, int numPuertas, int capacMaletero) {
        super(color, caballos, marca, modelos);
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacMaletero;
    }

    /**
     *
     * @param
     * /Método toString que devuelve la informacion de la clase convertida en cadena de strings.
     */
   /* public String toString(){
        return  "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelos() + "\n" +
                "Caballos: "+ getCaballos() + "\n" +
                "Color: "  + getColor() +  "\n" +
                "Numero de puertas: " + getNumPuertas() + "\n" +
                "Capacidad del maletero: " + getCapacidadMaletero() + " litros";
    }*/

}
