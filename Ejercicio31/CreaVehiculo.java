package Ejercicio31;
import Ejercicio27.Vehiculo;

//Problema 31
//Modifica el Main que hicimos en el 28, y añade una variable de tipo Coche. Dale valor a
//numPuertas y capacidadMaletero.

public class CreaVehiculo {


    public static void main(String[] args) {

        //Instanciamos un objeto "Vehiculo" asignando valor a los atributos de la clase

        Vehiculo coche1 = new Vehiculo();

        coche1.color = "Azul";
        coche1.caballos = 1900;
        coche1.marca = "Ford";
        coche1.marca = "Focus";

        //Instanciamos un objeto "Coche" asignando valor a los atributos exclusivos de su clase.

        Coche coche2 = new Coche();

        coche2.numPuertas = 5;
        coche2.capacidadMaletero = 150;





    }

}