package EstruturaSequencial;

import java.util.Scanner;

public class exercicio6 {
    public static void main (String[] args) {
        double A,B,C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO,RETANGULO;
        double pi = 3.14159;


        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();


        CIRCULO = (pi * (Math.pow(C, 2)));
        TRIANGULO = (A * C)/2;
        TRAPEZIO = (((A + B) * C) /2);
        QUADRADO = Math.pow(B,2);
        RETANGULO = A * B;

        System.out.printf("TRIANGULO: "+"%.3f%n",TRIANGULO);
        System.out.printf("CIRCULO: "+"%.3f%n",CIRCULO);
        System.out.printf("TRAPEZIO: "+"%.3f%n",TRAPEZIO);
        System.out.printf("QUADRADO: "+"%.3f%n",QUADRADO);
        System.out.printf("RETANGULO: "+"%.3f%n",RETANGULO);
        sc.close();

    }
}
