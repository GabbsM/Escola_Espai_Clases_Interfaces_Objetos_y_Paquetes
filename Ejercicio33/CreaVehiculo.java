package Ejercicio33;
import Ejercicio27.Vehiculo;

public class CreaVehiculo {
//Problema 33
//Asumiendo que has creado numPuertas de esta manera: Public int numPuertas = 5. Modifícala,
//y hazla “final”. Qué sucede cuando intentas asignar un valor a la variable desde Main?

    public static void main(String[] args) {

          Coche coche = new Coche();
       // coche.numPuertas = 3;


        //RESPUESTA:
        //Cuando quiero definir el numero de puertas me da un error porque en la clase Coche
        //esta declarado como "final" con un valor 5 y es inamovible.







    }

}