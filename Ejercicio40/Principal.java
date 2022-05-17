package Ejercicio40;

//   //Problema 40
//    //Haz lo mismo del ejercicio anterior, esta vez guardando 1 coche y 1 moto en variables tipo
//    //producto. Explica también las ventajas y desventajas de esta acción.
public class Principal {

    public static void main(String[] args) {

        Moto moto = new Moto();
        Producto producto = moto;

        Coche coche = new Coche();
        Producto producto2 = coche;

        // Al instanciar un producto desde la variable PRODUCTO nos permite acceder a los metodos de
        // la interfaz.
    }


}
