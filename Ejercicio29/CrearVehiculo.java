package Ejercicio29;

//Problema 29
//Modifica la clase Vehículo de la siguiente forma: cambia los “public” de las variables por
//“private”. Después intenta ejecutar el Main del ejercicio anterior. ¿Qué sucede? ¿Y si usamos
//“protected”, o nada? Explica el porqué del resultado en cada caso

public class CrearVehiculo {

    public static void main(String[] args) {

        Vehiculo coche2 = new Vehiculo();

        coche2.color = "Rojo";
        coche2.marca = "Ford";


        //Los atributos que estan declarados como "private" no pueden ser llamados desde la clase
        //CrearVehiculos, unicamente desde la clase Vehiculo, mientras que los que estan declarados
        //como "protected" si puesto que se encuentran en el mismo paquete.


    }



}
