package Ejercicio41;

import java.util.Scanner;

public class Coche extends  Vehiculo{

    private int numPuertas;
    private int capacMaletero;

    public Coche(){
        super();

    }


    public Coche(String color, int caballos, String marca, String modelos, int numPuertas, int capacMaletero) {
        super(color, caballos, marca, modelos);
        this.numPuertas = numPuertas;
        this.capacMaletero = capacMaletero;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCapacMaletero() {
        return capacMaletero;
    }

    public void setCapacMaletero(int capacMaletero) {
        this.capacMaletero = capacMaletero;
    }

    public void agregarCoche(){

        Vehiculo vehiculo[] = new Vehiculo[3];
        Scanner sc = new Scanner(System.in);

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


    }
    @Override
    public String toString() {
        return "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelos() + "\n" +
                "Caballos: "+ getCaballos() + "\n" +
                "Color: "  + getColor() +  "\n" +
                "Numero de puertas: " + getNumPuertas() + "\n" +
                "Capacidad del maletero: " + getCapacMaletero() + " litros";
    }
}
