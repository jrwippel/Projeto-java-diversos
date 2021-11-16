package EstruturaCondicional;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("Informe o valor:");
        x = sc.nextDouble();

        if (x > 0 || x < 100) {
            if (x >= 0 && x <= 25) {
                System.out.println("INtervalo (0.25)");
            } else if (x > 25 && x <= 50) {
                System.out.println("INtervalo (25.50)");
            } else if (x > 50 && x <= 75) {
                System.out.println("INtervalo (25.50)");
            } else if (x > 75 && x <= 100) {
                System.out.println("INtervalo (75.100)");
            }
        }else{
            System.out.println("Fora do Intervalo");
        }

        sc.close();


    }
}
