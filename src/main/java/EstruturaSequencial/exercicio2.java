package EstruturaSequencial;

import java.util.Scanner;

public class exercicio2 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double a;
        double valor_tt = 3.14159;
        double calculo, raiz_quadrada;
        System.out.println("Informe o valor do raio:");
        a = sc.nextDouble();
        raiz_quadrada = (Math.pow(a, 2));
        calculo = valor_tt * raiz_quadrada;
        System.out.printf("A area do Raio é:"+ "%.4f%n", calculo);
        sc.close();
    }
}
