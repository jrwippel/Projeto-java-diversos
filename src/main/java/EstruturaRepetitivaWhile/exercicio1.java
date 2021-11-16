package EstruturaRepetitivaWhile;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha;

        System.out.println("Informe a senha de acesso: ");
        senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Acesso não permitido");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();

    }

}