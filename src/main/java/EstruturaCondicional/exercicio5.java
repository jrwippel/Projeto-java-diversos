package EstruturaCondicional;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int codigo, qtde;
        double totalpagar = 0.0;

        System.out.println("Informe o codigo do item e quantidade:");
        codigo = sc.nextInt();
        qtde = sc.nextInt();

        if (codigo == 1){
            totalpagar = qtde * 4;
        }else if (codigo == 2){
            totalpagar = qtde * 4.5;
        }else if (codigo == 3){
            totalpagar = qtde * 5;
        }else if (codigo == 4){
            totalpagar = qtde * 2;
        }else if (codigo == 5){
            totalpagar = qtde * 1.5;
        }
        System.out.println("Total:"+ totalpagar);
    }
}
