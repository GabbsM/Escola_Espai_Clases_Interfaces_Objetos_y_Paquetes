package Ejercicio27;

//Problema 27
//Crea la clase vehículo, que contendrá los atributos (variables) siguientes:
//- Color
//- Caballos
//- Marca
//- Modelo
//Decide tú mismo el tipo de dato de cada variable, y hazlas todas “public” para que sean
//accesibles desde fuera de la clase.
//Crea un constructor por defecto y otro que tenga por parámetros todos los anteriores atributos.

public class Vehiculo {

    //Declaramos los campos de clase
    public String color;
    public int caballos;
    public String marca;
    public String modelo;

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
