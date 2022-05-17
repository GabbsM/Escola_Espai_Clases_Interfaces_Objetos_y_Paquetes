package Ejercicio48;

//Problema 47
//Haz una clase a la que llamarás CalculoNumeros. La clase tendrá cuatro atributos de tipo float.
//Estos atributos se podrán establecer a partir del constructor de la clase, o una vez creado el
//objeto, a través de un método que también escribirás (el método se llamará ‘setNumeros’). La
//clase también tendrá cuatro métodos más, para devolver cada uno de los atributos de clase (Los
//métodos se llamarán ‘getNumero1’, ‘getNumero2’, etc.). Además, esta clase tendrá tres
//métodos adicionales para hacer cálculos con los atributos de clase: uno para calcular el mayor,
//otro para calcular el menor y otro para calcular el promedio.

public class Principal {
    public static void main(String[] args) {

     CalculoNumeros numeross = new CalculoNumeros();

     numeross.agregarNumeros();
    }
}
