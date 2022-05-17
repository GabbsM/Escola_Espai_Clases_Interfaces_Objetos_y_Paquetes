package Ejercicio47;

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

        //Instanciamos objeto de la clase CalculoNumeros
        CalculoNumeros numeros = new CalculoNumeros();

        //Llamamos al metodo setNumeros para rellenar el objeto instanciado
        numeros.setNumeros(43,67,21,67);

        //Llamamos al metodo getNum de cada uno de los objetos para imprimirlos
        System.out.println(numeros.getNum1());
        System.out.println(numeros.getNum2());
        System.out.println(numeros.getNum3());
        System.out.println(numeros.getNum4());

        //Sacamos el mayor de los numeros
        System.out.println("El numero mayor es es " + numeros.mayor());

        //Sacamos el menor de los numeros
        numeros.menor();
        System.out.println("El numero menor es es " + numeros.menor());
        //Sacamos la media de todos los numeros
        numeros.media();
    }
}
