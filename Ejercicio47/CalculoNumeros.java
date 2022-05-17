package Ejercicio47;

public class CalculoNumeros {
    private float num1;
    private float num2;
    private float num3;
    private float num4;

    public CalculoNumeros(){

    }

    public CalculoNumeros(float num1,float num2,float num3,float num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;

    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getNum3() {
        return num3;
    }

    public void setNum3(float num3) {
        this.num3 = num3;
    }

    public float getNum4() {
        return num4;
    }

    public void setNum4(float num4) {
        this.num4 = num4;
    }

    public void setNumeros(float num1,float num2, float num3, float num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
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
