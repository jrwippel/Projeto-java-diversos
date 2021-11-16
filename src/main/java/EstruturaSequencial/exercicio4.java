package EstruturaSequencial;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int numberFunc;
        int horasTrab;
        double valorHora;
        double salario;

        System.out.println("Informe o numero do funcionario:");
        numberFunc = sc.nextInt();

        System.out.println("Informe as horas trabalhadas do funcionario:");
        horasTrab = sc.nextInt();

        System.out.println("Informe o valor da hora:");
        valorHora = sc.nextDouble();

        salario = horasTrab * valorHora;

        System.out.println("Number:"+ numberFunc);
        System.out.println("Salario:U$" +salario);

        sc.close();
    }
}
