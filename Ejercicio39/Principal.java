package Ejercicio39;

//Problema 39
//En un programa crea 1 objeto tipo Coche y otro Moto, y guárdalos en variables tipo Vehículo.
//¿Qué ventajas tiene hacer algo así? ¿Y desventajas?

public class Principal {

    //En este caso estamos usando el polimorfismo y una de sus ventajas es que se puede instanciar
    // un objeto de una clase diferente desde la clase de la que ha heredado. En este caso estamos
    //instanciando un objeto Coche y otro Moto, pero lo hacemos desde la clase Vehiculo, que es de la
    //que heredan.

    public static void main(String[] args) {

        Coche coche = new Coche();
        Vehiculo uno = new Vehiculo();
        uno = (Vehiculo) coche;

        Moto moto = new Moto();
        Vehiculo dos = new Vehiculo();
        dos = (Vehiculo) moto;




    }
}
