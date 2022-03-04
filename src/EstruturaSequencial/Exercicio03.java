package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);


        double numeroUm;
        double numeroDois;
        double div;
        System.out.println("Digite um Numero: ");
        numeroUm = nc.nextInt();

        System.out.println("Digite um Numero: ");
        numeroDois = nc.nextInt();

        div = numeroUm / numeroDois;

        System.out.println("A Divisão dos números é : " + div);


    }


}
