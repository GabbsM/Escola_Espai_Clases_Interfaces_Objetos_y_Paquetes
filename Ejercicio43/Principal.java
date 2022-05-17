package Ejercicio43;

//Problema 43
//Haz el ejercicio 41 de nuevo, pero esta vez usando Vectores en lugar de array, y dejando
//escoger al usuario el número de vehículos que se van a crear.
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal donde llamamos al método Main y crearemos un ArrayList donde iremos metiendo una serie de vehiculos.
 * @author: Gabriel Moreno.
 * @version: 13/05/2022. Version 1.0
 */

public class Principal {

    public static void main(String[] args) {

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Cuantos vehiculos quieres meter?: ");
        int cantidad = sc.nextInt();


        for (int i = 0; i < cantidad ; i++) {
            System.out.println("Elige:  1.Coche / 2. Moto ");
            int opcio = sc.nextInt();
            if(opcio==1){
                System.out.println("Color: ");
                String color = sc.next();
                System.out.println("Caballos: ");
                int caballos = sc.nextInt();
                System.out.println("Marca: ");
                String marca = sc.next();
                System.out.println("Modelo: ");
                String modelo = sc.next();
                System.out.println("Numero de puertas: ");
                int numPuertas = sc.nextInt();
                System.out.println("Capacidad del maletero: ");
                int capMaletero = sc.nextInt();

                Coche coche = new Coche(color,caballos,marca,modelo,numPuertas,capMaletero);
                listaVehiculos.add(coche);

            }
                else {

                System.out.println("Color: ");
                String color = sc.next();
                System.out.println("Caballos: ");
                int caballos = sc.nextInt();
                System.out.println("Marca: ");
                String marca = sc.next();
                System.out.println("Modelo: ");
                String modelo = sc.next();
                System.out.println("Tipo de moto: ");
                String tipo = sc.next();
                System.out.println("Numero de ruedas: ");
                int numRuedas = sc.nextInt();

                Moto moto = new Moto(color,caballos,marca,modelo,tipo,numRuedas);

                listaVehiculos.add(moto);
                }
        }

        for (int i = 0; i < cantidad ; i++) {
            System.out.println();
            System.out.println(listaVehiculos.toString());
            System.out.println();


        }

    }


}
