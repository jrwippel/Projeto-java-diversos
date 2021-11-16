package EstruturaCondicional;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int horainicial, horafinal, totalhoras;

        System.out.println("Informe a hora inicial e final:");
        horainicial = sc.nextInt();
        horafinal = sc.nextInt();

        if (horafinal < horainicial){
            totalhoras = (24 - horainicial) + horafinal;
        }else{
            if (horafinal == horainicial){
                totalhoras = 24;

            }else{
                totalhoras = horafinal - horainicial;
            }
        }
        System.out.println("O Jogo durou:"+totalhoras);
        sc.close();
    }
}
