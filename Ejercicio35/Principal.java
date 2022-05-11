package Ejercicio35;

//Problema 35
//Crea una clase dentro de Coche que se llamará Radio. Esta clase debe tener los métodos
//encender(), apagar() y sintonizar(). Después, usa esta clase desde el programa principal.

public class Principal {

    public static void main(String[] args) {

        //Instanciamos objeto de clase Radio
        Coche.Radio radio = new Coche.Radio();

        //Llamamos a los metodos de radio
        radio.encender();
        radio.apagar();
        radio.sintonizar();
    }
}
