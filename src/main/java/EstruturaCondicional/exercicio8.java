package EstruturaCondicional;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double salario = 0;
        double imposto = 0;

        System.out.println("Informe o salario: ");
        salario = sc.nextDouble();
        if (salario <= 2000){
            imposto = 0;
        }else if (salario <= 3000){
            imposto = (salario - 2000) * 0.08;
        }else if (salario <= 4500 ){
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        }else{
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }
        if (imposto == 0){
            System.out.println("Isento");
        }else{
            System.out.println(imposto);
        }

        sc.close();

    }
}
