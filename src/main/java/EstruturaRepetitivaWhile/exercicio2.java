package EstruturaRepetitivaWhile;

import java.util.Scanner;

public class exercicio2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Informe o valor de X e Y:");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0 ){

            if (x < 0 && y < 0){
                System.out.println("Terceiro");
            }else if (x > 0 && y < 0){
                System.out.println("Quarto");
            }else if (x > 0 && y > 0){
                System.out.println("Primeiro");
            }else if (x < 0 && y > 0){
                System.out.println("Segundo");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
