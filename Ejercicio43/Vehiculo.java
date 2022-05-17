package Ejercicio43;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * Esta clase define los parámetros necesarios para la construccion de un objeto de tipo Vehiculo, que sera la clase
 * padre de las clases Coche y Moto. Usamos la anotación Data de Lombok, por lo cual no es necesario que escribamos
 * ni losconstructores ni los métodos Getters y Setters.
 *  @author: Gabriel Moreno.
 * @version: 13/05/2022. Version 1.0
 */
public class Vehiculo {

    private String color;
    private int caballos;
    private String marca;
    private String modelos;

}
