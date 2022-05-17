package Ejercicio49.numeros;

import java.text.NumberFormat;

//Problema 49
//Crea una clase llamada FormatNumeros que estará en un paquete llamado numeros que incluirá
//cuatro métodos estáticos sobrecargados. Los métodos se llamarán formatNum, Uno recibirá un
//parámetro de tipo int, otro de tipo long, otro de tipo float y el último de tipo double. Estos
//métodos devolverán el número pasado como parámetro en forma de un objeto String con
//formato. Es decir, sí al primer método mencionado se le pasa el número 3400500 debería
//devolver el objeto String «3.400.500».
public class Principal {

    public static void main(String[] args) {

        FormatNumeros fn = new FormatNumeros();
        int a = 5000;
        long b = 50000000;
        float c = (float) 5000.34;
        double d = 500000000.3422;

        System.out.println(a + " queda " + fn.formatNum(a));
        System.out.println(b + " queda " + fn.formatNum(b));
        System.out.println(c + " queda " + fn.formatNum(c));
        System.out.println(d + " queda " + fn.formatNum(d) );

    }

    public static class FormatNumeros{

        static NumberFormat nf = NumberFormat.getInstance();
        public static String numeroFormateado = "";

        public String formatNum(int num){
            long nv = (long)num;
            numeroFormateado = nf.format(num);
            return (numeroFormateado);
        }

        public String formatNum(long num){
            numeroFormateado = nf.format(num);
            return (numeroFormateado);
        }

        public String formatNum(float num){
            numeroFormateado = nf.format(num);
            return (numeroFormateado);
        }

        public String formatNum(double num){
            numeroFormateado = nf.format(num);
            return (numeroFormateado);
        }

    }


}
