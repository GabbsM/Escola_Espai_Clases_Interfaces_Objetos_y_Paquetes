package Ejercicio41;

//Problema 41
//Haz un programa que genere un array de 5 Vehículos. El usuario podrá escoger si desea un
//Coche o una Moto, y deberá rellenar los datos necesarios para crear el objeto. Al final, muestra
//por pantalla el contenido del array (pregunta al profesor por la función toString()).

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        Vehiculo vehiculo[] = new Vehiculo[3];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("Selecciona: 1. Coche / 2. Moto ");
            int opcion = sc.nextInt();
            if(opcion == 1){

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
                vehiculo[i] =  coche;
            }else {
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
                vehiculo[i] =  moto;
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println(vehiculo[i].toString());
            System.out.println(" ");


        }


    }




    }

