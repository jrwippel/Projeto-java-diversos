package EstruturaCondicional;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double x= 0.0;
        double y= 0.0;

        System.out.println("Informe os valores de X e Y:");

        x=sc.nextDouble();
        y= sc.nextDouble();
        if (x == 0 && y == 0){
            System.out.println("Origem");
        }else if (x < 0 && y < 0){
            System.out.println("Q3");
        }else if (x > 0 && y < 0){
            System.out.println("Q4");
        }else if (x > 0 && y > 0){
            System.out.println("Q1");
        }else if (x < 0 && y > 0){
            System.out.println("Q2");
        }

    }
}
