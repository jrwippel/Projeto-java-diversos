package EstruturaCondicional;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Informe um numero: ");
        x = sc.nextInt();
        if (x > 0) {
            System.out.println("Positivo");
        }else{
            if (x < 0){
                {
                    System.out.println("Negativo");
                }
            }else{
                System.out.println("Não Negativo");
            }
        }
        sc.close();

    }
}
