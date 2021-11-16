package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, soma;
        a = sc.nextInt();
        b = sc.nextInt();
        soma = a +b;
        System.out.println("A Soma de A e B é igual:"+soma);
        sc.close();
    }
}
