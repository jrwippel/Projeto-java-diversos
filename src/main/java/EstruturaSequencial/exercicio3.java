package EstruturaSequencial;

import java.util.Scanner;

public class exercicio3 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        System.out.println("Informe os valores de A B C e D:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIFERENCA = ((A * B) - (C * D));

        System.out.print("Diferença:"+ DIFERENCA);


        sc.close();

    }

}
