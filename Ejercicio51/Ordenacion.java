package Ejercicio51;

import java.util.Arrays;

public class Ordenacion implements Ordenar {


    //En el método ordenar, primero llenamos un array de 100 posiciones con numeros randoms entre el 1 y el 100.

    @Override
    public void ordenar() {
        int arreglo[] = new int[100];
        int aux = 0;


        for (int i = 0; i < arreglo.length; i++) {
            double numRandom = Math.random() * 100;
            int arregloRandom = (int) numRandom;
            arreglo[i] = arregloRandom;
        }


        System.out.println("Arreglo sin ordenar:" + "\n");
        System.out.println(Arrays.toString(arreglo));
        System.out.println();

        //Luego, usando el método de la burbuja ordenador el array de menor a mayor.

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i; j < arreglo.length; j++) {

                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }

        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }


    }
}


