package Ejercicio48;

import java.util.Scanner;

public class CalculoNumeros {
    private float num1;
    private float num2;
    private float num3;
    private float num4;

    public CalculoNumeros(){

    }

    Scanner sc = new Scanner(System.in);
    public void agregarNumeros(){
        System.out.println("Numero 1: ");
        num1=sc.nextInt();
        System.out.println("Numero 2: ");
        num2=sc.nextInt();
        System.out.println("Numero 3: ");
        num3=sc.nextInt();
        System.out.println("Numero 4: ");
        num4=sc.nextInt();
        System.out.println("El numero mayor es es " + mayor());
        System.out.println("El numero menor es es " + menor());
        media();
    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public float getNum3() {
        return num3;
    }

    public float getNum4() {
        return num4;
    }

    public float menor(){
        return Math.min(num1,Math.min(num2,Math.min(num3,num4)));
    }

    public float mayor(){
        return  Math.max(num1,Math.max(num2,Math.max(num3,num4)));
    }

    public void media(){
        float media;
        media = num1 + num2 + num3 + num4 / 4;
        System.out.println("La media de los 4 numeros es " + media);
    }
}
