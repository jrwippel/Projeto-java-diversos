package EstruturaSequencial;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int codigo;
        int qtde;
        double valor, total1, total2, total;
        codigo = sc.nextInt();
        qtde = sc.nextInt();
        valor = sc.nextDouble();
        total1 = qtde * valor;

        codigo = sc.nextInt();
        qtde = sc.nextInt();
        valor = sc.nextDouble();
        total2 = qtde * valor;
        total = total1 + total2;

        System.out.println("VALOR A PAGAR: "+total);

        sc.close();




    }
}
