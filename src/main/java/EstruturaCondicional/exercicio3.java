package EstruturaCondicional;

import java.util.Scanner;

public class exercicio3 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Informe valores multiplos:");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x % y == 0 || y % x == 0){
            System.out.println("São Multiplos");
        }else{
            System.out.println("Não são multiplos");
        }

        sc.close();
    }

}
